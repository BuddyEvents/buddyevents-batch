package com.buddyevents.push.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class ReadMessagefromKafka {

  @StreamListener(Sink.INPUT)
  public void handle(String vote) {
System.out.println("received message"+vote);
  }
}
