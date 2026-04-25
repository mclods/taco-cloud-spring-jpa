package com.mclods.taco_cloud_spring_jpa.services;

import com.mclods.taco_cloud_spring_jpa.entities.TacoOrder;

public interface OrderService {
    TacoOrder saveOrder(TacoOrder tacoOrder);
}
