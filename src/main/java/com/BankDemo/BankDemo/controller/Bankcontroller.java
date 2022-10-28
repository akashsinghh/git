package com.BankDemo.BankDemo.controller;

import com.BankDemo.BankDemo.model.Account_Details;
import com.BankDemo.BankDemo.service.Bankservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class Bankcontroller {
    @Autowired
    Bankservice bankservice;

    //ArrayList<Account_Details> account=new ArrayList<>();
    @RequestMapping("/getall")
    public  String view(Model model){
        model.addAttribute(bankservice.getalldata());
        return "Successfully added";
    }

//    @PostMapping("/add_acc")
//    public String add(@RequestBody Account_Details account_details ){
//
//    account.add(account_details);
//    return "Succesfully added";
//    }
//    @RequestMapping("/checkPan")
//    public String  checkPan(@RequestBody String PAN_Number){
//        return PAN_Number;
//    }
//    @GetMapping("/getacc")
//
//    public ArrayList<Account_Details> getAccount() {
//        return account;
    @RequestMapping("/saveAccount")
    public  String saveAccount(Account_Details account_details){
        bankservice.saveAccount(account_details);
        return "Succeessfully added";

    }
    @RequestMapping("/valid")
    public String isValidPanCardNo(String PAN_Number){
        bankservice.isValidPanCardNo(PAN_Number);
        return "Successfully checked";
    }
//    @PutMapping("/Updatecur")
//    public String updateAccount(@RequestParam String current_address,@RequestParam int index){
//        Account_Details account_details=account.get(index);
//        account_details.setCurrent_address(current_address);
//        return "Successfully update ur address :" +current_address;
//    }
//    @DeleteMapping("/deletAccount")
//    public String deleteaccount(@RequestParam int index){
//        Account_Details account_details=account.remove(index);
//        return "Successfully delete";
//    }
}
