package Thread_06;

/*
 * 匿名内部类实现多线程
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 继承Thread类来实现多线程
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}.start();

		// 实现Runnable接口来实现多线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}) {

		}.start();
	}
}
