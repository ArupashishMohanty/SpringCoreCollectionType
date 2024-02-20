package springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	System.out.println("hello");
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springcore/config.xml");
	Student std1=(Student)context.getBean("std1");
//	Student student2=(Student)context.getBean("student2");
//	Student student2=context.getBean(Student.class,"student2");
	System.out.println(std1.getName());
	System.out.println(std1.getPhones());
	System.out.println(std1.getCourses());
	System.out.println(std1.getAddres());
//	System.out.println(student2);
	
}
}
