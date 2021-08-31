package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.exception.MyException;
import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.DepartmantService;
import com.service.DepartmentServiceImpl;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int idNo = scan.nextInt();
		Student student1 = new Student(11, "Varun", 21);
		Student student2 = new Student(12, "Mark", 24);
		Student student3 = new Student(13, "Mike", 22);
		Student student4 = new Student(14, "Rajesh", 23);
		Student student5 = new Student(15, "Kavya", 21);

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
	
		Department department1 = new Department(101, "MECH", students);
		Department department2 = new Department(102, "CIVIL", students);
		Department department3 = new Department(201, "CS", students);
		Department department4 = new Department(202, "IT", students);
		Set<Department> departments = new HashSet<>();
		departments.add(department1);
		departments.add(department2);
		departments.add(department3);
		departments.add(department4);
		Department department = new Department();
		department.setStudents(students);

		College college1 = new College(1001, "SJBIT", departments);
		College college2 = new College(1002, "MVJCE", departments);
		Set<College> colleges = new HashSet<>();
		colleges.add(college1);
		colleges.add(college2);
		College college = new College();
		college.setDepartments(departments);

		University university = new University(1234, "JNTU", colleges);
		university.setColleges(colleges);

		DepartmantService departmentService = new DepartmentServiceImpl();
		//Student info = null;
		try {
			Student info = departmentService.searchStudent(department, idNo);

			if (info != null) {

				if (info.getStudentId() >= 11 && info.getStudentId() <= 15) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college1.getCollegeId());
					System.out.println("College name is : " + college1.getCollegeName());
					System.out.println("Department Id is : " + department1.getDepartmentId());
					System.out.println("Department name is : " + department1.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());

				}

			/*	else if (info.getStudentId() >= 16 && info.getStudentId() <= 20) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college1.getCollegeId());
					System.out.println("College name is : " + college1.getCollegeName());
					System.out.println("Department Id is : " + department2.getDepartmentId());
					System.out.println("Department name is : " + department2.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				} else if (info.getStudentId() >= 21 && info.getStudentId() <= 25) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college2.getCollegeId());
					System.out.println("College name is : " + college2.getCollegeName());
					System.out.println("Department Id is : " + department3.getDepartmentId());
					System.out.println("Department name is : " + department3.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				} else if (info.getStudentId() >= 26 && info.getStudentId() <= 30) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college2.getCollegeId());
					System.out.println("College name is : " + college2.getCollegeName());
					System.out.println("Department Id is : " + department3.getDepartmentId());
					System.out.println("Department name is : " + department3.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				}
				
			}*/
			}
		else
			{
				System.err.println("No Data Found");
			}
		} catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
} 

