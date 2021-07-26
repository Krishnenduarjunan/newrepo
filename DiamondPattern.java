import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n=10;
	    int space= n - 1;
		for (int i = 0; i < n; i++)
        {
            // loop for initially space,
            for (int j = 0; j < space; j++)
                System.out.print(" ");
     
            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            space--;
        }
		
		space=0;
		//reverse order
		for (int i = n; i > 0; i--)
        {
            // loop for initially space,
            for (int j = 0; j < space; j++)
                System.out.print(" ");
     
            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            space++;
        }
	}

}
  





