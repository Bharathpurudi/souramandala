package com.souramandala.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.souramandala.entity.OrderEntity;
@Repository
@Transactional
public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {
	
	
	@Query(value="SELECT * FROM order_entity o WHERE o.cust_id=?1", nativeQuery = true)
	public List<OrderEntity> findAllOrdsCustomer(int cust_id);

}
