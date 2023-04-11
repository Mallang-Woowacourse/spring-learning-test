package nextstep.helloworld.mvc.mvc.exceptions;

import nextstep.helloworld.mvc.mvc.exceptions.exception.HelloException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HelloAdvice {

    @ExceptionHandler(value = {HelloException.class})
    public ResponseEntity<String> handle() {
        return ResponseEntity.badRequest().body("HelloException");
    }
}
