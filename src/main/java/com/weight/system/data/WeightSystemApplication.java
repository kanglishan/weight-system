package com.weight.system.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author didi
 * @since 2018/12/22
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.weight.system.data")
public class WeightSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeightSystemApplication.class, args);
    }

}
