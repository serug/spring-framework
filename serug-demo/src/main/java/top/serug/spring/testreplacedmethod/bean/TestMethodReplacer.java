package top.serug.spring.testreplacedmethod.bean;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/25
 */
public class TestMethodReplacer implements MethodReplacer {
	/**
	 * Reimplement the given method.
	 *
	 * @param obj    the instance we're reimplementing the method for
	 * @param method the method to reimplement
	 * @param args   arguments to the method
	 * @return return value for the method
	 */
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("我替换了原来TestChangeMe.changeMe()");
		return null;
	}
}
