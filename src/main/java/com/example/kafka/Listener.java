package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * Created by sutaiyun on 2017/3/20.
 */
/*
public class Listener {
    @KafkaListener(topics = "test", group = "test-group1")
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println(record.value());
        System.out.println(record);
    }
}
*/

public class Listener {

    @KafkaListener(topics = "test", group = "test")
    public void listen(ConsumerRecord<?, ?> record) {
        System.out.println(record.value());
        System.out.println(record);
    }

}
