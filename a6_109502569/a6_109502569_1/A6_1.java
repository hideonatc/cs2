public class A6_1{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			String sa[] = s.split(" ");
			if(sa[0].equals("STOP")) break;
			int mx1 = -1 , mx2 = -2;
			for(int i=0;i<sa.length;i++){
				if(Integer.parseInt(sa[i])>mx1){
					mx2 = mx1;
					mx1 = Integer.parseInt(sa[i]);
				}
				else if(Integer.parseInt(sa[i])>mx2&&Integer.parseInt(sa[i])!=mx1)
					mx2 = Integer.parseInt(sa[i]);
			}
			System.out.println(mx2);
		}
		sc.close();
	}
}