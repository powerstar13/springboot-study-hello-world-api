package springboot.study.helloworldapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import springboot.study.helloworldapi.dto.User;

@SpringBootTest
class SpringbootStudyHelloWorldApiApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {

        System.out.println("===== ObjectMapper 사용하기 =====");
        // ObjectMapper의 사용 사례
        // 1. Text JSON -> Object
        // 2. Object -> Text JSON
        // 3. Controller Request Json(text) -> Object
        // 4. Response Object -> Json(text)

        var objectMapper = new ObjectMapper();

        // object -> text로 매핑하기
        var user = User.builder()
            .name("master")
            .age(10)
            .phoneNumber("010-1234-1234")
            .build();

        var text = objectMapper.writeValueAsString(user); // ObjectMapper가 getter를 활용한다.
        System.out.println("text = " + text);

        // text -> Object로 매핑하기
        var objectUser = objectMapper.readValue(text, User.class); // ObjectMapper는 default 생성자를 필요로 한다.
        System.out.println("objectUser = " + objectUser);

        // WARN: ObjectMapper를 사용할 경우 변수와 관련 없는 get*() 메서드를 만들면 ERROR 발생하니 get 키워드를 피해야 한다.
    }

}
