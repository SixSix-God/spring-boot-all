package com.ntm.SpringBootAllHelloword;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * SpringBoot启动类
 * </p>
 *
 * @description: SpringBoot启动类
 * @author: Tian
 * @date: 2020-08-25 13:27:41
 * @version: V1.0
 */
@RestController
@SpringBootApplication
public class SpringBootAllHellowordApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAllHellowordApplication.class, args);
    }

	/**
	 * @Description Hello，World
	 * @Author Tian
	 * @Date 2020-08-25 14:11:04
	 * @Param who 参数，非必须
	 * @Return Hello, ${who}
	 */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("hello,{}!",who);
    }
}
