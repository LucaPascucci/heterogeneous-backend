package it.lucapascucci.heterogeneousBackend.service;

import it.lucapascucci.heterogeneousBackend.model.Greeting;
import java.util.concurrent.atomic.AtomicLong;

public class GreetingService {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public Greeting getGreeting(String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
