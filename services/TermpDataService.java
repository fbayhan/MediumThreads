package com.medium.threadexample.services;

import com.medium.threadexample.models.TemporaryData;
import com.medium.threadexample.repositories.TempDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Transactional
@Service
public class TermpDataService {

    @Autowired
    TempDataRepository tempDataRepository;

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
