package day14;

public class ThreadLearn {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyTask("Thread A"));
		Thread t2 = new Thread(new MyTask("Thread B"));
		
		t1.start();
		t2.start();
	}
}

class MyTask implements Runnable{
	private String name;
	
	public MyTask(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			System.out.println(name + ": " + i);
		}
	}
}