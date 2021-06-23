package co.jp.socio.diversity.vos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication

public class SagaBankCrmRootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagaBankCrmRootApplication.class, args);
	}
	/*
	 * AnnotationConfigApplicationContext ctx = new
	 * AnnotationConfigApplicationContext(); ctx.register(MyConfiguration.class);
	 * ctx.refresh(); ctx.close();
	 */
	
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SagaBankCrmRootApplication.class);
    }
    
	

}
