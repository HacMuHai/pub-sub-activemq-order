package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.models.Product;
import vn.edu.iuh.fit.repositories.ProductRepository;

@SpringBootApplication
public class Week6Application {

    public static void main(String[] args) {
        SpringApplication.run(Week6Application.class, args);
    }

    @Autowired
    private ProductRepository productRepo;

    @Bean
    CommandLineRunner insertDate(){
        return args -> {
            for (int i = 1; i <= 5; i++) {
                Product p = new Product(i, "Name #" + i, 25 * i, 550000.0 / i);
                productRepo.save(p);
            }
        };
    }

}
