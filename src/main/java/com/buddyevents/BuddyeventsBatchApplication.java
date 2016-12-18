package com.buddyevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Publisher;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

@EnableBinding(Source.class)
@SpringBootApplication
public class BuddyeventsBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuddyeventsBatchApplication.class, args);
	}
	
	 @Bean
	 @InboundChannelAdapter(value = Source.OUTPUT)
	 public MessageSource<String> timerMessageSource() {
	        return () -> new GenericMessage<>("Syam");
	    }

	
	
}
