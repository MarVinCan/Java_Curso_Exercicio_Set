package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Studants;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			Set<Studants> set = new HashSet<>();

			char[] vect = new char[3];
			vect[0] = 'A';
			vect[1] = 'B';
			vect[2] = 'C';

			for (int i = 0; i < vect.length; i++) {
				
				System.out.print("How many students for course "+ vect[i] + "? ");
				int n = sc.nextInt();
				

				for (int j = 0; j < n; j++) {

					set.add(new Studants(sc.nextInt()));
				}

			}
			
			System.out.println("Total students: " + set.size());

		} catch (RuntimeException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
