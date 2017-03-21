package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by sutaiyun on 2017/3/20.
 */

public class ListenerTestConsumerGroup1 {
    @KafkaListener(topics = "test", group = "test-group-id-1")
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println("topic: test, group: test-group-id-1********* " + record.value());
        System.out.println("topic: test, group: test-group-id-1********* " + record);
    }
}
