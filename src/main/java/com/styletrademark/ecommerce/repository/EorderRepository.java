package com.styletrademark.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.styletrademark.ecommerce.dto.Eorder;

import jakarta.transaction.Transactional;

public interface EorderRepository extends JpaRepository<Eorder, Integer> {

	Eorder findByOrderId(String orderId);
	@Modifying
    @Transactional
    @Query("UPDATE Eorder e SET e.status = true, e.paymentId = :paymentId WHERE e.id = :id")
    void updateOrderPayment(@Param("id") int id, @Param("paymentId") String paymentId);

}
