import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {

		LinkedList<String> names = new LinkedList<String>();

		names.add("Caleb");
		names.add("Sue");
		names.add("Sally");

		for (int i = 0; i < names.size(); i++) {
			System.out.println((i+1) + ": " + names.get(i));
		}

		names.push("Nello");

		for (int i = 0; i < names.size(); i++) {
			System.out.println((i + 1) + ": " + names.get(i));
		}
		
		System.out.println(names.pop());

		for (int i = 0; i < names.size(); i++) {
			System.out.println((i + 1) + ": " + names.get(i));
		}
	}
}
