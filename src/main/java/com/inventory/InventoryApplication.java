package com.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
	@OpenAPIDefinition(
    info = @Info(title = "Your API", version = "1.0.0", description = "API Documentation"),
    servers = {
        @Server(url = "https://satisfied-magic-production.up.railway.app", description = "Production Server")
    }
)
	
	
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

}
