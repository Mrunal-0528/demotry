package com.test.beans;
import com.service.beans.*;
import com.inter.beans.MyClass;

public class TestInterface {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.combination(4, 2);
		obj.permutation(5, 2);
		
		Interface1 obj1=new MyClass();
		obj1.combination(5, 1);
		
		Interface2 obj3=new MyClass();
		obj3.fun3();
		((MyClass)obj3).fun2(10);  
		//explicit typecasting as fun3 is in interface1 and not in interface2
		
		Interface1 obj4=new MyClass();
		obj4.fun4();
	}

}
