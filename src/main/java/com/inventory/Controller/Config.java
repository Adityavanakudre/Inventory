package com.inventory.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class Config {

    @Bean
    public OpenAPI customOpenAPI() {
        Server productionServer = new Server();
        productionServer.setUrl("https://inventory-fulfillment.up.railway.app");
        productionServer.setDescription("Production Server");

        return new OpenAPI().addServersItem(productionServer);
        
//        issue with the service
    }
}
