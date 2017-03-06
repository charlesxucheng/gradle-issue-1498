package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        log.info("Before return");
        return "Greetings from Spring Boot!";
    }
    
}
