package DAO;

import java.util.List;
import java.util.Map;

import bean.monitor;

public interface monitorDAO {
	//增加监测表记录
	public boolean insertMonitor(monitor bean) throws Exception;

	//删除监测表记录
	public boolean deleteMonitor(String monitorID) throws Exception;

	//修改监测表记录
	public boolean updateMonitor(monitor bean) throws Exception;

	//查询监测表记录
	public List<Map<String, String>> queryMonitor(String monitorID) throws Exception;

	//显示监测表记录
	public List<Map<String, String>> listMonitor() throws Exception;
	
	//多表查询
	public List<Map<String, String>> queryMonitorSystem(String monitorID) throws Exception;
	
	//多表查询all
	public List<Map<String, String>> listMonitorSystem() throws Exception;

	//判断是否id存在
	public boolean existID(String ID) throws Exception;
}
