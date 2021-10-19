package com.tahauddin.syed;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class Employee {
	
	private Employee() {
		System.out.println("Object Created..");
	}
	
	private static Employee instancce;
	
	public static Employee getInstance() {
		/**
		 * to check weather instance is null then only enter into synchronized block
		 * this is called double null check in singleton pattern
		 * if 1st null check is not there then other threads should wait for 1st thread to 
		 * complete, hence waiting time for other threads will be increased. performance will be 
		 * decreaded. hence to improve the performance we added null check before synchronized block
		 * hence added null check before entering the synchronized block
		 */
		if(instancce == null) { 
			/**
			 * to lock the mechanism of creating the object be accessible to only 1 thread.
			 */
			synchronized (Employee.class) {
				if(instancce == null) {
					instancce = new Employee();
				}
			}
		}
		return instancce;
	}

}
