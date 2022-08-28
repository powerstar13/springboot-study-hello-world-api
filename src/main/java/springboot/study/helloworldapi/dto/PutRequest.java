package springboot.study.helloworldapi.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class) // 해당 클래스에 일괄적으로 룰을 잡아줄 수 있다.
public class PutRequest {

    private String name;
    private int age;
    private List<CarDto> carList;

    @Override
    public String toString() {
        return "PutRequest{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", carList=" + carList +
            '}';
    }
}
