package com.quartz.demo.controller;

import java.util.UUID;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quartz.demo.entity.ScheduleRequest;

@RestController
@RequestMapping("/schedule")
public class CreateSchedule {


    @Autowired
    private Scheduler scheduler;

    @PostMapping
    public String schedule(@RequestBody ScheduleRequest request)
            throws SchedulerException {

        JobDetail job = JobBuilder.newJob(PrintJob.class)
                .withIdentity("job-" + UUID.randomUUID())
                .build();
        
        System.out.println(request.getCron().trim().replaceAll("\\s+", " "));
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger-" + UUID.randomUUID())
                .withSchedule(
                    CronScheduleBuilder.cronSchedule(request.getCron().trim().replaceAll("\\s+", " "))
                )
                .build();

        scheduler.scheduleJob(job, trigger);

        return "Job Scheduled";
    }
}