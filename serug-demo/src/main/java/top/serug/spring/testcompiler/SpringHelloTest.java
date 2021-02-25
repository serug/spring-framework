package top.serug.spring.testcompiler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.serug.spring.testcompiler.config.SerugConfig;
import top.serug.spring.testcompiler.repository.Hello;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/22
 */
public class SpringHelloTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SerugConfig.class);
		Hello hello = ac.getBean(Hello.class);
		hello.hello();
	}
}
