package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GoodbyeController {

    @RequestMapping("/api/goodbye")
    public String index() {
        return "Goodbye from Spring Boot!";
    }

}