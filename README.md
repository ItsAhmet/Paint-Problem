# Paint Problem 
Create a file named PaintThisRoom.  Fill in the missing code from the following program. 
(This should be done in Eclipse or repl.it, then attach the Java file to assignment)

import java.util.Scanner;
public class PaintThisRoom
{
public static void main (String[] args)
{

final int  COVERAGE =275;	//paint covers 275sq. feet/gallon

//1. Declare integers length, width, height
//2. Declare doubles totalSqFt, paintNeeded

//3. Declare and initialize object scanner
//4. Prompt for and read in the length of the room
//5. Prompt for and read in the height of the room
//6. Prompt for and read in the width of the room

//calculations 
//7. Compute the total square feet of the walls to be painted
//8. Compute the amount of paint needed

//output with calculations rounded to 2 decimal places
//9. Print the length, width, and height of the room and the gallons of paint //needed.

//10. Suppose the room has doors and windows that don't need painting. 
Ask the user to enter the number of doors and number of windows in the room, and adjust the total square feet to be painted accordingly. 
Assume that each door is 25 square feet and each window is 20 square feet.
} 
}

Extension 01:
Create another file named PaintThisRoomEstimate.  This new class will duplicate all of the printouts from PaintThisRoom, and will add the following:

Create an invoice (bill) that includes the cost of the paint and labor, with a total estimate at the bottom
Paint cost (per gallon) should be entered by the user.  The customer is expected to pay for total paint purchased, not just used.  Therefore, if the painter needs 2.4 gallons to paint a room, the customer is charged for 3 gallons.  If you are interested, the average cost of paint is about $25 / gallon.
Labor cost varies according to how much square footage must be painted, as well as  how much trim exists in a room – trim (moulding) takes much longer to paint.
Moulding in a room typically runs along the bottom of the walls, as well as around the windows and doors.  Use the length and width supplied by the user to calculate the lower moulding.  Add 13 feet of moulding for each door and 12 feet of moulding for each window.
Use the following rates when calculating labor cost
Bill 15 minutes for every 200 square foot (or portion thereof) of wall space.  So, 500 sq. ft of wall would be billed 45 minutes.
Bill 10 minutes for every 10 linear feet (or portion thereof) of trim painting.  Therefore, 95 linear feet of trim painting would be billed for 100 minutes.
Convert your minutes into hours and charge $50 / hour for labor costs.
Print out your invoice in the console to include a breakdown of all calculations, detailing costs as they relate to each calculation (gallons, total area, linear foot of trim).  Be sure to make your invoice look professional by using printf to line up the dollars and cents.

Extension 02:
If you feel especially challenged, create another file named PaintThisHouseEstimate.  This new class will duplicate all of the printouts from PaintThisRoomEstimate, but will be for multiple rooms.  In order to do this, you will probably need to make use of loops.  This is a very challenging project, so only take this on if you are able.

