package exarb.fmgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class FmgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FmgatewayApplication.class, args);
	}

}
