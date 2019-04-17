package com.nt.kafka.consumer;

import javax.sound.midi.Receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nt.kafka.binding.Customer;

@Service
public class Consumer {
	private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);

    @KafkaListener(topics = "${app.topic}",groupId="customer_1")
    public void listen(Customer cust) {
        LOG.info("received Object='{}'",cust);
    }
}
