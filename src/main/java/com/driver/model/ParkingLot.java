package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "parkingLot")
    List<Spot> spotList;
}
