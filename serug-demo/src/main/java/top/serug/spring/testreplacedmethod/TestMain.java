package top.serug.spring.testreplacedmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.serug.spring.testreplacedmethod.bean.TestChangeMe;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/25
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("replaceMethodTest.xml");
		TestChangeMe testChangeMe = (TestChangeMe) bf.getBean("testChangeMe");
		testChangeMe.changeMe();
	}
}
