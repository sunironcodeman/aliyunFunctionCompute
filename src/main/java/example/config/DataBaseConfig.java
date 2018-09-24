package example.config;

import com.alibaba.druid.pool.DruidDataSource;
import example.constant.Constant;

import javax.sql.DataSource;

public class DataBaseConfig {

    public static DataSource dbConfig(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(Constant.URL);
        druidDataSource.setUsername(Constant.USERNAME);
        druidDataSource.setPassword(Constant.PASSWORD);
        druidDataSource.setDriverClassName(Constant.DRIVERCLASS);
        druidDataSource.setMaxActive(Constant.MAXACTIVE);
        return druidDataSource;
    }
}
