package in.co.exercise;

public class OperaterAll {
	
	
	 public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 5;

	        // Arithmetic Operators
	        int sum = num1 + num2;
	        int difference = num1 - num2;
	        int product = num1 * num2;
	        int quotient = num1 / num2;
	        int remainder = num1 % num2;

	        System.out.println("Arithmetic Operators:");
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + difference);
	        System.out.println("Product: " + product);
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);

	        // Relational Operators
	        boolean isEqual = num1 == num2;
	        boolean isNotEqual = num1 != num2;
	        boolean isGreater = num1 > num2;
	        boolean isLess = num1 < num2;
	        boolean isGreaterOrEqual = num1 >= num2;
	        boolean isLessOrEqual = num1 <= num2;

	        System.out.println("\nRelational Operators:");
	        System.out.println("Is Equal: " + isEqual);
	        System.out.println("Is Not Equal: " + isNotEqual);
	        System.out.println("Is Greater: " + isGreater);
	        System.out.println("Is Less: " + isLess);
	        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
	        System.out.println("Is Less or Equal: " + isLessOrEqual);

	        // Logical Operators
	        boolean logicalAnd = (num1 > 0) && (num2 < 10);
	        boolean logicalOr = (num1 > 0) || (num2 > 10);
	        boolean logicalNot = !(num1 > num2);

	        System.out.println("\nLogical Operators:");
	        System.out.println("Logical AND: " + logicalAnd);
	        System.out.println("Logical OR: " + logicalOr);
	        System.out.println("Logical NOT: " + logicalNot);

	        // Assignment Operators
	        int assignedValue = 20;
	        assignedValue += 5;
	        assignedValue -= 10;
	        assignedValue *= 2;
	        assignedValue /= 4;
	        assignedValue %= 3;

	        System.out.println("\nAssignment Operators:");
	        System.out.println("Assigned Value: " + assignedValue);

	        // Increment and Decrement Operators
	        int incrementValue = 5;
	        incrementValue++;
	        int decrementValue = 10;
	        decrementValue--;

	        System.out.println("\nIncrement and Decrement Operators:");
	        System.out.println("Incremented Value: " + incrementValue);
	        System.out.println("Decremented Value: " + decrementValue);
	    }
	}



