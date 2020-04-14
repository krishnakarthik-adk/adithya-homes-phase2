package com.adithyahomesp2.expensetracker.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.adithyahomesp2.expensetracker.models.PaymentInfo;

public interface PaymentRepository extends JpaRepository<PaymentInfo, Long> {

	@Query(value = "select p from PaymentInfo p where p.user.id = :userId")
	List<PaymentInfo> findByUser(@Param("userId") Long userId, Sort sort);

}
