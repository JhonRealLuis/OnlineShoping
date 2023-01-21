import java.util.Scanner;


public class Main
{


  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);


    // Product information stored in arrays
      String[] productNames =
    {
    "Shirt", "Pants", "Shoes", "Hat"};

    double[] productPrices = { 20.0, 30.0, 40.0, 15.0 };

    int[] productStock = { 5, 10, 8, 12 };

    int[] estimatedArrival = { 7, 14, 21, 3 };


    // Account information stored in variables
    String username = "user123";

    String password = "123";

    double accountBalance = 100.0;


    // Welcome message
    System.out.println ("Welcome to our online shop!");


    // Prompt user to log in
    System.out.print ("Please enter your username: ");

    String enteredUsername = input.nextLine ();

    System.out.print ("Please enter your password: ");

    String enteredPassword = input.nextLine ();


    // Check if login information is correct
    if (enteredUsername.equals (username)
	&& enteredPassword.equals (password))
      {

	System.out.println ("Login successful!");


	// Display available products
	System.out.
	  println ("\nHere are the products we currently have in stock:");

	for (int i = 0; i < productNames.length; i++)
	  {

	    System.out.println ((i + 1) + ". " + productNames[i] + " - $" +
				productPrices[i] + " - Stock: " +
				productStock[i] + " - Estimated arrival: " +
				estimatedArrival[i] + " days");

	  }

	// Prompt user to select a product
	System.out.
	  print ("\nPlease select a product by entering its number: ");

	int productNumber;

	// check if the user input is a number
	if (input.hasNextInt ())
	  {

	    productNumber = input.nextInt ();

	    // check if the input number is in the list of product
	    if (productNumber > 0 && productNumber <= productNames.length)
	      {

		// Check if product is in stock
		if (productStock[productNumber - 1] > 0)
		  {

		    // Check if user has enough funds
		    if (accountBalance >= productPrices[productNumber - 1])
		      {

			System.out.println
			  ("\nYou have successfully purchased the " +
			   productNames[productNumber - 1] + " for $" +
			   productPrices[productNumber - 1] + "!");

			System.out.println ("Your account balance is now $" +
					    (accountBalance -
					     productPrices[productNumber -
							   1]) + ".");

			System.out.println ("Your product will arrive in " +
					    estimatedArrival[productNumber -
							     1] + " days");

		      }
		    else
		      {

			System.out.println
			  ("\nSorry, you do not have enough funds to purchase this product.");

		      }

		  }
		else
		  {

		    System.out.println
		      ("\nSorry, this product is currently out of stock.");

		  }

	      }
	    else
	      {

		System.out.println
		  ("\nInvalid input, the number you entered is not in the list of products. Please try again.");

	      }

	  }
	else
	  {

	    System.out.println
	      ("\nInvalid input, the input is not a number. Please try again.");

	    input.next ();

	  }

      }
    else
      {

	System.out.println
	  ("\nSorry, the login information you entered is incorrect.");

      }

  }

}