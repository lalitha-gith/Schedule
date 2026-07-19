package com.quartz.demo.controller;


import java.time.LocalDateTime;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PrintJob implements Job {

    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {

        System.out.println("================================");
        System.out.println("Quartz Job Started");
        System.out.println("Current Time : " + LocalDateTime.now());
        System.out.println("Hello from Quartz!");
        System.out.println("================================");
    }
}