package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicDao;

public abstract class AcademicDaoFactory extends DAOFactory{
	
    public abstract AcademicDao getAcademicDao();
    
}



