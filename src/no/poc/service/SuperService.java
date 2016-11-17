package no.poc.service;

import no.poc.repository.OrderRepository;
import no.poc.repository.OtherDomainRepository;

/**
 * Created by bjursroa on 17.11.2016.
 */
public class SuperService {

    private OtherDomainRepository otherDomainRepository;
    private OrderRepository orderRepository;

    //Enkelt å mocke ut repo
    public SuperService(OtherDomainRepository otherDomainRepository, OrderRepository orderRepository) {
        this.otherDomainRepository = otherDomainRepository;
        this.orderRepository = orderRepository;
    }

    //bør fort være Transactional
    public void serve() {
        System.out.println(orderRepository.count());
        System.out.println(otherDomainRepository.count());
        //implementer supervanskelig businesslogikk som bruker flere repometoder og flere repository
    }

}
