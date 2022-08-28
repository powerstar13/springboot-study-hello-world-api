package springboot.study.helloworldapi.controller;

import org.springframework.web.bind.annotation.*;
import springboot.study.helloworldapi.dto.PutRequest;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequest put(@RequestBody PutRequest request, @PathVariable(name = "userId") Long id) {

        System.out.println("id = " + id);
        System.out.println(request);

        return request;
    }
}

