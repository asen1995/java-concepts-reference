package com.java.main;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.java.collections.Collections;

//@SpringBootApplication
public class ConceptMain extends SpringBootServletInitializer {

	public static void main(String[] args) {
//		SpringApplication.run(ConceptMain.class, args);

//		com.java.streams.api.Streams streams = new com.java.streams.api.Streams();
//		streams.differentFilteringExamples();
		
		Collections c = new Collections();
		c.collectionMainMethod();
		
		
	}
}
