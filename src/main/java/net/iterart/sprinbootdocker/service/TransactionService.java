package net.iterart.sprinbootdocker.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.iterart.sprinbootdocker.model.Transaction;
import net.iterart.sprinbootdocker.repository.ITransactionRepository;

@Service
public class TransactionService {

	@Autowired
	ITransactionRepository transactionRepository;
	
	public void saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}
	
	public Iterable<Transaction> getTransactionHistory() {
		return transactionRepository.findAll();
	}
	
	public Optional<Transaction> getTransaction(Long id) {
		return transactionRepository.findById(id);
	}
}
