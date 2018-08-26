package com.oracle.quartz.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


//比较Timer和Quartz：
//Quartz可以通过cron表达式精确到特定时间执行，而TimerTask不能。Quartz拥有TimerTask所有的功能，而 TimerTask则没有。
public class TimerTest {

    public static void main(String[] args) {
        Timer timer=new Timer();
        Task task=new Task();
        timer.schedule(task,new Date(),3000);
    }


    static class Task extends TimerTask {
        public void run() {
            System.out.println("Timer开始执行！");
        }

    }
}