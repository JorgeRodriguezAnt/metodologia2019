package com.codenotfound.model.factory;

import com.codenotfound.model.dao.StudentDao;

public abstract class StudentDaoFactory extends DAOFactory{
	
    public abstract StudentDao getStudentDao();
    
}



