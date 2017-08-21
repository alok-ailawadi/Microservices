package com.bootcamptech.wordclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WordclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordclientApplication.class, args);
	}
}
