package proj_StaffManage;
/*purpose: manage task for staff
 * create day:31.07.2022
 * creator: Hung Tham
 */
public class Task implements InOutput {
	//1.attribute
	private String taskId;
	private String taskName;
	private String taskTime;
	private String staffId;
	//2.get,set
	
	public String getTaskId() {
		return taskId;
	}
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getTaskTime() {
		return taskTime;
	}
	
	public void setTaskTime(String taskTime) {
		this.taskTime = taskTime;
	}

	public String getStaffId() {
		return staffId;
	}
	
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}


	
	//3.constructor
	public Task(String taskId, String taskName, String taskTime, String staffId) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskTime = taskTime;
		this.staffId = staffId;
	}
	
	public Task() {
		this.staffId = "-1";
	}
	//4.in,output
	@Override
	public String toString() {
		return "Task [taskId=" + this.taskId + ", taskName=" + this.taskName + ", taskTime=" + this.taskTime + ", staffId=" + this.staffId
				+ "]";
	}

	@Override
	public void output() {
		System.out.println( "Task [taskId=" + this.taskId + ", taskName=" + this.taskName + ", taskTime=" + this.taskTime + ", staffId=" + this.staffId
				+ "]");
		
	}
	
	
	//5.business methods
}
