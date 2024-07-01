package vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName") //id do Bean
    public String applicationName(){
        return "Sistema de Vendas";
    }
}
