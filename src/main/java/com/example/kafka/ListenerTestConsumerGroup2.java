package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by sutaiyun on 2017/3/20.
 */

public class ListenerTestConsumerGroup2 {
    @KafkaListener(topics = "test2", group = "test-group-id-2")
    public void listen1(ConsumerRecord<?, ?> record) {
        System.out.println("topic: test2 group: test-group-id-2-1>>>>>>>>> " + record.value());
        System.out.println("topic: test2 group: test-group-id-2-1>>>>>>>>> " + record);
    }
}
