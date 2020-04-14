package com.adithyahomesp2.expensetracker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adithyahomesp2.expensetracker.models.PaymentInfo;
import com.adithyahomesp2.expensetracker.repositories.PaymentRepository;

@RestController
@RequestMapping("/api/v1/paymentInfo")
public class PaymentController {

	@Autowired
	private PaymentRepository paymentRepository;

	@GetMapping("/{paymentId}")
	public Optional<PaymentInfo> getPaymentInfo(@PathVariable Long paymentId) {
		return paymentRepository.findById(paymentId);
	}

	@GetMapping("/user/{userId}")
	public List<PaymentInfo> getPaymentInfoForUser(@PathVariable Long userId) {
		return paymentRepository.findByUser(userId, Sort.by(Sort.Direction.DESC, "id"));

	}
}
