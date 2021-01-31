package com.medium.threadexample.services;

import com.medium.threadexample.models.TemporaryData;
import com.medium.threadexample.repositories.TempDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Transactions {
    @Lazy
    private TempDataRepository tempDataRepository;

    private static Transactions single_instance = null;

    public static Transactions getInstance()
    {
        if (single_instance == null)
            single_instance = new Transactions();

        return single_instance;
    }

    public String saveTempData() {
        Long id = Calendar.getInstance().getTimeInMillis();
        TemporaryData temporaryData = new TemporaryData();
        UUID uuid = UUID.randomUUID();
        temporaryData.setId(id);
        temporaryData.setContent(uuid.toString());
        temporaryData.setInsertTime(new Date());
        tempDataRepository.save(temporaryData);
        return "TemproraryData saved...";

    }
}
