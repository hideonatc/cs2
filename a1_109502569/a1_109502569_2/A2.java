package a1_109502569_2;
public class A2{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int a = n/100 , b = (n-a*100)/10 , c = n%10;
		if(a*a*a+b*b*b+c*c*c==n)
			System.out.println(n+" is a narcissistic number.");
		else
			System.out.println(n+" is not a narcissistic number.");
		sc.close();
	}
}