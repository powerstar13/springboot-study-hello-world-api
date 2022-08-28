package springboot.study.helloworldapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {

    private String account;
    private String email;
    private String address;
    private String password;

    @JsonProperty("phone_number") // @JsonProperty 애노테이션을 사용하면 client가 전달한 변수명을 dto로 받을 변수명으로 매핑해줄 수 있다.
    private String phoneNumber;

    @Override
    public String toString() {
        return "PostRequest{" +
            "account='" + account + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            ", password='" + password + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            '}';
    }
}
