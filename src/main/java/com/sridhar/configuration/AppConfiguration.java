package com.sridhar.configuration;

import com.sridhar.model.Avatar;
import com.sridhar.model.ChaitanyaAvatar;
import com.sridhar.model.KrishnaAvatar;
import com.sridhar.model.RamaAvatar;
import com.sridhar.service.RakshasaSamharaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.sridhar")

public class AppConfiguration {

    @Autowired
    private static RakshasaSamharaService rakshasaSamharaService;

    @Bean
    @Qualifier("krishna")
    public Avatar paripurnaAvatar(){
        return new KrishnaAvatar();
    }

    @Bean
    public Avatar purnaAvatar(){
        return new RamaAvatar();
    }

    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class);
    }

}
