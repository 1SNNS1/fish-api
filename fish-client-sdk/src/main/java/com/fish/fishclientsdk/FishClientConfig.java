package com.fish.fishclientsdk;


import com.fish.fishclientsdk.client.FishApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("fish.client")
@Data
@ComponentScan
public class FishClientConfig {

    private String accessKey;

    private String secretKey;
    @Bean
    public FishApiClient fishApiClient() {
        return new FishApiClient(accessKey, secretKey);
    }
}
