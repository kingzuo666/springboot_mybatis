package com.bigdata.springboot_1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//创建 Application.java，其注解 @SpringBootApplication 
//表示这是一个SpringBoot应用，运行其主方法就会启动tomcat,默认端口是8080
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
