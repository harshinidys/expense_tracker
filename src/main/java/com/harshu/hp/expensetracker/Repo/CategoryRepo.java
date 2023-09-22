package com.harshu.hp.expensetracker.Repo;

import com.harshu.hp.expensetracker.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Long> {
}
