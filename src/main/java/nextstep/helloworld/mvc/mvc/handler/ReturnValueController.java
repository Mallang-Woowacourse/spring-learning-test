package nextstep.helloworld.mvc.mvc.handler;

import nextstep.helloworld.mvc.mvc.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/return-value")
public class ReturnValueController {

    @ResponseBody
    @GetMapping("/message")
    public String string() {
        return "message";
    }

    @ResponseBody
    @GetMapping("/users")
    public User responseBodyForUser() {
        return new User("name", "email");
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> responseEntity(@PathVariable Long id) {
        return ResponseEntity.ok(new User("name", "email"));
    }

    @GetMapping("/members")
    public ResponseEntity<?> responseEntityFor400() {
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/thymeleaf")
    public String thymeleaf() {
        return "sample";
    }
}
