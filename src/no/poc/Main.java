package no.poc;

import no.poc.model.Order;
import no.poc.repository.OrderRepository;
import no.poc.repository.OtherDomainRepository;
import no.poc.repository.support.ListOrderRepository;
import no.poc.service.SuperService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final List<Order> DATASOURCE_ORDER_LIST = new ArrayList<>();

    public static void main(String[] args) {
        OrderRepository orderRepository = new ListOrderRepository();
        OtherDomainRepository otherDomainRepository = new OtherDomainRepository() {
            @Override
            public int count() {
                return 0;
            }
        };

        SuperService superService1 = new SuperService(otherDomainRepository, orderRepository);
        SuperService superService2 = new SuperService(otherDomainRepository, orderRepository);

        superService1.serve();
        superService2.serve();
    }
}
