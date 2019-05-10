package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//该注解的作用是将此服务注册到eureka服务中心
public class MemberApp {
   //消费提供者
	public static void main(String[] args) {
		SpringApplication.run(MemberApp.class, args);
	}

}
