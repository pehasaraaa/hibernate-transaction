package repository;

import org.hibernate.Session;

import entity.OrderDetailEntity;

public class OrderDetailRepository {
    public Integer save(OrderDetailEntity entity, Session session){
        Integer id = (Integer) session.save(entity);
        return id;
    }
}