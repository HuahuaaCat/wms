package com.wms;

import com.wms.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class WmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(WmsApplication.class,args);
    }

}