package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		DepartmentDao dep = DaoFactory.createDepartmentDao();
		
		Department dep1 = new Department(null, "salgados");
		dep.insert(dep1);


		

		
		
	}

}
