package id.my.hendisantika.customer.config;

import id.my.hendisantika.customer.model.Customer;
import id.my.hendisantika.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : customer-web
 * User: hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 18/04/25
 * Time: 11.30
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) {
        // Load sample data only if the database is empty
        if (customerRepository.count() == 0) {
            log.info("Loading sample data...");

            customerRepository.save(new Customer("John Doe", "john.doe@example.com"));
            customerRepository.save(new Customer("Jane Smith", "jane.smith@example.com"));
            customerRepository.save(new Customer("Bob Johnson", "bob.johnson@example.com"));
            customerRepository.save(new Customer("Alice Brown", "alice.brown@example.com"));
            customerRepository.save(new Customer("Charlie Davis", "charlie.davis@example.com"));

            log.info("Sample data loaded successfully!");
        }
    }
}