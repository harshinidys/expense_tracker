package com.harshu.hp.expensetracker.Repo;

import com.harshu.hp.expensetracker.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<Expense,Long> {
}
