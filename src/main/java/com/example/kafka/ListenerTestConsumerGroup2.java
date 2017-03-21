package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by sutaiyun on 2017/3/20.
 */

public class ListenerTestConsumerGroup2 {
    /*
    @Value("kafka.topic")
    private String kafkaTopic;

    @Value("kafka.consumer.group-id")
    private String kafkaConsumerGroupId;
    private static String kafkaTopic = "test";
    private static String kafkaConsumerGroupId = "test-group-id";

    @KafkaListener(topics = kafkaTopic, group = kafkaConsumerGroupId)
    */

    /*
    @KafkaListener(topics = "test", group = "test-group-id-2")
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println("test-group-id-2>>>>>>>>> " + record.value());
        System.out.println("test-group-id-2>>>>>>>>> " + record);
    }
    */

    @KafkaListener(topics = "test2", group = "test-group-id-2")
    public void listen1(ConsumerRecord<?, ?> record) {
        System.out.println("test2: test-group-id-2-1>>>>>>>>> " + record.value());
        System.out.println("test2: test-group-id-2-1>>>>>>>>> " + record);
    }
}
