package com.codenotfound.model.factory;

import com.codenotfound.model.dao.AcademicDao;
import com.codenotfound.model.dao.AcademicDaoImpl;

public class AcademicDaoFactoryImpl extends AcademicDaoFactory {
    //public static final String DATASOURCE = "jdbc/ruda_masindivDS";

    @Override
    public AcademicDao getAcademicDao(){
    	return new AcademicDaoImpl();
    }


}