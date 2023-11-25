package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Spot {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private SpotType spotType;
    private int pricePerHour;
    private boolean occupied;
    @ManyToOne
    private ParkingLot parkingLot;
    @OneToMany(mappedBy = "spot")
    List<Reservation> reservationList;

    public Spot() {
    }


}
