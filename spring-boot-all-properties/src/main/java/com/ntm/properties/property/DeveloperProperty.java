package com.ntm.properties.property;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName DeveloperProperty
 * @Author Tian
 * @Date 2020/8/25 14:48
 * @Description 开发人员配置信息
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
