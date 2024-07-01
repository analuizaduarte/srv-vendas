package vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vendas.domain.entity.Cliente;
import vendas.domain.repository.ClienteRepository;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired ClienteRepository clienteRepository){
        return args -> {
            clienteRepository.saveClient(new Cliente("Ana Luiza"));
            clienteRepository.saveClient(new Cliente("Maria da Silva"));

            List<Cliente> todosClientes = clienteRepository.obterTodos();
            todosClientes.forEach(System.out::println);

            todosClientes.forEach(c -> {
                c.setNome(c.getNome()+" atualizado");
                clienteRepository.atualizar(c);
            });

            todosClientes = clienteRepository.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("Deletar clientes");
            todosClientes.forEach(c -> {
                clienteRepository.deletar(c.getId());
            });
            todosClientes = clienteRepository.obterTodos();
            todosClientes.forEach(System.out::println);

        };
    }
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}