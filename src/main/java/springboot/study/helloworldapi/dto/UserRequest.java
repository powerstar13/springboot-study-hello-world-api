package springboot.study.helloworldapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter // Client가 보낸 Request 값이 setter를 통해 할당된다.
public class UserRequest {

    private String name;
    private String email;
    private int age;

    @Override
    public String toString() {
        return "UserRequest{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", age=" + age +
            '}';
    }
}
