package com.panchoriz.myapp.repositories;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.panchoriz.myapp.domain.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, BigInteger> {

}
