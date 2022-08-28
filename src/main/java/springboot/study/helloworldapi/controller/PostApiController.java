package springboot.study.helloworldapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.study.helloworldapi.dto.PostRequest;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> request) {

        request.forEach((key, value) -> {
            System.out.println("key = " + key);
            System.out.println("value = " + value);
            System.out.println();
        });
    }

    @PostMapping("/post-request")
    public void postRequest(@RequestBody PostRequest request) { // Post Method일 경우 @RequestBody 애노테이션으로 받을 수 있다.
        System.out.println(request.toString());
    }
}
