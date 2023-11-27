package utn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import utn.model.Cliente;
import utn.repositorio.ClienteRepo;

@SpringBootApplication
public class UtnApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtnApplication.class, args);
	}
        @Bean
        public CommandLineRunner initData(ClienteRepo repoClient){
        
        return (args ->{
            
            Cliente cliente1 = new Cliente(31234234, "Juan Perez", "EastBlue 123", "jp@utn.com");
            repoClient.save(cliente1);
            
        });
        }

}
