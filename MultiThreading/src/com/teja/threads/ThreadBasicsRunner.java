package com.teja.threads;

class Task1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print(i + ",");
		}
		System.out.println("\n Task1 Completed");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {

		for (int i = 100; i < 200; i++) {
			System.out.print(i + ",");
		}

		System.out.println("\n Task2 Completed");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

		Task1 task1 = new Task1();

		task1.setPriority(1);

		task1.start();

		Task2 task2 = new Task2();

		Thread threadTask2 = new Thread(task2);
		threadTask2.setPriority(10);

		threadTask2.start();

		task1.join();

		for (int i = 200; i < 300; i++) {
			System.out.print(i + ",");
		}

		System.out.println("\n Task3 Completed");

	}

}
