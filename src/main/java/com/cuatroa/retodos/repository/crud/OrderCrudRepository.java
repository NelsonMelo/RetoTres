package com.cuatroa.retodos.repository.crud;

import com.cuatroa.retodos.model.Order;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Proyecto pedidos revista por catalogo la hermosa Ursula
 * Diciembre 2021 
 * Reto 3 ciclo 4
 * @author Nelson Melo
 */
public interface OrderCrudRepository extends CrudRepository<Order, Integer> {

    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country);
    
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);
}
