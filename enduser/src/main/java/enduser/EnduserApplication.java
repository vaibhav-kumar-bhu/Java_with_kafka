package enduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class EnduserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnduserApplication.class, args);
	}

	@KafkaListener(topics = "LOCATION-UPDATE",groupId = "1")
	public void updatedLocation(String value){
		System.out.println("(  "+value+"  )");
	}

}
