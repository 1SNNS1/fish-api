package com.fish.fishclientsdk;


import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("fish.client")
@Data
@ComponentScan
public class FishClientSdkApplication {

    private String accessKey;

    private String secretKey;
    public static void main(String[] args) {
        SpringApplication.run(FishClientSdkApplication.class, args);
    }

}
