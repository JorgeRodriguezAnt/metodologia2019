package com.codenotfound.services;

import java.util.List;

import javax.inject.Named;

import com.codenotfound.model.Student;
import com.codenotfound.model.factory.DAOFactory;
import com.codenotfound.model.factory.StudentDaoFactory;


@Named
public class StudentService {
	
	private StudentDaoFactory studentDaoFactory ;
	
	
	public StudentService() {
		this.studentDaoFactory = (StudentDaoFactory)DAOFactory.getDAOFactory(DAOFactory.STUDENT_REPOSITORY);
	}
	

    public List<Student> getStudentList() {
        return this.studentDaoFactory.getStudentDao().findAll();
    }
    

}