package com.dans.academy.academyscheduler.service;

import com.dans.academy.academyscheduler.model.AcademyTransaction;
import com.dans.academy.academyscheduler.repositories.AcademyTransactionRepositories;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class ScheduleService {
    @Autowired
    private AcademyTransactionRepositories academyTransactionRepositories;

    @Scheduled(cron = "0 0/5 * * * *")
    public void schedulerCronTest() {
        AcademyTransaction academyTransaction = new AcademyTransaction();
        academyTransaction.setSource("scheduler");
        academyTransaction.setCreated_at(String.valueOf(new Date()));
        academyTransaction.setCreated_by("schedulerJava");
        academyTransactionRepositories.save(academyTransaction);
        log.info("Scheduler run {}", new Date());
    }
}
