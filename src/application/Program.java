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
		sellerDao.insert(sel);
		System.out.println("novo id =" + sel.getId());

	}

}
