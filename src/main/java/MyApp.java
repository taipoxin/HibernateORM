import dao.ClientsRepository;
import mapping.ClientsEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages={"dao"})
public class MyApp {

    private static final Logger log = LoggerFactory.getLogger(MyApp.class);


    public static void main(String[] args) {
        // NoSuchMethodError: org.springframework.data.repository.config.AnnotationRepositoryConfigurationSource.<init>
        SpringApplication.run(MyApp.class);
        //SomeClient client = new SomeClient();
        //client.doSomething();

    }

    @Bean
    public CommandLineRunner demo(ClientsRepository clientsRepository) {
        return (args) -> {
            // save a couple of customers
            clientsRepository.save(new ClientsEntity());

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (ClientsEntity entity : clientsRepository.findAll()) {
                log.info(entity.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            ClientsEntity customer = clientsRepository.findByLogin("poor_user");
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            log.info("");
        };
    }
}