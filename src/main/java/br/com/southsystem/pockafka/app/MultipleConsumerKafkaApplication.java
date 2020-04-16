package br.com.southsystem.pockafka.app;

import br.com.southsystem.pockafka.service.ConsumerService;
import br.com.southsystem.pockafka.service.ProducerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@ComponentScan(value = "br.com.southsystem")
public class MultipleConsumerKafkaApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(MultipleConsumerKafkaApplication.class, args);

        ProducerService producerService = context.getBean(ProducerService.class);
        ConsumerService consumerService = context.getBean(ConsumerService.class);

        System.out.println("-------------- Publish Message -------------");
        producerService.sendMessage("POC Kafka 1!");
        producerService.sendMessage("POC Kafka 2!");
        producerService.sendMessage("POC Kafka 3!");
        producerService.sendMessage("POC Kafka 4!");
        producerService.sendMessage("POC Kafka 5!");
        System.out.println("--------------------------------------------");

        System.out.println("-------------- Read Message ----------------");
        System.out.println("--------------------------------------------");

    }
}
