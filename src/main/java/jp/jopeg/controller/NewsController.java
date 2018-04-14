package jp.jopeg.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Igor Bisarnov
 *         i.bisarnov@innopolis.ru
 */

@RestController
@RequestMapping(path = "monitoring")
public class NewsController {

    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public ResponseEntity<String> update(@RequestBody String request) {
        return ResponseEntity.ok(request);
    }
}
