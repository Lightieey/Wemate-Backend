package com.example.demo.model.characteristic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// DB�� CRUD �ϴ� �κ�
@Repository
public interface CharacteristicRepository extends CrudRepository<Characteristic, String> { 

}