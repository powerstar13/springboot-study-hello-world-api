package springboot.study.helloworldapi.controller;

import org.springframework.web.bind.annotation.*;
import springboot.study.helloworldapi.dto.UserRequest;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    // 현재 사용하는 방식
    @GetMapping(path = "hello") // http://localhost:{port}/api/get/hello
    public String hello() {
        return "get Hello";
    }

    // 이전에 사용하던 방식
    @RequestMapping(path = "hi", method = RequestMethod.GET) // GET http://localhost:{port}/api/get/hi
    public String hi() {
        return "hi";
    }

    @GetMapping("path-variable/{name}") // http://localhost:{port}/api/get/path-variable/{name}
    public String pathVariable(@PathVariable String name) {
//    public String pathVariable(@PathVariable(name = "name") String pathName, String name) { // PathVariable의 변수명과 동일한 변수명을 Request로 받고 싶은 경우 name 속성을 사용하여 별도로 사용할 수 있다.

        System.out.println("PathVariable: " + name);

        return name;
    }

    @GetMapping(path = "query-param") // http://localhost:{port}/api/get/query-param?key={key}&key2={key2}&key3={key3}
    public String queryParam(@RequestParam Map<String, String> queryParam) { // Request로 어떤 정보가 들어올지 모르는 경우에 Map으로 받을 수 있다.

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();

            sb.append(entry.getKey());
            sb.append(" = ");
            sb.append(entry.getValue());
            sb.append("\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param2")
    public String queryParam2(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
    ) { // Request의 개수가 적을 경우 이런 형태로 받아도 된다.
        System.out.println("name = " + name);
        System.out.println("email = " + email);
        System.out.println("age = " + age);

        return name + " " + email + " " + age;
    }

    @GetMapping("query-param3")
    public String queryParam3(UserRequest request) { // DTO를 사용하여 QueryParms의 Request를 받을 경우 @RequestParam 애노테이션을 붙이지 않는다.
        System.out.println("name = " + request.getName());
        System.out.println("email = " + request.getEmail());
        System.out.println("age = " + request.getAge());

        return request.toString();
    }
}
