package top.serug.spring.testcustomtag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.serug.spring.testcustomtag.bean.User;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/27
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("user.xml");
		User customUser = (User) bf.getBean("testBean");
		System.out.println(customUser.getUserName() + customUser.getEmail());

		// ApplicationContext context = new ClassPathXmlApplicationContext("huhx.xml");
		// SimpleDateFormat info = (SimpleDateFormat) context.getBean("dateFormat");
		// System.out.println(info.format(new Date()));
	}
}
