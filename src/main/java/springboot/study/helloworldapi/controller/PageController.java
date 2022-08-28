package springboot.study.helloworldapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.study.helloworldapi.dto.User;

@Controller // Page를 띄우고 싶을 경우에는 Controller 애노테이션 사용
public class PageController {

    @RequestMapping("/main")
    public String main() { // return형이 String인 경우 resources/static 경로 안의 파일을 찾아간다.
        return "main.html";
    }

    @ResponseBody // @Controller 애노테이션 하에서 Json Response를 내려주고 싶을 경우 @ResponseBody를 명시하여 return 객체를 설정할 수 있다.
    @GetMapping("/user")
    public User user() {

        var user = User.builder()
            .name("master")
            .address("패스트캠퍼스")
            .build();

        return user;
    }
}
