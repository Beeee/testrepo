package no.poc.repository.support;

import no.poc.model.Order;
import no.poc.repository.OrderRepository;

import static no.poc.Main.DATASOURCE_ORDER_LIST;

public class ListOrderRepository implements OrderRepository {


    @Override
    public int count() {
        return DATASOURCE_ORDER_LIST.size();
    }

    @Override
    public Order getOrderById(long id) {
        for (Order order : DATASOURCE_ORDER_LIST) {
            if(id == order.getId()) {
                return order;
            }
        }
        throw new RuntimeException("Order not found");
    }

    @Override
    public void saveOrder(Order order) {
        DATASOURCE_ORDER_LIST.add(order);
    }

    //tilsvarende enkle operasjoner du ønsker
}
