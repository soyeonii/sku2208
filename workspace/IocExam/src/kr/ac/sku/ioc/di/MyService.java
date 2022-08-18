package kr.ac.sku.ioc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {
	private String name;
	private int count;
	
	@Autowired
	private MyDAO myDao;
	
//	public MyService() {
//	}
//	
//	public MyService(MyDAO myDAO) {
//		this.myDao = myDAO;
//	}
	
	public void checkPrint() {
		myDao.print();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public MyDAO getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDAO myDao) {
		this.myDao = myDao;
	}
}
