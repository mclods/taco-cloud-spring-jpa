package com.mclods.taco_cloud_spring_jpa.repositories;

import com.mclods.taco_cloud_spring_jpa.entities.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface TacoOrderRepository extends CrudRepository<TacoOrder, Integer> {
}
