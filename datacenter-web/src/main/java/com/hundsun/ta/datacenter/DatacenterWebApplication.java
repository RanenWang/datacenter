package com.hundsun.ta.datacenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

import static java.lang.System.*;

/**
 * 启动类
 * @author wangpeng
 */
@SpringBootApplication
@ImportResource({ "classpath:dao/*Mapper.xml"})
@EnableScheduling
@MapperScan("com.hundsun.ta.datacenter.daointerface")
//@ComponentScan(basePackages = { "com.hundsun.ta.datacenter.daointerface" })
public class DatacenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatacenterWebApplication.class, args);


    }
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            out.println("注入如下Bean:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                out.println(beanName);
            }
            out.println("结束注入……");
        };
    }


}
