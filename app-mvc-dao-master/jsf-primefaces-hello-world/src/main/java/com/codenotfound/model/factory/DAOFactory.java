package com.codenotfound.model.factory;




public abstract class DAOFactory {
    public static final int STUDENT_REPOSITORY = 1;
    public static final int ACADEMIC_REPOSITORY = 2;
    public static DAOFactory getDAOFactory(int tipo) {
        switch (tipo) {
	        case STUDENT_REPOSITORY:
	            return new StudentDaoFactoryImpl(); 
                case ACADEMIC_REPOSITORY:
                    return new AcademicDaoFactoryImpl();
                        
	        default:
	            return null;
        }
    }


    

}
