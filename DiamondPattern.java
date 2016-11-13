/* Logic to draw the following diamond pattern.
	  a
	 aba
	abcba
	 aba
	  a

Note: This code can be tweaked to receive row length from console and print patterns more dynamically.
*/
class DiamondPattern {
    	public static void main(String[] args) {
// Initialize the variables to be used in logic
		int max_rows;
		int max_cols;
		int space_num;
		int star_num=1;
		int half_h = 3;

// Calculate the max rows, columns needed in patterns and locate spaces required in first half of first row.
		space_num = half_h - 1;
		max_rows = (half_h * 2) - 1;
		max_cols = (space_num*2) + 1;

// Using FOR loop, we will print each row with the required pattern. Here, we will have total 5 rows i.e. (3*2)-1.
		for (int i = 0; i < half_h; i++){
			for (int j = 0; j < space_num; j++)	//Based on space_num value, populate spaces in first half of each row.
			{
				System.out.print(" ");
			}
 			int sh = star_num / 2;	// sh stands for second half of character string in a row.
 			int fh = star_num - sh;	// fh stands for first half of character string in a row.
			int ch = 97;	// Integer value for small character 'a' to initialise pattern.
			for (int j = 0; j < fh; j++)	// Loop to populate characters in the first half of string.
			{
				System.out.print((char)ch);
				ch++;
			}
			ch -= 2;	// This is needed to push back counter for character as in the above logic it has advanced because of ch++.
			for (int j = 0; j < sh ; j++)	// Loop to populate characters in the second half of string in reverse order.
 			{
  				System.out.print((char)ch);
				ch--;
 			}
			for (int j = 0; j < space_num; j++)	// Loop to populate spaces in the second half of string as per space_num value for each row.
			{
				System.out.print(" ");
			}
		space_num--;	// Calculates how many spaces needed in the next row. Gives first half and used in logic for second half as well.
		star_num  = max_cols - (space_num * 2);		// Calculates how many characters needed in the next row as per pattern.
		System.out.println();	// New line after printing each row.
		}

		space_num += 2;
		star_num = max_cols - (space_num * 2);

// Rest of the logic is similar to the above logic but prints the mirrow image of above pattern.

		for (int i = 0; i < (half_h - 1); i++){
			for (int j = 0; j < space_num; j++){
				System.out.print(" ");
			}
 			int sh = star_num/2;
 			int fh = star_num - sh;
			int ch = 97;
			for (int j = 0; j < fh; j++)
			{
				System.out.print((char)ch);
				ch++;
			}
			ch -= 2;
			for (int j = 0; j < sh ; j++)
 			{
  				System.out.print((char)ch);
				ch--;
 			}								
			for (int j = 0; j < space_num; j++){
				System.out.print(" ");
			}
			space_num++;
			star_num  = max_cols - (space_num * 2);
			System.out.println();
		}
	}
}

//Hope you liked it... Cheers!