package proj_StaffManage;

import java.util.ArrayList;

public class Company implements InOutput{
	//attribute
	private String companyName;
	private String taxId;
	private float salarySum;
	private ArrayList<Staff>staffList;
	private ArrayList<Department> departmentList;
	private ArrayList<Task> taskList;
	
	//get,set
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxId() {
		return taxId;
	}


	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public float getSalarySum() {
		return salarySum;
	}

	public void setSalarySum(float salarySum) {
		this.salarySum = salarySum;
	}

	public ArrayList<Staff> getStaffList() {
		return staffList;
	}

	public void setStaffList(ArrayList<Staff> staffList) {
		this.staffList = staffList;
	}

	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}

	public ArrayList<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(ArrayList<Task> taskList) {
		this.taskList = taskList;
	}


	
	//constructor
	public Company() {
		this.staffList = new ArrayList<Staff>();
		this.departmentList = new ArrayList<Department>();
		this.taskList = new ArrayList<Task>();
	}
	//input, output
	@Override
	public void output() {
		
	}
	public void staffOutput() {
		
	}
	//business method
	

	
}
