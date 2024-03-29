package com.sbaldass.combo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableOpenApi
@SpringBootApplication
public class ComboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComboApplication.class, args);
    }

}
