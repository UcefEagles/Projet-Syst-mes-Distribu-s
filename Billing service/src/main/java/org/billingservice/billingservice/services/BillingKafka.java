package org.billingservice.billingservice.services;


import org.billingservice.billingservice.entities.Bill;
import org.billingservice.billingservice.feign.CustomerRestClient;
import org.billingservice.billingservice.feign.ProductItemRestClient;
import org.billingservice.billingservice.repository.BillRepository;
import org.billingservice.billingservice.repository.ProductItemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class BillingKafka {
    @Bean
    public Consumer<Bill> billConsumer(){

         BillRepository billRepository = null;
         Bill bill=new Bill();

        return (input)->{
            System.out.println("-----------------");
            System.out.println(input.toString());
            System.out.println("-------------------");

           /* bill.setId(input.getId());
            bill.setBillingDate(input.getBillingDate());
            bill.setCustomerID(1l);
            billRepository.save(input);*/

        };

    }


}
