package com.oracle.quartz.scheduler;

import java.util.Date;

public class Job1Demo {
    public void sayHello() {
        System.out.println(new Date() + " -> Hello, 我是任务 1");
    }
}
