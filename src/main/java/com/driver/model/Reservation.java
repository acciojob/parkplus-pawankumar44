package com.driver.model;

import javax.persistence.*;

@Entity
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private int numberOfHours;
    @ManyToOne
    private User user;
    Spot spot;
    //payment
}
