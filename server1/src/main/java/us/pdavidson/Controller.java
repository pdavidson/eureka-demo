package us.pdavidson;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping
    String home() {
        return "hello world\n" ;
    }

}