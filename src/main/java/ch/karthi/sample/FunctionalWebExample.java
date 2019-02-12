package ch.karthi.sample;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class FunctionalWebExample {

	public static void main(String[] args) {
		SpringApplication.run(FunctionalWebExample.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> routeHi() {
		return route()
				.GET("/hi", req -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject("Hi")))
				.build();
	}

	@Bean
	public RouterFunction<ServerResponse> routeBye() {
		return route()
				.GET("/bye", req -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject("Bye")))
				.build();
	}

}
