/*
 Program 1. Create a Thread using Lambda.
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q1;

public class ThreadLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread without lambda
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Without Lambda..." + Thread.currentThread().getName() + ": thread is running");
			}
		};
		Thread t1 = new Thread(r1, "Snehasish"); // creating object t1
		t1.start(); // starts the thread t1

		// Thread with lambda
		Runnable r2 = () -> {
			System.out.println("With Lambda...." + Thread.currentThread().getName() + ": thread is running");
		};
		Thread t2 = new Thread(r2, "Sne Ha Sish"); // creating object t2
		t2.start(); // starts the thread t2
	}

}