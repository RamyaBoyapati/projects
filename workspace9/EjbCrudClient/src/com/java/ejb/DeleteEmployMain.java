package com.java.ejb;

import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class DeleteEmployMain {
	public static void main(String[] args) throws NamingException, ClassNotFoundException, SQLException {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		   EmployCrudBeanRemote service = null;
		    service = (EmployCrudBeanRemote)
		    		new InitialContext().lookup("EmployCrudBean/remote");
		
			System.out.println(service.deleteEmployBean(empno));
		}

	}
