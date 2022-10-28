package com.BankDemo.BankDemo.service;

import com.BankDemo.BankDemo.model.Account_Details;
import com.BankDemo.BankDemo.repositry.Bankrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Service
public class BankServiceIMPL implements  Bankservice{
    @Autowired
    Bankrepo bankrepo;
    @Override
    public List<Account_Details> getalldata() {
        return bankrepo.findAll();
    }

    @Override
    public Account_Details saveAccount(Account_Details account_details) {
        return bankrepo.save(account_details);
    }

    @Override
    public boolean isValidPanCardNo(String PAN_Number) {
        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
        Matcher matcher = pattern.matcher(PAN_Number);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }



//    @Override
//    public void deleteAccountById(Long id) {
//        this.bankrepo.deleteById(id);
//
//    }
//    @Override
//    public boolean isValidPanCardNo(String PAN_Number) {
//        Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
//        Matcher matcher = pattern.matcher(PAN_Number);
//        if (matcher.matches()) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
}
