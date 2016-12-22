package com.buddyevents.push.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@EnableBinding(Source.class)
@Component
public class CreateBuddyEventsTopic {

	
	 @Bean
	 @InboundChannelAdapter(value = Source.OUTPUT )
	 public MessageSource<String> timerMessageSource() {
	        return () -> new GenericMessage<>("latha");
	    }

}
