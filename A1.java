package a1_109502569_1;
public class A1{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = (sc.nextInt()+sc.nextInt()+sc.nextInt())/3;
		System.out.println(n);
		if(n<60)
			System.out.println("F");
		else if(n<70)
			System.out.println("D");
		else if(n<80)
			System.out.println("C");
		else if(n<90)
			System.out.println("B");
		else
			System.out.println("A");
		sc.close();
	}
}