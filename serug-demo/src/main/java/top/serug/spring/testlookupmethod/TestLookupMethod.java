package top.serug.spring.testlookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/25
 */
public class TestLookupMethod {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("lookupMethodTest.xml");
		GetBeanTest getBeanTest = (GetBeanTest) bf.getBean("getBeanTest");
		getBeanTest.showMe();
	}
}
