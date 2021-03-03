package top.serug.spring.testcustomtag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import java.text.SimpleDateFormat;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/27
 */
public class SimpleDateFormatBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<SimpleDateFormat> getBeanClass(Element element) {
		return SimpleDateFormat.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		// this will never be null since the schema explicitly requires that a value be supplied
		String pattern = element.getAttribute("pattern");
		bean.addConstructorArgValue(pattern);

		// this however is an optional property
		String lenient = element.getAttribute("lenient");
		if (StringUtils.hasText(lenient)) {
			bean.addPropertyValue("lenient", Boolean.valueOf(lenient));
		}
	}
}