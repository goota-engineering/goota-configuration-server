package id.goota.gootaconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class GootaConfigurationServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GootaConfigurationServerApplication.class, args);
	}
}
