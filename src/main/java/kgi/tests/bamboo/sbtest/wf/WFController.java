package kgi.tests.bamboo.sbtest.wf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kgignatyev on 2/6/16.
 */
@RestController
public class WFController {

    @RequestMapping("/api/wf")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
