package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Product;
// 교재 132P
// Product에 대한 기능을 정의(상품정보 정리하는 클래스)
public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	public ProductRepository() {
		//원래는 DB에서 가져올 데이터이다
		// 지금 DB를 배우지 않았기 때문에 그냥 3개를 만들었음
		Product phone = new Product("1234", "iphone 6s", 800000);
		phone.setDescription("4.5-inch, 1334X750 어쩌구");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("1235", "Gram", 1500000);
		notebook.setDescription("4.5-inch, 1334X750 ");
		notebook.setCategory("Smart Phone");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refubished");
		
		Product tablet = new Product("1236", "Galaxy Tap", 900000);
		tablet.setDescription("4.5-inch, 1334X750 ");
		tablet.setCategory("Smart Phone");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		products.add(phone);
		products.add(notebook);
		products.add(tablet);
		
	}
	//모든 상품정보를 가져온다
	public List<Product> getAllProducts(){
		return products;
	}
}
