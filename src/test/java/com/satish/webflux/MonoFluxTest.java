package com.satish.webflux;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {
	
	@Test
	public void testMono() {
		Mono<?> monoString = Mono.just("Satish")
				.then(Mono.error(new RuntimeException("Checking error")))
				.log();
		monoString.subscribe(System.out::println, e -> System.out.println(e.getMessage()));
		
	}
	
	@Test
	public void testFlux() {
		Flux<?> fluxString = Flux.just("Satish", "Swapna", "Rajvika", "Ajit").log()
				.concatWithValues("MyHome");
		fluxString.subscribe(System.out::println);
			
	}
}
