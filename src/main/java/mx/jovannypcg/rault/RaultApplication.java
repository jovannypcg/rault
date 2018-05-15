package mx.jovannypcg.rault;

import mx.jovannypcg.rault.domain.CustomerData;
import mx.jovannypcg.rault.repository.CustomerDataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RaultApplication implements CommandLineRunner {
    private CustomerDataRepository customerDataRepository;

    public RaultApplication(CustomerDataRepository customerDataRepository) {
        this.customerDataRepository = customerDataRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(RaultApplication.class, args);
	}

    @Override
    public void run(String... args) {
        CustomerData customerData = customerDataRepository.getData("spotify");

        System.out.println(" ===> " + customerData);
    }
}
