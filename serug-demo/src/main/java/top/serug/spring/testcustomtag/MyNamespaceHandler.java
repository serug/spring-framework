package top.serug.spring.testcustomtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/27
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
	// @Override
	// public void init() {
	// 	registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
	// }
}
