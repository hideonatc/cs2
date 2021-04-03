public class A5_1{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int h = sc.nextInt();
		String ob = sc.next();
		for(int i=1;i<h;i++){
			for(int j=1;j<=h-i;j++)
				System.out.print(" ");
			System.out.print(ob.charAt(0));
			for(int j=1;j<i;j++)
				System.out.print(ob.charAt(1)+""+ob.charAt(1));
			System.out.print(ob.charAt(0)+"\n");
		}
		for(int i=1;i<=2*h;i++)
			System.out.print(ob.charAt(0));
		System.out.println();
		sc.close();
	}
}