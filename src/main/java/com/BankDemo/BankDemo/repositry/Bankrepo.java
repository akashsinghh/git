package com.BankDemo.BankDemo.repositry;

import com.BankDemo.BankDemo.model.Account_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bankrepo extends JpaRepository<Account_Details,Long> {
}
