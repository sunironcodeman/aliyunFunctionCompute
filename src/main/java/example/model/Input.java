package example.model;

import example.entity.Person;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Input {
    private Integer num;
    private String name;
    private Boolean tag;
    private List<Integer> integerList;
    private Map<String,Integer> stringIntegerMap;
    private Person person;
}
