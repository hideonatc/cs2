public class M1{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			int x = 0,idx = 1;
			while(idx<=n){
				x+=(n-idx+1)*(n-idx+1);
				idx++;
			}
			System.out.println(x);
		}
		sc.close();
	}
}