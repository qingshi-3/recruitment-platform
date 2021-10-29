package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author qingshi
 */
@EnableTransactionManagement
@SpringBootApplication
@ComponentScan("com.tec")
public class PlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class,args);
    }
}
