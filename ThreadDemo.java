package Thread_06;

/*
 * �����ڲ���ʵ�ֶ��߳�
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// �̳�Thread����ʵ�ֶ��߳�
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}.start();

		// ʵ��Runnable�ӿ���ʵ�ֶ��߳�
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
