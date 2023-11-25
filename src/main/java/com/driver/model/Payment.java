package com.driver.model;

import javax.persistence.*;

@Entity
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private boolean paymentCompleted;
    private PaymentMode paymentMode;
    @OneToOne
    private Reservation reservation;
}
