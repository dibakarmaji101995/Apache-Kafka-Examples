package com.nt.kafka.producer;

import org.apache.kafka.clients.producer.internals.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.nt.kafka.binding.Customer;

@Service
public class Producer {
	private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String,Customer> kafkaTemplate;

    @Value("${app.topic}")
    private String topic;

    public void send(Customer cust){
        LOG.info("sending object='{}' to topic='{}'", cust, topic);
        kafkaTemplate.send(topic,cust);
    }
}
