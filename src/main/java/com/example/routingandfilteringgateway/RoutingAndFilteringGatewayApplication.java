package com.example.routingandfilteringgateway;

import com.example.routingandfilteringgateway.filter.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class RoutingAndFilteringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingAndFilteringGatewayApplication.class, args);
	}

	@Bean
	public SimpleFilter getPreFilter() {
		return new SimpleFilter();
	}
}
