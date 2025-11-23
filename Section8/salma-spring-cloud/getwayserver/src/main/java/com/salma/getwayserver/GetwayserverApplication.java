package com.salma.getwayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetwayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayserverApplication.class, args);
	}

	/*@Bean
	public RouteLocator MyRouteConfig(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p -> p
						.path("/api/equipes/**")
						.uri("lb://EQUIPE"))
				.route(p -> p
						.path("/api/joueurs/**")
						.uri("lb://JOUEUR"))
				.build();
	}*/

}
