package org.lszjaf.dagger.servicedubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo//这个注解不能少
public class ServiceDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDubboConsumerApplication.class, args);
    }

}

