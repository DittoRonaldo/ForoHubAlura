package com.example.FOROHUBFINAL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForohubfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForohubfinalApplication.class, args);
	}


	@RestController
	public class HomeController {

		@GetMapping("/")
		public String home() {
			return "Bienvenido a la API!";
		}
	}

}
