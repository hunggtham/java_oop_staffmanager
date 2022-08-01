package proj_StaffManage;

import java.util.ArrayList;

public class Department implements InOutput {
	//atribute
	private String departmentId;
	private String departmentName;
	private Manager manager;
	ArrayList<OrdinaryStaff> ordinaryStaffList;
	
	//get,set
	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public ArrayList<OrdinaryStaff> getOrdinaryStaffList() {
		return ordinaryStaffList;
	}

	public void setOrdinaryStaffList(ArrayList<OrdinaryStaff> ordinaryStaffList) {
		this.ordinaryStaffList = ordinaryStaffList;
	}

	
	//constructor
	public void init() {
		
	}
	public Department() {
		this.manager = null;
		this.ordinaryStaffList = new ArrayList<OrdinaryStaff>();
	}
	//in-output
	@Override
	public void output() {
		System.out.println("This is department detail!");
		System.out.println("Name: " + this.departmentName + " Id: " + this.departmentId);
		
		if(this.manager != null) {
			System.out.println("This is department's manager detail!");
			this.manager.output();
		}else {
			System.out.println("Department doesn't have manager yet!");
		}
		
		for(OrdinaryStaff st : this.ordinaryStaffList) {
			st.output();
		}
		
		System.out.println("End!");
	}
	//business
	

	
}
