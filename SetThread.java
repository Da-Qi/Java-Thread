package Thread_05;

public class SetThread implements Runnable {

	private Student s;
	private int x = 0;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {

			if (x % 2 == 0) {
				s.set("��ѧ��", 18);

			} else {
				s.set("�Ź���", 25);

			}
			x++;
		}
	}

}
