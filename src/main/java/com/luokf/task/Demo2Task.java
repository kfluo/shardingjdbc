package com.luokf.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @CreateTime: 2019-08-21 09:29
 * @Author: luokf
 */
//@Component
public class Demo2Task implements Runnable, InitializingBean {
    Logger logger = LoggerFactory.getLogger(Demo2Task.class);
    @Autowired
    Executor taskExecutor;

    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(2);
                logger.info("定时任务执行了");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void afterPropertiesSet(){
        taskExecutor.execute(this);
    }
}
