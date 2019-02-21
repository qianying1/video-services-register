package cn.qianying.video.services.register.vsr;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.WebApplicationInitializer;

@EnableEurekaServer
@SpringBootApplication
public class VsrApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    public static void main(String[] args) {
//        SpringApplication.run(VsrApplication.class, args);
        new SpringApplicationBuilder(VsrApplication.class).run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
