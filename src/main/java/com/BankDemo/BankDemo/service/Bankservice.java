package com.BankDemo.BankDemo.service;

import com.BankDemo.BankDemo.model.Account_Details;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Bankservice {

   List<Account_Details> getalldata();
    public Account_Details saveAccount(Account_Details account_details);
    public boolean isValidPanCardNo(String PAN_Number);
 //   Account_Details getAccountById(Long id);
  //  void deleteAccountById(Long id);

}
