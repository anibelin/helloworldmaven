package com.docker.cdr.helloWorldMaven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		while(true){
			System.out.print("Ahh ");
			sleep(400);
			System.out.print("Ahh ");
			sleep(400);
			System.out.print("Ahh ");
			sleep(400);
			System.out.print("Ahh ");
			sleep(400);
			System.out.println("Staying alive!");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			sleep(1000);
		}

	}

	public static void sleep(int nano) {
		try {

			Thread.sleep(nano);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
