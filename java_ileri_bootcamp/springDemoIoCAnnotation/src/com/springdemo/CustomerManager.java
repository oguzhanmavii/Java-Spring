package com.springdemo;

 public class CustomerManager implements ICustomerService{
	// CustomerManager'ı ICustomerService e implemente etmek gerekiyor
	// Yoksa sistem ICustomer Service i baz alıyor fakat Customer Manager
	// ICustomer Service e entegre olmadıgı için çakışma yaşıyor  
	 private ICustomerDal customerDal;
	 public CustomerManager(ICustomerDal database) {
		// TODO Auto-generated constructor stub
	}
	public void setCustomerDal(ICustomerDal customerDal) {
	 this.customerDal = customerDal;
}
    public void add() {
	
	 customerDal.add();
     }

 }
