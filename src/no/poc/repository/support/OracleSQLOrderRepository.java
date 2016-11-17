package no.poc.repository.support;

import no.poc.model.Order;
import no.poc.repository.OrderRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by bjursroa on 17.11.2016.
 */
public class OracleSQLOrderRepository implements OrderRepository {

    private DataSource dataSource;

    @Override
    public int count() {
        try {
            Connection connection = dataSource.getConnection();
            //...Masse boilerplate som ikke burde skrives på denne måten i moderne java
            //Kjør "SELECT COUNT(1) FROM ORDERS;
            //Returner resultat
            return 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Order getOrderById(long id) {
        try {
            Connection connection = dataSource.getConnection();
            //...Masse boilerplate som ikke burde skrives på denne måten i moderne java. connectionpools bla bla.
            //SELECT * FROM ORDERS WHERE ID = :id
            //Map resultat fra sql til Order (evnt. bruk rammeverk/ORM, og abstraher bort hele shiten)
            //returner resultat
            return new Order();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        //...Masse boilerplate som ikke burde skrives på denne måten i moderne java
    }

    @Override
    public void saveOrder(Order order) {
        // Same proc
        //INSERT INTO .......
    }
}
