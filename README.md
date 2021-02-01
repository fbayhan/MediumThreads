# MediumThreads

package com.fatih.onur.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfiguration {

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        final ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("App1Thread-");
        executor.initialize();
        return executor;
    }
}


package com.fatih.onur.service;

import com.fatih.onur.model.TempData;
import com.fatih.onur.repository.TempDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class TempDataService {

    @Autowired
    private TempDataRepository tempDataRepository;

    @Async
    public void handleProcces() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        TempData tempData = new TempData();
        tempData.setContent("Merhaba");

        tempDataRepository.save(tempData);

        System.out.println("Basladi");
    }

}

