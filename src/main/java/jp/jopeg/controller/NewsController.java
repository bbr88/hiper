package jp.jopeg.controller;

import jp.jopeg.service.AimeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author Igor Bisarnov
 *         i.bisarnov@innopolis.ru
 */

@RestController
@RequestMapping(path = "monitoring")
public class NewsController {

    private final AimeeService aimeeService;

    @Autowired
    public NewsController(AimeeService aimeeService) {
        this.aimeeService = aimeeService;
    }

    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public String update(@RequestBody String request) {
        try {
            return aimeeService.askQuestion(request);
        } catch (IOException e) {
            e.printStackTrace();
            return "blea";
        }
    }

}
