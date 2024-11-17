package in.barath.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.barath.beans.UserService;

//IOC creation

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UserService user = context.getBean(UserService.class);
		user.userRegistration();
	}

}
