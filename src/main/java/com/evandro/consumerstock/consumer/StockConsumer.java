package com.evandro.consumerstock.consumer;

import constants.RabbitMQConstants;
import dtos.StockDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class StockConsumer {

    @RabbitListener(queues = RabbitMQConstants.QUEUE_STOCK)
    private void consumer(StockDto stockDto){
        System.out.println(stockDto.idProduct);
        System.out.println(stockDto.quantity);
        System.out.println("--------------------------------");
    }
}
