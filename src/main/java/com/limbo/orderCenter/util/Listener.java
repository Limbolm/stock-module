package com.limbo.orderCenter.util;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;

public class Listener {

    @KafkaListener(topics = {"test-topic"})
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("listen1 " + message);
        }
    }
}
