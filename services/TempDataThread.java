package com.medium.threadexample.services;

import com.medium.threadexample.models.TemporaryData;
import com.medium.threadexample.repositories.TempDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;


public class TempDataThread extends Thread {

    Transactions transactions=Transactions.getInstance();



    private TemporaryData createTempData() {
        TemporaryData temporaryData = new TemporaryData();
        UUID uuid = UUID.randomUUID();
        temporaryData.setContent(uuid.toString());
        temporaryData.setInsertTime(new Date());
        return temporaryData;
    }


    public void run() {
        transactions.execute
        System.out.println("Temprory data thread running");
       // TemporaryData temporaryData = this.createTempData();
        transactions.saveTempData();
        System.out.println("savedTempData");
    }


    public void insertTemp() {
//        TemporaryData temporaryData = new TemporaryData();
//
//        UUID uuid = UUID.randomUUID();
//        temporaryData.setContent(uuid.toString());
//        temporaryData.setInsertTime(new Date());
//        tempDataRepository.save(temporaryData);
    }


}
