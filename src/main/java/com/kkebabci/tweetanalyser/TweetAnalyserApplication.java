package com.kkebabci.tweetanalyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TweetAnalyserApplication {

	public static void main(String[] args) {
                System.setProperty("server.servlet.context-path", "/tweetanalyser");
		SpringApplication.run(TweetAnalyserApplication.class, args);
	}

}
