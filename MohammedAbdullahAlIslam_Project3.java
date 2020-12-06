/*The project is a flash card where the user begins with typing their name in. 
 * After that they select what kind of Mathematical operation they would like to do, 
 * including Addition, Subtraction, Multiplication and Division. 
 * They can only select one operation per run of the program. After that, it will ask the user for the 
 * highest and lowest number of factors they would like to be involved in the math problems. Following that, 
 * they will be asked to input the number of problems they would like to solve.
 * It will then directly process the information and output a question to the user. 
 * If the user is correct, it will print out “Correct”, else it will say “Incorrect”. 
 * After going through the number of problems (iterations) that the user wanted, it will go the Session Summary 
 * where it will state the number of problems done, the number of correct answer, a score, the amount of time taken to complete 
 * the game along with the User’s name, the type of operation they did, and the date and time.
 * 
 * In the current version of the program, after the session summary, the program will ask the user whether they would like to restart the game.
 * If they say Yes, the game will restart. If they say No, the program will thank them for playing and exit.
 *
 * 
 * 
 * ------ANALYSIS------
 * The way this project works is complex. Instead of having one (1) class for the whole project, we have three (3). The driver method known as MohammedAbdullahAlIslam_Project3, and two other classes of Problem and Session.
 * The function of the Driver class is to take all user inputs about their name, number of problems, math operation, user answer, maximum range and minimum range. After getting these info, the math questions are generated out
 * to the user. But not everything occurs in the driver class or main method.
 * 
 * Name can now be entered with multiple tokens and spaces between them as "Mohammed Abdullah" which in previous iterations would crash the program and has been achieved via scan.nextLine(), where as previously scan.next() would not allow a space
 * for a name. I have not prevented the program from accepting Integer or special characters, as it would be unfair to Elon Musk's son reportedly named "X Æ A-12"
 * 
 * Problem class is being used for multiple functions. First of all, it is used to generate random value 1 and random value 2 and then returned to the main method when called upon. When we go into the Switch cases, more methods of 
 * Problems class are invoked from Addition, Subtraction, Multiplication or Division depending on user input. 
 * 
 * 
 * A new addition to all these codes for Project 3 that has been added is Exception Handling code. The codes have been written to prevent the program prematurely crashing if a wrong value or input is given, or if an input cannot be understood
 * by the program's logic. The exception handling codes have been written in multiple different ways. One of the exception handling that has been added is when a wrong type of value has been input in a class, for example, if someone mistakenly 
 * types in a character instead of an integer for an int class, the code will inform the user of the mistake and repeat the question to allow them to input the right value, instead of prematurely crashing. This has also been done to prevent users
 * from entering a value that is under 0.
 * 
 * These values are called by the main method and then the user inputs their value. At the same time, all the information that are returned from the problem method are saved in different arrays to store values of random1, random2,
 * user answer among others.
 * 
 * All the values including user's answer, system's answer, values of various arrays are sent to the session class. In the session class, the userAns, sysAns and listResult are used to determine whether the user gave a correct or incorrect
 * answer, and then returns the result to the user while at the same time increasing userScore if the user is correct. The getUserScore setter is used to return the information back to whichever method calls upon it.
 * Finally the session summary method uses all the data from the various variables to output a summary of how many problems the user did; how many were right or wrong; the score; the time it took to complete the game; the number of problems
 * the user wanted to do and finally all the math problems are printed below by showing what the user had input, what the right answer was and whether each answers were Correct or Incorrect.
 * 
 * At the end of the game, the program will ask the user whether they would like to restart the game. This code has been added to allow for multiple games via the console, instead of gaming to click the "Play" button from the SDK.
 * This has also been given exception handling for proper input. If the user selects Y, the game will restart. If the user selects N, the game will exit. But if the user inputs a wrong value, it will tell them the input is invalid and repeat
 * the question. These have been put to prevent crashing.
 * 
 * Version 3.0 of the program has been coded to make sure any form of crashes can be prevented. There may be unforeseen causes for a crash, but currently a file to output crash causes have not been made, as the requirement did not specify to make it.
 * 
 * -----DESIGN-----
 * Version 1.0 and Version 2.0 designing took up 1/3 of the total time of the whole project. During design, I had to make sure where I would be putting each section of the code. This also included making sure that the driver class was able to call upon codes;
 * data from one class could be and would be transferred properly. The way the code flowed was also put into the design. Different iteration of the program was made, and then simplified over each iteration by using better coding or 
 * removing bulky and unused codes.
 * 
 * Version 3.0 took significantly less time than the previous versions as the main set of codes have been reused. Nothing major has been changed, except for few small tweaking to make sure all codes work in tandem. The major difference is the addition of the exception
 * codes to prevent any form of crashing. Each code that has user input has been wrapped with conditional and exception codes to prevent wrong inputs or crashes.
 * 
 * The main changes have been done in the DRIVER class, while the Problem class did not see any form of change and the Summary class has seen some new codes being added.
 * 
 * ______DRIVER CLASS______
 *  exit : boolean
 *  while loop which carries the whole program
 *  {
 *  name : String
 *  opeation : char
 *  ops : String
 *  caseName : String
 *  maxRange : int
 *  minRange : int
 *  numProblem : int
 *  sysAns : int
 *  userAns : int
 *  list1 : int array
 *  list2 : int array
 *  listAns : int array
 *  listResult : String
 *  listSysAns : int
 *  s : int
 *  mathOps : String
 *  
 * 	startTime : long
 * 
 * 		for-loop
 * 			rand1 : int
 * 			rand2 : int
 * 		  switch
 * 
 * 	 userResult
 * 		
 *  endTime : long
 * 
 * Session Summary
 * 
 * Restart Game
 * }
 * 
 * ***********************************************
 * 
 *  _____PROBLEM CLASS_____
 *  n1 : int private
 *  getRand1 setter method
 *  getN1 getter method
 *  
 *  n1 : int private
 *  getRand2 setter method
 *  getN2 getter method
 *  
 *  a : int private
 *  Addition setter method
 *  sysAnsA getter method
 *  
 *  s : int private
 *  Subtraction setter method
 *  sysAnsS getter method
 *  
 *  m : int private
 *  Multiplication setter method
 *  sysAnsM getter method
 *  
 *  d : int private
 *  Division setter method
 *  sysAnsD getter method
 *  
 *  ***********************************************
 *  _____SESSION CLASS_____
 *  uS : int private
 *  getResult method : void
 *  getUserScore : int getter method
 *  
 *  getUserScore : int
 *  sessionSummary : void 
 *  
 *  num : int private
 *  setNumOfProb : void
 *  numOfProb : int getter method
 *  
 *  max : int private
 *  setMaxRange : void
 *  maxRange : int getter method
 *  
 *  min : int private
 *  setMinRange : void
 *  minRange : int getter method
 *  
 *  ans : int private
 *  getAns : void
 *  uAns : int getter method
 *  
 *  ***********************************************
 * 
 * -----TESTING------
 * Version 3.0 has been scrutinized heavily. This includes the basic of using various maximum and minimum ranges, along with differing number of problems and different operations. During testing, I made sure all the answers came out correct and the values were saved properly in the arrays,
 * and made sure the summary was correct. Any issues that arose during tests were debugged right away. Multiple forms of issues occurred during testing, but they were solved with little tweaking to the codes.
 * 
 * While testing during each step of user Input I used wrong ranges of inputs including special characters, letters and values including 0 and less to check whether the program recognized the wrong input, informed the user of the wrong input, while repeating the question to the user for thier
 * input without having any form of crashes.
 * 
 * 
 * 
 * TEST 1
 * Enter your name: Mohammed Abdullah Al Islam
 * Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: a
 * Please tell me your highest number: 15
 * Please tell me your lowest number: 1
 * Please tell me the number of problems you want to do: 5
 * 3 + 14 = 17
 * Correct.
 * 3 + 7 = 9
 * Incorrect
 * 4 + 12 = 16
 * Correct.
 * 14 + 3 = 17
 * Correct.
 * 6 + 11 = 18
 * Incorrect

 * Session Summary

 * Range: 1 - 15, 5 problems, 3 correct
 * Score is 60.0, Time is 11 seconds
 * Session for Mohammed Abdullah Al Islam was Addition on 2020-10-25 at 23:37:22.727845900
 * 3 + 14 = 17 A: 17 Correct. 
 * 3 + 7 = 10 A: 9 Incorrect. 
 * 4 + 12 = 16 A: 16 Correct. 
 * 14 + 3 = 17 A: 17 Correct. 
 * 6 + 11 = 17 A: 18 Incorrect. 
 *
 * Would you like to play again? Y = Yes, N = No : n
 * Thank You for Playing!
 *
 *
 *
 *	TEST 2
 *	Enter your name: Mo Al
 *	Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: m
 *	Please tell me your highest number: -5
 *	Maximum Range must be > 0. Try again.
 *	java.lang.IllegalArgumentException: maxRange cannot be <=0
 *	Please tell me your highest number: q
 * 	Non-integer entered, integer is required. Try again
 *	java.util.InputMismatchException
 * 	Please tell me your highest number: 10
 *	Please tell me your lowest number: 0
 *	Minimum Range must be > 0. Try again.
 *	java.lang.IllegalArgumentException: minRange cannot be <=0
 * 	Please tell me your lowest number: y
 * 	Non-integer entered, integer is required. Try again
 *	java.util.InputMismatchException
 * 	Please tell me your lowest number: 1
 *	Please tell me the number of problems you want to do: /
 *	Non-integer entered, integer is required. Try again
 * 	java.util.InputMismatchException
 *	Please tell me the number of problems you want to do: -1
 *	Number of problems must be > 0. Try again.
 * 	java.lang.IllegalArgumentException: numOfProb cannot be <= 0
 *	Please tell me the number of problems you want to do: 3
 *	10 * 4 = y
 * 	Non-integer entered, integer is required. Try again
 *	java.util.InputMismatchException
 *	10 * 4 = 40
 *	Correct.
 *	3 * 8 = 24
 *	Correct.
 *	10 * 7 = I did a woopsie
 *	Non-integer entered, integer is required. Try again
 *	java.util.InputMismatchException
 *	10 * 7 = 70
 *	Correct.
 *	
 *	Session Summary
 *	
 *	Range: 1 - 10, 3 problems, 3 correct
 *	Score is 100.0, Time is 37 seconds
 *	Session for Mo Al was Multiplication on 2020-10-25 at 23:39:45.273903700
 *	10 * 4 = 40 A: 40 Correct. 
 *	3 * 8 = 24 A: 24 Correct. 
 *	10 * 7 = 70 A: 70 Correct. 
 *	
 *	Would you like to play again? Y = Yes, N = No : q
 *	Invalid Input. Try again.
 *	
 *	Would you like to play again? Y = Yes, N = No : 1
 *	Invalid Input. Try again.
 *	
 * 	Would you like to play again? Y = Yes, N = No : n
 *	Thank You for Playing!
 */

import java.util.*;  // Importing Keyboard input.



/* DRIVER CLASS */
public class MohammedAbdullahAlIslam_Project3 {  

	
	public static void main(String[] args) {
		
		boolean exit = false; // Boolean condition whether to restart the game or not. Default value is false.
		
		// while loop with all the program codes inside to execute the game for the user. 
		while(!exit){
		// Design Outline
			Scanner scan = new Scanner(System.in); // Initializing keyboard input called "scan" for the main method.
				// Main method
				
				
				String name = null; // String for user input initialized as null.
				// Get input values
				System.out.print("Enter your name: "); // Printing out asking user their name
				name = scan.nextLine(); 		 // Initializing String "name" and taking user input. nextLine is used to allow for spaces "  " to be included in the name.
				char operation; // Initializing operation as char to take user input and condition the system to take only the first character if the user mistakenly inputs more
				String ops = null; // Initializing ops as string, which will be used for assigning math operations. It will convert the first character of the char operation to a string value
				int numProblem = 0; // Initializing number of problems.
				String caseName = null;	// Initializing a string as caseName to let user know what operation they undertook.
				int minRange = 0; // Initializing minimum range for the lowest digit the user wants to use
				int maxRange = 0; // Initializing maximum range for the highest digit the user wants to use
				
				
				// Math operation input with exception handling
				boolean tryAgainOperation = true; // Boolean for making sure user inputs only A, S, M or D. If they input any other value, the question will repeat asking for input. Default value is true
				do {
				System.out.print("Enter 'A' for Addition, 'S' for Subtraction, 'M' for Multiplication, 'D' for Division: "); // Printing out asking user for type of math operation they want to perform
				operation = scan.next().charAt(0); // User inputs the operation they want for the math game, input as a char and only the first value at the location 0 will be accepted and everything else will be ignored.
				ops = String.valueOf(operation);	// Conversion from character to string value of ops to be used for the game
				
				// if loop where if the user inputs the proper character, the question will not be repeated and the program will move forward
				if (ops.equalsIgnoreCase("a") || ops.equalsIgnoreCase("s") || ops.equalsIgnoreCase("m") || ops.equalsIgnoreCase("d"))
					tryAgainOperation = false; // When if conditions are fulfilled, tryAgainOperation will become false and the code will move forward.
				
				// else loop where if the user inputs the wrong character or an integer, it will ask for proper input and repeat.
				else
					System.out.println("Operation must be A, S, D or M. Try again." + "\n");
				} while(tryAgainOperation); // Condition for repeating the do-while loop. As long as tryAgain Operation stays as true, the question for operation input will be true.
				
				
				
	 /*********************MAX RANGE CODE***********************/			
				// Code to take in maxRange and also exception handling.
				boolean tryAgainMaxRange = true; // Repeat the loop as long as the value stays true. Default value true.
				
				//do-while loop
				do {
					
						try { // trying to check whether proper conditions are met
							System.out.print("Please tell me your highest number: "); // Asking user their highest number by printing out
							maxRange = scan.nextInt();    //	Initializing integer maxRange for the highest digit user wants to use and taking user input
							session.setMaxRange(maxRange); // Sending value to session class -> setMaxRange method to check whether the value is above 0(zero)
							tryAgainMaxRange = false; // if proper conditions are met, the question will not be repeated.
						}
						
						/* catch code to make sure user entered an integer value. If the user input non-integer value, e1 code will execute, and will let the user know
						 * that the input is non-integer and repeat question for max range.
						 */
						catch (InputMismatchException e1) {
							System.out.println("Non-integer entered, integer is required. Try again" + "\n");
							System.out.println(e1); // Prints out InputMismatchException the user. Can be commented out or deleted to prevent user confusion.
							scan.nextLine();
						}
						
						//catch code to make sure user has put a value over 0. If the value is wrong, it will let user know and ask the max range question again
						catch (IllegalArgumentException e2) {
							System.out.println("Maximum Range must be > 0. Try again." + "\n");
							System.out.println(e2); // Prints out IllegalArgumentException the user. Can be commented out or deleted to prevent user confusion.
							scan.nextLine();
						}
				} while (tryAgainMaxRange); // while condition for the do-while loop, as long as the value of tryAgainMaxRange stays true, it will repeat the loop.
				
				
	/****************************MIN RANGE CODE**********************/			
				// Code to take in minRange and also exception handling.
				boolean tryAgainMinRange = true; // Repeat the loop as long as the value stays true. Default value true.
				
				//do-while loop
				do {
					
						try { // trying to check whether proper conditions are met
							System.out.print("Please tell me your lowest number: "); // Asking user their lower number by printing out
							minRange = scan.nextInt();    // Initializing integer maxRange for the lowest digit user wants to use and taking user input
							session.setMinRange(minRange); // Sending value to session class -> setMinRange method to check whether the value is above 0(zero)
							tryAgainMinRange = false; // if proper conditions are met, the question will not be repeated.
						}
						/* catch code to make sure user entered an integer value. If the user input non-integer value, e1 code will execute, and will let the user know
						 * that the input is non-integer and repeat question for max range.
						 */
						catch (InputMismatchException e1) {
							System.out.println("Non-integer entered, integer is required. Try again" + "\n");
							System.out.println(e1); // Prints out InputMismatchException the user. Can be commented out or deleted to prevent user confusion.
							scan.nextLine();
						}
						//catch code to make sure user has put a value over 0. If the value is wrong, it will let user know and ask the max range question again
						catch (IllegalArgumentException e2) {
							System.out.println("Minimum Range must be > 0. Try again." + "\n");
							System.out.println(e2); // Prints out IllegalArgumentException the user. Can be commented out or deleted to prevent user confusion.
							scan.nextLine();
						}
				} while (tryAgainMinRange); // while condition for the do-while loop, as long as the value of tryAgainMaxRange stays true, it will repeat the loop.
						
				
				
		/*****************************NUMBER OF PROBLEMS CODE**********************************************/		
				// Code to take in the numProblem and exception handling
				boolean tryAgainNumProblem = true; // Repeat the loop as long as the value stays true. Default value true.
				do { //do-while loop
						try { // trying to check whether proper conditions are met
							System.out.print("Please tell me the number of problems you want to do: "); // Asking user by printing out
							numProblem = scan.nextInt();	 //	Number of Problems the user wants to do by invoking getProbNum method in the session class.
							session.setNumOfProb(numProblem); // Sending value to session class -> setNumOfProb method to check whether the value is above 0(zero)
							tryAgainNumProblem = false; // if proper conditions are met, the question will not be repeated.
						}
						/* catch code to make sure user entered an integer value. If the user input non-integer value, e1 code will execute, and will let the user know
						 * that the input is non-integer and repeat question for max range.
						 */
						catch (InputMismatchException e1) {
							System.out.println("Non-integer entered, integer is required. Try again" + "\n");
							System.out.println(e1); // Prints out InputMismatchException the user. Can be commented out or deleted to prevent user confusion.
							scan.nextLine();
						}
						//catch code to make sure user has put a value over 0. If the value is wrong, it will let user know and ask the max range question again
						catch (IllegalArgumentException e2) {
							System.out.println("Number of problems must be > 0. Try again." + "\n");
							System.out.println(e2); // Prints out IllegalArgumentException the user. Can be commented out or deleted to prevent user confusion.
							scan.nextLine();
						}
				
				} while (tryAgainNumProblem); // while condition for the do-while loop, as long as the value of tryAgainMinRange stays true, it will repeat the loop.
				
				
				
		/*************************************************************************/		
				
				
				int sysAns = 0;					 // Initializing integer sysAns, which is the Answer the system will calculate
				int userAns = 0;				 // Initializing integer useAns, which is the Answer the user will input
				
				int[] list1 = new int[numProblem]; // Initializing list1 array to save values of random number 1
				int[] list2 = new int[numProblem]; // Initializing list2 array to save values of random number 2
				int[] listAns = new int[numProblem]; // Initializing listAns array to save value of number of problems
				String[] listResult = new String[numProblem]; // Initializing listResult array and saving the results of "Correct" and/or "Incorrect"
				int[] listSysAns = new int[numProblem]; // Initializing listSysAns array to save the system answers.
				int s = 0; // Initializing s to keep count of user's score in the main method.
				String[] mathOps = new String[numProblem]; // Initializing mathOps array to save the operator used for each questions.
				
				long startTime = System.currentTimeMillis();  // Starting time for the clock when the user starts the application.
				
				// For Loop to keep the application running for whatever number of executions needed that the user inputs for the numProblem.
				for (int i = 0; i < numProblem; i++) { //i is number of instances which will decrease till i becomes 0 and then the loop will not execute anymore.	
					
					int rand1 = Problems.getRand1(maxRange, minRange); // initializing rand1 to get a random number from getRand1 method in Problems class
					int rand2 = Problems.getRand2(maxRange, minRange); // initializing rand2 to get a random number from getRand2 method in Problems class
					
					/* Operation cases (switch) for string ops. In the getOperation method, user will select what Operation they want
					 * to do. 
					 */
					switch (ops.toUpperCase()) 	
					{ 	
					//  Addition: If user presses A for input, it will start case 'A', for Addition.
						case "A":{
							caseName = "Addition"; // Case name Addition activated for the Session Summary. It is a permanent variable.
							mathOps[i] = " + "; // Saving operator in mathOps at i location
						    Problems.Addition(rand1, rand2); // Sending information to the method for Addition
							sysAns = Problems.sysAnsA(); // System calculates the Addition problem, but does not show to user.
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
					
					//  Subtraction: If user presses S for input, it will start case 'S', for Subtraction.
						case "S": {	
							caseName = "Subtraction";	// Case name Subtraction activated for the Session Summary. It is a permanent variable.	
							mathOps[i] = " - "; // Saving operator in mathOps at i location
							Problems.Subtraction(rand1, rand2); // Sending information to the method for Subtraction
							sysAns = Problems.sysAnsS();	// System calculates the Subtraction problem, but does not show to user.
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
					
					//  Multiplication: If user presses M for input, it will start case 'M', for Multiplication.
						case "M":{
							caseName = "Multiplication"; // Case name Multiplication activated for the Session Summary. It is a permanent variable.
							mathOps[i] = " * "; // Saving operator in mathOps at i location
							Problems.Multiplication(rand1, rand2); // Sending information to the method for Multiplication
							sysAns = Problems.sysAnsM(); // System calculates the multiplication problem, but does not show to user.
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
					
					//  Division: If user presses D for input, it will start case 'D', for Division.
						case "D": {
							caseName = "Division"; // Case name Division activated for the Session Summary. It is a permanent variable.
							mathOps[i] = " / "; // Saving operator in mathOps at i location
							Problems.Division(rand1, rand2); // Sending information to the method for Division
							sysAns = Problems.sysAnsD(); // Calculates and sysAns for the user.	
							break; // Stops the case here and does not let it flow to the next Case, as it will execute unwanted code.
						}
				   }
				
					listSysAns[i] = sysAns; // Saving value of sysAns to listSysAns in an array location
					list1[i] = rand1; // Saving value of rand1 to list1 array
					list2[i] = rand2; // Saving value of rand2 to list2 array
					//userAns = scan.nextInt();
				
					
				/*****************USER ANSWER INPUT CODE***********************/
				// Code to take user input for answer and also exeption handling
				boolean tryAgainAns = true; // Repeat the loop as long as the value stays true. Default value true.
				
				do { //do-while loop
					try { // trying to check whether proper conditions are met
					userAns = scan.nextInt(); // Answer that the user inputs
					session.getAns(userAns);  // Sending value to session class -> getAns method to check whether the value is above 0(zero)
					tryAgainAns = false; // if proper conditions are met, the question will not be repeated.
					}
					
					/* catch code to make sure user entered an integer value. If the user input non-integer value, e1 code will execute, and will let the user know
					 * that the input is non-integer and repeat question for max range.
					 */
					catch (InputMismatchException e1) {
						System.out.println("Non-integer entered, integer is required. Try again" + "\n");
						System.out.println(e1);  // Prints out InputMismatchException the user. Can be commented out or deleted to prevent user confusion.
						
						System.out.print(list1[i] + mathOps[i] + list2[i] + " = "); // Repeats the question to the user with data from the corresponding array with the current i value.
						
						scan.nextLine();
					}
					
					//catch code to make sure user has put a value over 0. If the value is wrong, it will let user know and ask the max range question again
					catch (IllegalArgumentException e2) {
						System.out.println("Number of problems must be > 0. Try again." + "\n");
						System.out.println(e2); // Prints out IllegalArgumentException the user. Can be commented out or deleted to prevent user confusion.
						System.out.print(list1[i] + mathOps[i] + list2[i] + " = "); // Repeats the question to the user with data from the corresponding array with the current i value.
						scan.nextLine();
					}
					
				} while (tryAgainAns); // while condition for the do-while loop, as long as the value of tryAgainAns stays true, it will repeat the loop.
				
				
				/************************************************************************************/
					listAns[i] = userAns; // Saving user answer to listAns in one of the location	
					
					session.getResult(userAns, sysAns, listResult, i, s); // Invoking getResult method in the session class to check if user is Correct or Incorrect. s is also sent with the latest value during the current loop
					s = session.getUserScore(); // s returns with the new userScore if the result was correct;
				}
				
				long endTime = System.currentTimeMillis(); // Program ending time counted in millisecond.
				session.sessionSummary(numProblem, s, endTime, startTime, name, caseName, list1, list2, mathOps, listSysAns, listAns, listResult, maxRange, minRange); // Invoking sessionSummary method in session class by sending variable values
				
					
				/*****************************REPEAT GAME CODE************************************/
				boolean playAgainQ = true;  // Repeat the loop as long as the value stays true. Default value true.
				char play = 0; // character play to input user answer
				do { // do-while loop
					
						System.out.print("\n" + "Would you like to play again? Y = Yes, N = No : "); // Asking user whether they want to restart the game
						play = scan.next().charAt(0); // taking user input as a character at the location 0
						String playQ = String.valueOf(play); // Converting the character value answer to a string value
						
						if (playQ.equalsIgnoreCase("y")) { // If-loop to check and execute the code if the user has input y.	
							playAgainQ = false; // playAgainQ value becomes false to prevent the code from repeating
							exit = false; // Program will not exit.
						}
						else if (playQ.equalsIgnoreCase("n")){ // else-if loop to check and execute the code if the user has input n
							playAgainQ = false; // playAgainQ value becomes false to prevent the code form repeating
							System.out.print("Thank You for Playing! See You Soon!"); // Tells user Thank You for Playing!
							scan.close(); // Closing the keyboard input for the main method.
							System.exit(0); // Program exits.
						}
						else { // else loop to check and execute the code if the user has input anything other than y or n
							System.out.println("Invalid Input. Try again." + "\n"); // Tells user they have input the wrong value
							playAgainQ = true; // playAgainQ becomes true to repeat question
							exit = false; // Program will not exit
						}	
				} while (playAgainQ); // Condition to Restart the game. If value is true, the game will restart. If value is false, the game will not restart.
		} // while(!exit) closing bracket
	} // Main class closing bracket
} // Public Class Closing bracket