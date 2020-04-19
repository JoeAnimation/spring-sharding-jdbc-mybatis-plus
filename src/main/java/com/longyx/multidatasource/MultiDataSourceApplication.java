package com.longyx.multidatasource;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 去掉自动注册(主程序入口)
 * @author Mr.Longyx
 * @date 2020年01月11日 14:16
 */
@SpringBootApplication(exclude = {PageHelperAutoConfiguration.class})
public class MultiDataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiDataSourceApplication.class);
        System.out.println("程序正在运行...");
    }
}
