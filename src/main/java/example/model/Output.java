package example.model;

import example.entity.Person;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class Output {
    private Integer length;
    private String welcome;
    private Boolean ifSuccess;
    private List<Integer> integerList;
    private Map<String, Integer> stringIntegerMap;
    private Person person;
}
