package com.cg.hibernatecollection;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernatecollection.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	    
		  SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		   Session session=factory.openSession();  
		  Transaction t=session.beginTransaction(); 	
		Employee emp1 = new Employee();
		 emp1.setEmpname("Ravi Malik");    
		 emp1.setEmail("ravi@gmail.com");    
		   
		Employee emp2 = new Employee();
		 emp2.setEmpname("Pinal sonar");    
		    emp2.setEmail("pinal@gmail.com");    
	   List<Employee>e1=new ArrayList<Employee>();
	   		e1.add(emp1);
	   		e1.add(emp2);
		    Department department = new Department();
		   // department.setDepartmentId(10);
			
			department.setDepartmentName("Sales");
			department.setLocation("Mumbai");
			department.setEmployees(e1);
			session.save(department);
		  	
		// session.save(emp1);
		//session.save(emp2);
		
		    t.commit();    
		        
		    session.close();    
		    System.out.println("Saving Success");    


	}

}
