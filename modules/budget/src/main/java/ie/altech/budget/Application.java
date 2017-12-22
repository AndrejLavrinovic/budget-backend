package ie.altech.budget;

import org.owasp.esapi.ESAPI;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

@SpringBootApplication
public class Application {
    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    private Application(){}

    public static void main(String... args){

        // ESAPI encodeing check
        String str = "Hello world!\n";
        String clean = str.replace('\n', '_').replace('\r', '_');
        String encoded = ESAPI.encoder().encodeForHTML(str);
        LOGGER.info("Log output is here ===> " + str);
        LOGGER.info("Log output is here ===> " + clean + " (cleaned)");
        LOGGER.info("Log output is here ===> " + encoded + " (encoded)");

        SpringApplication.run(Application.class, args); //NOSONAR
    }
}
