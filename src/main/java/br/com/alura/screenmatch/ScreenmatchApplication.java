package br.com.alura.screenmatch;

import br.com.alura.screenmatch.service.ConsumerAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumerAPI = new ConsumerAPI();
		var json = consumerAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=b0c8c800");
		System.out.println(json);
	}
}
