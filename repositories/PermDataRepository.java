package com.medium.threadexample.repositories;

import com.medium.threadexample.models.PerminantData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermDataRepository extends CrudRepository<PerminantData, Long> {
}
