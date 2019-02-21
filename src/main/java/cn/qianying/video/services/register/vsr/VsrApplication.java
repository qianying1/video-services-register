package cn.qianying.video.services.register.vsr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 程序启动类
 *
 * @Author Nacht
 * Created on 23/11/2018
 */
@EnableEurekaServer
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAutoConfiguration
public class VsrApplication {
    public static void main(String[] args) {
        SpringApplication.run(VsrApplication.class, args);
    }
}