package com.dans.academy.academyscheduler.repositories;

import com.dans.academy.academyscheduler.model.AcademyTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademyTransactionRepositories extends CrudRepository<AcademyTransaction, Integer> {

}
