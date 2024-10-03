import java.util.Scanner;

public class Main{
	
public static void main (String[] args){
	
System.out.println("Please type your name.");

Scanner scanner = new Scanner(System.in);

String input = scanner.nextLine();

System.out.println("Hello! "+input+" \n Please type your age:");

int age = scanner.nextInt();

System.out.println("You are "+age+" years old!\n");

int timeLeft = (67-age);

System.out.println("You have "+timeLeft+" years before retirement.");
}
}