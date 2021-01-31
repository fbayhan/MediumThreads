package com.medium.threadexample.controllers;

import com.medium.threadexample.models.PerminantData;
import com.medium.threadexample.models.TemporaryData;
import com.medium.threadexample.repositories.PermDataRepository;
import com.medium.threadexample.repositories.TempDataRepository;
import com.medium.threadexample.services.TempDataThread;
import com.medium.threadexample.services.TermpDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class MainController {
    @Autowired
    private PermDataRepository permDataRepository;

    @Autowired
    private TempDataRepository tempDataRepository;

    @Autowired
    private TermpDataService termpDataService;

    @GetMapping("startthreads")
    public String startThreads(){
        termpDataService.saveTempData();
        System.out.println("Threads are starting");



        TempDataThread tempDataThread=new TempDataThread();
        tempDataThread.start();


        return "Bitti";
    }




}
