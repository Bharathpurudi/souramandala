package com.souramandala.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.souramandala.entity.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	public Customer findBycustId(int custId);
	/*
	 * @Query(value="SELECT * FROM customer c WHERE c.cust_id=?1", nativeQuery =
	 * true) public Customer getCustomerById(int custId);
	 */

	public Customer findByuserNameAndPassword(String userName, String password);
	/*
	 * @Query(
	 * value="SELECT * FROM customer c WHERE c.user_name=?1 AND c.password=?2",
	 * nativeQuery = true) public Customer getCustomerByUserNameAndPassword(String
	 * userName, String userPassword);
	 */

}
