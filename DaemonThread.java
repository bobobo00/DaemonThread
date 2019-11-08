package thread;
/**
 * 守护线程是为用户线程服务的，jvm停止不用等待守护线程执行完毕
 * 默认所有线程都为用户线程，jvm等待用户线程执行完毕才会停止。
 * @author dell
 *
 */
public class DaemonThread {
	public static void main(String[] args) {
		Thread t1=new God();
		Thread t2=new You();
		t1.start();
		t1.setDaemon(true);//将用户线程设置为守护线程
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
