package com.hundsun.ta.datacenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource({ "classpath*:META-INF/*.xml"})
@MapperScan("com.hundsun.ta.datacenter.daointerface")
public class DatacenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatacenterWebApplication.class, args);
    }
}
