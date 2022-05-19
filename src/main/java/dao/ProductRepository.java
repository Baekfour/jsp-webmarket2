package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Product;
// ���� 132P
// Product�� ���� ����� ����(��ǰ���� �����ϴ� Ŭ����)
public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	public ProductRepository() {
		//������ DB���� ������ �������̴�
		// ���� DB�� ����� �ʾұ� ������ �׳� 3���� �������
		Product phone = new Product("1234", "iphone 6s", 800000);
		phone.setDescription("4.5-inch, 1334X750 ��¼��");
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
	//��� ��ǰ������ �����´�
	public List<Product> getAllProducts(){
		return products;
	}
}
