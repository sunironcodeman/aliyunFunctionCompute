package example;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.PojoRequestHandler;
import com.aliyun.fc.runtime.StreamRequestHandler;
import example.config.DataBaseConfig;
import example.entity.Person;
import example.model.Input;
import example.model.Output;
import org.apache.commons.dbutils.QueryRunner;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.Collectors;

public class FCController implements PojoRequestHandler<Input, Output> {

    @Override
    public Output handleRequest(Input input, Context context){
        String sql = "";
        QueryRunner queryRunner = new QueryRunner(DataBaseConfig.dbConfig());
//        queryRunner.query(sql,);
        return Output.builder()
                .length(input.getIntegerList().size())
                .welcome("Hello "+ input.getName())
                .ifSuccess(!input.getTag())
                .integerList(input.getIntegerList().stream().map(l -> l+2).collect(Collectors.toList()))
                .stringIntegerMap(input.getStringIntegerMap())
                .person(new Person(100,"female")).build();
    }

    public static void main(String[] args){}
}
