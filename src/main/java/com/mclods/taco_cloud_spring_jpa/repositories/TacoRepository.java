package com.mclods.taco_cloud_spring_jpa.repositories;

import com.mclods.taco_cloud_spring_jpa.entities.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Integer> {
}
