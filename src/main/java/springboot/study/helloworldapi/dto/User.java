package springboot.study.helloworldapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // ObjectMapper가 getter를 활용한다.
@Builder
@NoArgsConstructor // ObjectMapper는 default 생성자를 필요로 한다.
@AllArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL) // 포함시킬 값의 룰을 지정할 수 있다.
public class User {

    private String name;
    private Integer age;
    private String phoneNumber;
    private String address;

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", address='" + address + '\'' +
            '}';
    }
}
