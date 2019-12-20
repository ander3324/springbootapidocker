package net.iterart.sprinbootdocker.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.iterart.sprinbootdocker.model.Transaction;

@Repository
public interface ITransactionRepository extends CrudRepository<Transaction, Long> {

}
