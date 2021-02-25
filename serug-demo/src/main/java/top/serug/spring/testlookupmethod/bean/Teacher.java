package top.serug.spring.testlookupmethod.bean;

/**
 * @description:
 * @author: zhangzhenhai
 * @date: 2021/2/25
 */
public class Teacher extends User{

	@Override
	public void showMe() {
		System.out.println("i am Teacher");
	}
}
