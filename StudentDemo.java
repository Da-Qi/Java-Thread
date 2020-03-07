package Thread_05;
/**
 * 把Student的成员变量给私有了
 * 把设置和获取的操作给封装为了功能，并加了同步
 * 设置和获取的线程里面只需要调方法即可
 *
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();
		
		//设置和获取类
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		//线程类
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		//启动线程
		t1.start();
		t2.start();
	}
}
