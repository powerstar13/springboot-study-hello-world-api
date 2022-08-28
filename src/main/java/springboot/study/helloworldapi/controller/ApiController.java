package springboot.study.helloworldapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.study.helloworldapi.dto.PostUserRequest;

@RestController // 해당 Class는 REST API를 처리하는 Controller로 인식시킨다.
@RequestMapping("/api") // RequestMapping URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") // http://localhost:{port}/api/hello
    public String hello() {
        return "hello spring boot!";
    }

    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account; // TEXt Response
    }

    /**
     * Request -> ObjectMapper -> Object -> Method -> Object -> ObjectMapper -> Json -> Response
     */
    @PostMapping("/json")
    public PostUserRequest json(@RequestBody PostUserRequest request) {
        return request;// JSON Response
    }

    /**
     * 명확하게 Response를 내려주기 위해 ResponseEntity를 사용하면 된다.
     */
    @PutMapping("/put")
    public ResponseEntity<PostUserRequest> put(@RequestBody PostUserRequest request) {

        return ResponseEntity.status(HttpStatus.CREATED) // HttpStatus 201 Json Response
            .body(request);
    }
}
