package com.tahauddin.syed;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class MyThread implements Runnable {

	@Override
	public void run() {
		Employee employee = Employee.getInstance();
		System.out.println(employee.hashCode());
	}

}
