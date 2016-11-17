package no.poc.model;

import java.util.List;

/**
 * Created by bjursroa on 17.11.2016.
 */
public class Order {

    private long id;
    private List<OtherDomainObject> productList;

    public long getId() {
        return id;
    }

    public void addProduct(OtherDomainObject product) {
        productList.add(product);
    }

    public void setId(long id) {
        this.id = id;
    }
}
