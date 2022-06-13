package pcebilan.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		/*SpringApplicationBuilder builder = new SpringApplicationBuilder(BackApplication.class);

		builder.headless(false);

		ConfigurableApplicationContext context = builder.run(args);*/

		SpringApplication.run(BackApplication.class, args);
		System.setProperty("java.awt.headless", "false");
	}

}
