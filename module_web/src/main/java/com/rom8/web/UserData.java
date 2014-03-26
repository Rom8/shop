package com.rom8.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

private static final long serialVersionUID = 1L;

   private String name;
   private String dept;
   private int age;
   private double salary;

   private final ArrayList<Employee> employees
      = new ArrayList<Employee>(Arrays.asList(
      new Employee("John", "Marketing", 30,2000.00),
      new Employee("Robert", "Marketing", 35,3000.00),
      new Employee("Mark", "Sales", 25,2500.00),
      new Employee("Chris", "Marketing", 33,2500.00),
      new Employee("Peter", "Customer Care", 20,1500.00)
   ));	

   private final List<Employee> selectedEmp = new ArrayList<Employee>();
   
   public ArrayList<Employee> getEmployees() {
      return employees;
   }
   
   public List<Employee> getSelectedEmp() {
	   return selectedEmp;
   }

   public String addEmployee() {		 
      Employee employee = new Employee(name,dept,age,salary);
      employees.add(employee);
      return null;
   }

   public String deleteEmployee(Employee employee) {
      employees.remove(employee);		
      return null;
   }

   public String editEmployee(Employee employee){
      employee.setCanEdit(true);
      return null;
   }

   public String saveEmployees(){
      //set "canEdit" of all employees to false 
      for (Employee employee : employees){
         employee.setCanEdit(false);
      }		
      return null;
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDepartment() {
      return dept;
   }

   public void setDepartment(String department) {
      this.dept = department;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public double getSalary() {
      return salary;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }
   
   public String show(){
	   for(Employee e: employees){
		   if(e.isCanEdit()){
			   selectedEmp.add(e);
		   }
	   }
	   return "selected";
   }
   
   public void te(){
	   
   }
   
}