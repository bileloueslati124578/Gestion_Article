package com.gestion;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gestion.controllers.ArticleController;

@SpringBootApplication
public class ArticleApplication {

	public static void main(String[] args) {
		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(ArticleApplication.class, args);
	}

}
