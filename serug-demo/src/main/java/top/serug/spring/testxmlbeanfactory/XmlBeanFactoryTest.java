package top.serug.spring.testxmlbeanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import top.serug.spring.testxmlbeanfactory.bean.XmlBean;


/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/23
 */
public class XmlBeanFactoryTest {
	public static void main(String[] args) {
		// BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beansFactory.xml"));
		Resource resource=new ClassPathResource("beansFactory.xml");
		BeanFactory bf=new DefaultListableBeanFactory();
		BeanDefinitionReader bdr=new XmlBeanDefinitionReader((BeanDefinitionRegistry) bf);
		bdr.loadBeanDefinitions(resource);

		XmlBean xmlBean = (XmlBean) bf.getBean("xmlBean");
		System.out.println(xmlBean.getBeanType());
	}
}
