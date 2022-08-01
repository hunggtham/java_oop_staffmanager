package proj_StaffManage;

import java.util.ArrayList;

/*purpose: manage staff through 
 * create day:31.07.2022
 * creator: Hung Tham
 */
public abstract class  Staff implements InOutput {
	protected String staffId;
	protected String staffName;
	protected String staffBirth;
	protected String staffEmail;
	protected String staffPhone;
	protected String departmentId;
	protected ArrayList<Task> taskList;
	protected float staffSalary;
	protected float staffWorkDay;
	
	public String getStaffId() {
		return staffId;
	}
	
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	public String getStaffName() {
		return staffName;
	}
	
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	public String getStaffBirth() {
		return staffBirth;
	}
	
	public void setStaffBirth(String staffBirth) {
		this.staffBirth = staffBirth;
	}
	
	public String getStaffEmail() {
		return staffEmail;
	}
	
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	
	public String getStaffPhone() {
		return staffPhone;
	}
	
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	
	public String getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public ArrayList<Task> getTaskList() {
		return taskList;
	}
	
	public void setTaskList(ArrayList<Task> taskList) {
		this.taskList = taskList;
	}
	
	public float getStaffWorkDay() {
		return staffWorkDay;
	}
	
	public void setStaffWorkDay(float staffWorkDay) {
		this.staffWorkDay = staffWorkDay;
	}
	//constuctor
	private void init() {
		this.departmentId = "-1";
		this.taskList = new ArrayList<Task>();
	}
	public Staff() {
		init();
	}

	
	public Staff(String staffId, String staffName, String staffBirth, String staffEmail, String staffPhone) {
		init();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffBirth = staffBirth;
		this.staffEmail = staffEmail;
		this.staffPhone = staffPhone;
		this.departmentId = "-1";
	}
	
	public Staff(String staffId, String staffName, String staffBirth, String staffEmail, String staffPhone,
			String departmentId, float staffWorkDay) {
		super();
		init();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffBirth = staffBirth;
		this.staffEmail = staffEmail;
		this.staffPhone = staffPhone;
		this.departmentId = departmentId;
		this.staffWorkDay = staffWorkDay;
	}
	//input, output

	
	public void output() {
		String department = this.departmentId;
		if(this.departmentId.equals("-1")) {
			department = "unallocated";
		}
		System.out.println( "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffBirth=" + staffBirth + ", staffEmail="
				+ staffEmail + ", staffPhone=" + staffPhone + ", departmentId=" + department  + ", staffSalary=" + staffSalary + ", staffWorkDay=" + staffWorkDay + "]");
	}
	//business method
	public abstract void calSalary();
		
	
}
