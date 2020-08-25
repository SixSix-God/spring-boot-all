package com.ntm.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName ApplicationProperty
 * @Author Tian
 * @Date 2020/8/25 14:36
 * @Description 项目配置
 * @Version 1.0
 */
@Data
@Component
public class ApplicationProperty {
    @Value("application.name")
    private String name;
    @Value("application.version")
    private String version;
}
