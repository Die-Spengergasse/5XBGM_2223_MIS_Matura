package at.spengergasse.backend;

import at.spengergasse.backend.typeAdapters.LocalDateTimeJSONAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Locale;

@SpringBootApplication
public class BackendApplication {

	@Bean
	public Gson dateAwareGSON(){
		return new GsonBuilder()
				.setPrettyPrinting()
				.serializeNulls()
				.enableComplexMapKeySerialization()
				.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeJSONAdapter())
				.create();
	}

	public static void main(String... args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
