package top.serug.spring.testlookupmethod;

import top.serug.spring.testlookupmethod.bean.User;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/25
 */
public abstract class GetBeanTest {
	public abstract User getBean();

	public void showMe(){
		this.getBean().showMe();
	}
}
