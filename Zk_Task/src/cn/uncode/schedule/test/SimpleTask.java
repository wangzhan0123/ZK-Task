package cn.uncode.schedule.test;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author juny.ye
 */
@Component
public class SimpleTask {

    private static int i = 0;
    
    /*@Scheduled(fixedDelay = 1000) */
    public void print() {
        System.out.println("线程"+Thread.currentThread().getId()+"：===========start!========="+new Date());
        System.out.println("I:"+i);i++;
        try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("线程"+Thread.currentThread().getId()+"：===========end!========="+new Date());
       }
    
    public void print1() {
        System.out.println("===========start!=========");
        System.out.println("print1:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    public void print2() {
        System.out.println("===========start!=========");
        System.out.println("print2:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    public void print3() {
        System.out.println("===========start!=========");
        System.out.println("print3:"+i);i++;
        System.out.println("=========== end !=========");
    }
    
    public void print4() {
        System.out.println("===========start!=========");
        System.out.println("print4:"+i);i++;
        System.out.println("=========== end !=========");
    }
}
