package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/api/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

