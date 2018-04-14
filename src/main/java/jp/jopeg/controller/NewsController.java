package jp.jopeg.controller;

import jp.jopeg.service.AimeeService;
import org.springframework.beans.factory.annotation.Autowired;
import jp.jopeg.model.ProductType;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author Igor Bisarnov
 * i.bisarnov@innopolis.ru
 */

@RestController
@RequestMapping(path = "monitoring")
public class NewsController {

    private final AimeeService aimeeService;
    private ProductType productType = new ProductType(false);

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

    @RequestMapping(value = "/type", method = RequestMethod.POST)
    public ResponseEntity updateType(@RequestBody String request) {
        boolean value = request.contains("true");
        productType.setInsurance(value);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/type", method = RequestMethod.GET)
    public ResponseEntity<ProductType> getType() {
        return new ResponseEntity<>(productType, HttpStatus.OK);
    }
}
