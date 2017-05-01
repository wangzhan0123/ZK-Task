package cn.uncode.schedule.test;


import org.quartz.CronTrigger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.quartz.CronTriggerBean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import cn.uncode.schedule.ConsoleManager;
import cn.uncode.schedule.zk.TaskDefine;


public class MyTest {
public static void main(String[] args) {
		/*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		  try { Thread.sleep(1000); } catch (InterruptedException e) {
		 e.printStackTrace(); }
		 
		// print1
		TaskDefine taskDefine1 = new TaskDefine();
		taskDefine1.setTargetBean("taskObj");
		taskDefine1.setTargetMethod("print1");
		taskDefine1.setCronExpression("0/10 * * * * ?");
		ConsoleManager.addScheduleTask(taskDefine1);*/
	
		for (int i = 0; i <5; i++) {
			if (i ==1) {
				System.out.println("hallo"+i);
				continue;
			}
			System.out.println("world"+i);
		}
		// print2
	/*	TaskDefine taskDefine2 = new TaskDefine();
		taskDefine2.setTargetBean("taskObj");
		taskDefine2.setStartTime(new Date(System.currentTimeMillis() + 1000));
		taskDefine2.setTargetMethod("print2");
		ConsoleManager.addScheduleTask(taskDefine2);
		// print3
		TaskDefine taskDefine3 = new TaskDefine();
		taskDefine3.setTargetBean("taskObj");
		taskDefine3.setTargetMethod("print3");
		taskDefine3
				.setStartTime(new Date(System.currentTimeMillis() + 1000 * 2));
		taskDefine3.setPeriod(1000);
		ConsoleManager.addScheduleTask(taskDefine3);
		// print4
		TaskDefine taskDefine4 = new TaskDefine();
		taskDefine4.setTargetBean("taskObj");
		taskDefine4.setTargetMethod("print4");
		taskDefine4.setPeriod(1000);
		ConsoleManager.addScheduleTask(taskDefine4);*/
	}
}
