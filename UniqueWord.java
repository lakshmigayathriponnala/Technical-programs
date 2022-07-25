import java.io.*;
import java.util.Scanner;

public class UniqueWord {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String s = scanner.nextLine();
		
		//Splitting the string by space and storing into string array
		String newStr[] = s.split(" ");
		
		System.out.println("The unique word of this string is :");
		for(int i=0;i<newStr.length;i++) {
			for(int j=0;j<newStr.length;j++) {
				
				//Storing the string value into temporary variable
				String temp1 = newStr[i];
				String temp2 = newStr[j];
				
				/*if second loop encounter same value again but j<i break the loop to 
				avoid printing of duplicate value*/
				if(j<i && temp1.equals(temp2))
        {
					break;
				}
				
				/*While traversing the array, if loop reached to last print the
				string with its number of count*/
				if(j==newStr.length-1) {
					System.out.println(newStr[i]);
				}
			}
		}
	}
}