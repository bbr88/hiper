package jp.jopeg.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import jp.jopeg.dto.QuestionResponseDto;
import org.springframework.http.*;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import static jp.jopeg.controller.constants.QuestionsWithAnswers.AUTO_NEWS;

/**
 * @author Igor Bisarnov
 *         i.bisarnov@innopolis.ru
 */

@Service
public class AimeeServiceImpl implements AimeeService {

    private final RestTemplate restTemplate = new RestTemplate();

    private static final String URL = "http://40.91.223.127:4560/answer/";

    @Override
    public String askQuestion(String question) throws IOException {
        if ("start".equalsIgnoreCase(question)) {
            return AUTO_NEWS.getQuestion();
        }
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL).queryParam("key", question);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<String> response = restTemplate.exchange(
            builder.toUriString(),
            HttpMethod.GET,
            entity,
            String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        TypeFactory typeFactory = objectMapper.getTypeFactory();
        CollectionType collectionType = typeFactory.constructCollectionType(
            List.class, QuestionResponseDto.class);

        List<QuestionResponseDto> questionListDto = objectMapper.readValue(response.getBody(), collectionType);

        if (questionListDto != null && !questionListDto.isEmpty()) {
//            questionListDto.sort(Comparator.comparing(QuestionResponseDto::getScore));
            questionListDto.sort((o1, o2) -> o2.getScore().compareTo(o1.getScore()));
            return questionListDto.get(0).getAnswer();
        } else {
            return "nihuya";
        }
    }
}
