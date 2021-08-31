package com.education.service;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;

public interface DepartmentService {
public abstract Student searchStudentById(Department dep, int id);

public abstract Student searchStudentByName(Department department, String name);

public abstract Department searhDepartmentsByDepartmentId(College college1, String string);

}
