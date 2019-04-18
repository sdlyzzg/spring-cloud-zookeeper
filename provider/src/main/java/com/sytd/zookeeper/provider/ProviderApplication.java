package com.sytd.zookeeper.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类功能描述
 *
 * @author 朱宗刚
 * @version 1.0.0
 * @since 1.0.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ProviderApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }
}
