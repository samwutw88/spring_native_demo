package sam.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NativeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NativeDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello from Spring Native!";
	}
}
