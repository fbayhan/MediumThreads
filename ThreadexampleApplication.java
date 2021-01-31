package com.medium.threadexample;

import com.medium.threadexample.models.TemporaryData;
import com.medium.threadexample.repositories.TempDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class ThreadexampleApplication {



    public static void main(String[] args) {


        SpringApplication.run(ThreadexampleApplication.class, args);


    }




}
