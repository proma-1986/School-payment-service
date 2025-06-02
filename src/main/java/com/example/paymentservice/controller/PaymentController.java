package com.example.paymentservice.controller;

import com.example.paymentservice.dto.PaymentResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping("/{studentId}")
    public ResponseEntity<PaymentResponseDTO> processPayment(
            @PathVariable Long studentId,
            @RequestBody Double amount) {
        // In a real scenario, integrate with a payment gateway (Stripe, Razorpay, etc.).
        // Here, simulate a successful payment and return a random transaction ID.

        String transactionId = UUID.randomUUID().toString();
        PaymentResponseDTO response = new PaymentResponseDTO(
                studentId,
                amount,
                "SUCCESS",
                transactionId,
                "Payment processed successfully."
        );
        return ResponseEntity.ok(response);
    }
}