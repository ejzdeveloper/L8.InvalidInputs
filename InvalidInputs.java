package lab8;

import java.util.Scanner;

public class InvalidInputs {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String students[] = { "Thor", "Tony", "Tim", "Cecy", "Sofy", "Jackie", "Danny", "Pikachu", "Oscar", "Shawn" };
		String hometown[] = { "Asgard", "New York", "Manhatan", "Saltillo", "Saltillo", "Saltillo", "Saltillo", "Japon",
				"Cd. Acuna", "Canada" };
		String favoriteFood[] = { "Beer", "Salmon", "Hamburguers", "Pasta", "Bread sticks", "peaches", "Fries", "sushi",
				"grill beef", "Pizza" };
		int userInput; //to select a student
		String userChoice = ""; //to choose from hometown or favorite food.
		String userChoice2 = ""; // to choose yes or no.
		int index = 0;
		boolean flag = true;
		boolean tryAgaing = true;
		String userContinue = "yes"; //to select continue using the App.

		do {
			System.out.println(" Welcome to our Java class.");

			for (int i = 0; i < students.length; i++) {
				System.out.println((i + 1) + "." + students[i]);
			}
			System.out.println(">>Which student would you like to learn more about? (Enter a number 1-10)>>");
			userInput = scnr.nextInt();

			do {

				try {
					index = userInput - 1;
					System.out.println(">>You choose " + userInput + ". The student is " + students[index] + ".");
					System.out.println(">>What would you like to know about " + students[index]
							+ "? (enter \"hometown\" or \"favorite food\")>>");
					scnr.nextLine();
					userChoice = scnr.nextLine();
					do {
						if (userChoice.equalsIgnoreCase("hometown")) {
							System.out.println(students[index] + " is from " + hometown[index]);
							System.out.println(" Would you like to know more about " + students[index]
									+ " ? (enter \"yes\" or \"no\")>>");
							userChoice2 = scnr.nextLine();
							if (userChoice2.equalsIgnoreCase("yes")) {
								System.out.println(students[index] + " favorite food is " + favoriteFood[index]);
								System.out.println("That was all the information available about " + students[index]
										+ " thanks for using this App.");
								flag = false;
							} else if (userChoice2.equalsIgnoreCase("no")) {
								flag = false;
							}
						} else if (userChoice.equalsIgnoreCase("favorite food")) {
							System.out.println(students[index] + " favorite food is  " + favoriteFood[index]);
							System.out.println(" Would you like to know more? (enter \"yes\" or \"no\")>>");
							userChoice2 = scnr.nextLine();
							if (userChoice2.equalsIgnoreCase("yes")) {
								System.out.println(students[index] + " is from  " + hometown[index]);
								System.out.println("That was all the information available about " + students[index]);
								flag = false;
							} else if (userChoice2.equalsIgnoreCase("no")) {
								flag = false;
							}
						} else {
							System.out.println(
									"That data does not exist. Please try again. (Enter or \"hometown\" or \"favorite food\">>");
							userChoice = scnr.nextLine();
							flag = true;
						}
					} while (flag); // end do-while flag
					tryAgaing = false;
				} // end try

				catch (IndexOutOfBoundsException ex) {
					System.out.println("That student does not exist. Please try again. Enter a number 1-10. >>");
					userInput = scnr.nextInt();
					tryAgaing = true;
				} // end IndexOutOfBoundsException catch

			} while (tryAgaing); // end do-while tryAgain

			System.out.print(">> Would you like to continue using the App (y/n)?");
			userContinue = scnr.next();

			if (userContinue.equalsIgnoreCase("n")) {
				System.out.println(">> Thanks for using the App. Goodbye!");
			}
			flag = true;
		} while (userContinue.equalsIgnoreCase("y"));
		scnr.close();

	}// end main
}// end invalidInvputs Class
