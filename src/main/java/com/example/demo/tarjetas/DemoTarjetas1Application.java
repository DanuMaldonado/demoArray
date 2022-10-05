package com.example.demo.tarjetas;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTarjetas1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoTarjetas1Application.class, args);
		
		
		List<String> items = Arrays.asList("FirstWord","SecondWord","THIRDWORD");
		System.out.println(items);
		
		String items2 = items.toString().toLowerCase();		
		
		String items3 = items2.replaceAll("\\p{Punct}", "");
		
		System.out.println(items3);
		
	}
	

}
