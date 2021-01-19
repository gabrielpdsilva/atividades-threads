package controller;

public class ThreadId extends Thread {
	
	public ThreadId() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("ID da thread: " + this.getId());
	}

}