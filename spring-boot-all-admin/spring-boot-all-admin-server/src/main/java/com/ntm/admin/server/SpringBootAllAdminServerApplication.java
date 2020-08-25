package com.ntm.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @description: 启动类
 * @author: Tian
 * @date: 2020-08-25 17:22:46
 * @version: V1.0
 */
@EnableAdminServer
@SpringBootApplication
public class SpringBootAllAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAllAdminServerApplication.class, args);
	}

}
