package com.education.main;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.service.DepartmentService;
import com.education.service.DepartmentServiceImpl;

public class EducationApp {
	public static void main(String[] args) {
		Student student1 = new Student(12, "Madhu", 25);
		Student student2 = new Student(14, "Raju", 24);
		Student student3 = new Student(13, "Mahesh", 21);
		Student student4 = new Student(11, "Shreya", 22);
		Student student5 = new Student(12, "Sharath", 21);

		Department department = new Department();
		department.setDeptId(100);
		department.setDeptName("MECH");
		Department dep = new Department();
		dep.setDeptId(101);
		dep.setDeptName("ISE");

		College college1 = new College();
		college1.setCollegeId("A20");
		college1.setCollegeName("SJBIT");

		College college2 = new College();
		college2.setCollegeId("B20");
		college2.setCollegeName("MVJCE");
		College[] college = new College[2];
		college[0] = college1;
		college[1] = college2;
		Department[] departments = new Department[2];
		departments[0] = department;
		departments[1] = dep;
		college1.setDepartments(departments);

		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		department.setStudent(students);
		Student[] batch2 = new Student[2];
		batch2[0] = student4;
		batch2[1] = student5;
		dep.setStudent(batch2);

		DepartmentService departmentService = new DepartmentServiceImpl();

		Student student = departmentService.searchStudentById(department, 12);
		// Student[] student = departmentService.searchStudentById(departments, 456);

		Department departmentObj = departmentService.searhDepartmentsByDepartmentId(college1, "B20");

		if (departmentObj != null) {
			System.out.println("College Name " + college1.getCollegeName());
			System.out.println("College id " + college1.getCollegeId());
			System.out.println("Department Name" + college1.getDepartments());
			//System.out.println("Department Id" + departmentObj.getDeptId());
			System.out.println();
		}

		Student batch = departmentService.searchStudentById(dep, 11);
		if (batch != null) {
			System.out.println("student id " + batch.getStuId());
			System.out.println("student name " + batch.getStuName());
			System.out.println("student age " + batch.getStuAge());
			System.out.println("student departmentid " + dep.getDeptId());
			System.out.println("student department Name " + dep.getDeptName());
			System.out.println("student collegeName "+ college1.getCollegeName());
		}
		if (student != null) {
			System.out.println("student id " + student.getStuId());
			System.out.println("student name " + student.getStuName());
			System.out.println("student age " + student.getStuAge());
			System.out.println("student departmentid " + department.getDeptId());
			System.out.println("student department Name " + department.getDeptName());
		}
		// if (student != null) {
		// for (int i = 0; i < student.length; i++) {
		// System.out.println("student id " + student[i].getStuId());
		// System.out.println("student name " + student[i].getStuName());
		// System.out.println("student age " + student[i].getStuAge());
		// System.out.println("student departmentid " + departments[i].getDeptId());
		// System.out.println("student department Name " +
		// departments[i].getDeptName());
		// }
		// }
		Student studentObj = departmentService.searchStudentByName(department, "Suresh");
		if (studentObj != null) {
			System.out.println("student id " + studentObj.getStuId());
			System.out.println("student name " + studentObj.getStuName());
			System.out.println("student age " + studentObj.getStuAge());
			System.out.println("student departmentid " + department.getDeptId());
			System.out.println("student department Name " + department.getDeptName());
		}

	}

}
