import java.util.Scanner;

public class PaintThisRoom
{
public static double paintCalc(double l, double w, double h) {
	
	double totalSqft;
	
	totalSqFt= (2*l*h)+(2*h*w);

	
	return totalSqft;
}
public static void main (String[] args)
{
double length, width, height;
int COVERAGE = 275;
Scanner keyboard = new Scanner(System.in);

System.out.print("Enter the length of the room: ");
length = keyboard.nextInt();

System.out.print("Enter the height of the room: ");
height = keyboard.nextInt();

System.out.print("Enter the width of the room: ");
width = keyboard.nextInt();

double paintNeeded = paintCalc(length, height, width)/COVERAGE;
System.out.printf("%.2f gallons of paint is needed to paint the room.\nLength:\t%.0f\nWidth:\t%.0f\nHeight:\t%.0f\n\n",paintNeeded, length, width, height);
//calculations 
//7. Compute the total square feet of the walls to be painted

//double totalSQ = ;
//8. Compute the amount of paint needed

//output with calculations rounded to 2 decimal places
int doors, wind;
System.out.println("Enter amount of doors in the room (0 if there is none): ");
doors = keyboard.nextInt();
System.out.println("Enter amount of windows in the room (0 if there is none): ");
wind = keyboard.nextInt();
double doorSqft = doors*25;
double windSqft = wind*20;
double newSqft = ((paintCalc(length, height, width)-doorSqft)-windSqft);
double paintNeededNEW = newSqft/COVERAGE;
System.out.printf("\nAmount of doors:\t%d\nAmount of windows:\t%d\nAmount of paint needed (in gallons) after removing doors and windows:\t%.2f",doors, wind,paintNeededNEW);
//10. Suppose the room has doors and windows that don't need painting. 
//Ask the user to enter the number of doors and number of windows in the room, and adjust the total square feet to be painted accordingly. 
//Assume that each door is 25 square feet and each window is 20 square feet.
} 
}
