import java.util.Scanner;

public class LineComparison {
public static void main(String[] args) {
	int a1,a2,b1,b2;
	int x1,x2,y1,y2;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a1 value:");
	a1 = scan.nextInt();
	System.out.println("Enter a2 value:");
	a2 = scan.nextInt();
	System.out.println("Enter b1 value:");
	b1 = scan.nextInt();
	System.out.println("Enter b2 value:");
	b2 = scan.nextInt();
	System.out.println("Enter x1 value:");
	x1 = scan.nextInt();
	System.out.println("Enter x2 value:");
	x2 = scan.nextInt();
	System.out.println("Enter y1 value:");
	y1 = scan.nextInt();
	System.out.println("Enter y2 value:");
	y2 = scan.nextInt();
	double result,result1;
	result=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
	result1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	if(result==result1) {
		System.out.println("The two lines are equal");
	}else {
		if(result>result1) {
			System.out.println("First line is longer than Second line");
		}else {
			System.out.println("First line is shorter than Second line");
		}
	}
	if(result1>result) {
		System.out.println("Secondline is longer than first line");
	}
}
}
