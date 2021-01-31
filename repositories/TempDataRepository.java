package com.medium.threadexample.repositories;

import com.medium.threadexample.models.TemporaryData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempDataRepository extends CrudRepository<TemporaryData, Long> {
}
