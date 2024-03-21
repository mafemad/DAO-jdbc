package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		Seller sel = new Seller(null, "greg", "greg@gmail.com", new Date(), 4000.0, dep);
		
		sel = sellerDao.findById(1);
		System.out.println(sel);
		sel.setName("carlinhos");
		sellerDao.update(sel);
		list.forEach(System.out::println);
		

		
		
	}

}
