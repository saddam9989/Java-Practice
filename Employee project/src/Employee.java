import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

import java.util.*;
import java.io.*;

public class Employee implements Comparable<Employee> {
	
	int empNo;
	String empName;
	double experience;
	double salary;
	int deptNo;
	String deptName;
	
	// constructor
	public Employee(int empNo, String empName, double experience, double salary, int deptNo, String deptName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.experience = experience;
		this.salary = salary;
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	
	// getters & setters 
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	

	@Override
	public String toString() {
		return "EmpNo = " + empNo + " " + " EmpName=" + empName  + " " + " Experience=" + experience +" "+ "salary = " + salary
				+ " " + " deptNo = " + deptNo + " " + " deptName = " + deptName ;
	}
	
	


	


	// comparing empNo with Ascending  order
	
	@Override
	public int compareTo(Employee o) {
		if(empNo > o.empNo) {
		return 1;
	}else if (empNo < o.empNo) {
		return -1;
	}else {
		return 0;
	}

	}

	
	
	// comparing empNo with descending  order
	
//	@Override
//	public int compareTo(Employee o) {
//		if(empNo < o.empNo) {
//		return 1;
//	}else if (empNo > o.empNo) {
//		return -1;
//	}else {
//		return 0;
//	}
//
//	}

	
	
}
