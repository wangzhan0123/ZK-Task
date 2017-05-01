package cn.uncode.schedule;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.uncode.schedule.zk.TaskDefine;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 *  @wangfusheng@aisino.com 文档补充
 *  ConsoleManager 对外提供动态定时器的接口类，在成功注册zk节点后，
 *  持有zkScheduleManager的引用，对传入定时器参数SpringId、method在指定的目录下创建任务子目录
 *  创建任务子目录成功后，等待zkScheduleManager心跳检查调用定时器任务
 */
public class ConsoleManager {
	
    protected static transient Logger log = LoggerFactory.getLogger(ConsoleManager.class);
    
    private static Gson GSON = new GsonBuilder().create();

    private static ZKScheduleManager scheduleManager;
    
    public static ZKScheduleManager getScheduleManager() throws Exception {
    	if(null == ConsoleManager.scheduleManager){
    		ConsoleManager.scheduleManager = (ZKScheduleManager)ZKScheduleManager.getApplicationcontext().getBean(ZKScheduleManager.class);
    	}
        return ConsoleManager.scheduleManager;
    }

    public static void addScheduleTask(TaskDefine taskDefine) {
        try {
        	ConsoleManager.getScheduleManager().getScheduleDataManager().addTask(taskDefine);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
    }
    
    public static void delScheduleTask(String targetBean, String targetMethod) {
        try {
			ConsoleManager.getScheduleManager().getScheduleDataManager().delTask(targetBean, targetMethod);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
    }
    
    public static List<TaskDefine> queryScheduleTask() {
    	List<TaskDefine> taskDefines = new ArrayList<TaskDefine>();
        try {
			List<TaskDefine> tasks = ConsoleManager.getScheduleManager().getScheduleDataManager().selectTask();
			taskDefines.addAll(tasks);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
        return taskDefines;
    }
    
}
