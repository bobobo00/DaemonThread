package thread;
/**
 * �ػ��߳���Ϊ�û��̷߳���ģ�jvmֹͣ���õȴ��ػ��߳�ִ�����
 * Ĭ�������̶߳�Ϊ�û��̣߳�jvm�ȴ��û��߳�ִ����ϲŻ�ֹͣ��
 * @author dell
 *
 */
public class DaemonThread {
	public static void main(String[] args) {
		Thread t1=new God();
		Thread t2=new You();
		t1.start();
		t1.setDaemon(true);//���û��߳�����Ϊ�ػ��߳�
		t2.start();
	
		
	}

}
class You extends Thread{
	public void run() {
		for(int i=0;i<365;i++) {
			System.out.println("happy every day");
		}
		
	}
}
class God extends Thread{
	public void run() {
		while(true) {
			System.out.println("every day");
		}
	}
}
