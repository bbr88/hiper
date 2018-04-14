package jp.jopeg.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Igor Bisarnov
 *         i.bisarnov@innopolis.ru
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionResponseDto implements Serializable {
    private String question;
    private String answer;
    private Double score;
}


