public class A5_2{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		while(n!=-1){
			int m = sc.nextInt();
			if(m==-1)
				break;
			n = Math.max(n,m);
		}
		if(n==-1)
			System.out.println("None");
		else
			System.out.println(n);
		sc.close();
	}
}