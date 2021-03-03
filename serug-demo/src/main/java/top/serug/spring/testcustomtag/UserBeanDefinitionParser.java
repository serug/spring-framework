package top.serug.spring.testcustomtag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import top.serug.spring.testcustomtag.bean.User;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/27
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	/**
	 * E1 ement对应的类，之前这里的方法置灰，表示没有调用到，导致bean没有被用到，导致的原因是不是重写的方方
	 * @param element the {@code Element} that is being parsed
	 * @return
	 */
	@Override
	protected Class<User> getBeanClass(Element element) {
		return User.class;
	}

	/**
	 * 从 element中解析并提取对应的元素
	 */
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean){
		String userName = element.getAttribute("userName");
		String email =element.getAttribute("email");
		//将提取的数据放入到 Bean DefinitionBuilder中,待到完成所有bean的解析后统一注册到beanFactory中
		if (StringUtils.hasText(userName )){
			bean. addPropertyValue("userName", userName);
		}
		if (StringUtils.hasText(email)){
			bean. addPropertyValue("email", email);
		}
	}
}