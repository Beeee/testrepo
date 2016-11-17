package no.poc.repository;

import no.poc.model.Order;

/**
 * Created by bjursroa on 17.11.2016.
 */
public interface OrderRepository {

    int count();
    Order getOrderById(long id);
    void saveOrder(Order order);
}
