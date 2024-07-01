package vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class MinhaConfiguration {
    @Bean
    public CommandLineRunner execute(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");};
    }
}
