package com.mclods.taco_cloud_spring_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "taco_order")
public class TacoOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "delivery_name")
    private String deliveryName;

    @Column(name = "delivery_street")
    private String deliveryStreet;

    @Column(name = "delivery_city")
    private String deliveryCity;

    @Column(name = "delivery_state")
    private String deliveryState;

    @Column(name = "delivery_zip")
    private String deliveryZip;

    @Column(name = "cc_number")
    private String ccNumber;

    @Column(name = "cc_expiration")
    private String ccExpiration;

    @Column(name = "cc_cvv")
    private String ccCVV;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "tacoOrders")
    private final List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
