public class M2{
	static int[] arr = new int[5];
	static char[] str = new char[5];
	static int idx = 0;
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while(true){
			System.out.println("(1)choose drinks (2)list (3)pay (4)exit");
			int in = sc.nextInt();
			if(in==1){
				System.out.println("choose drinks (drinks / amount)");
				CD(sc.nextInt(),sc.nextInt());
			}
			else if(in==2)
				LT();
			else if(in==3){
				PAY();
				break;
			}
		}
		sc.close();
	}
	public static void CD(int d,int a){
		if(d>4||d<1){
			System.out.println("invalid input");
			return;
		}
		if(d==1&&!rp('c'))str[idx++]='c';
		else if(d==2&&!rp('g'))str[idx++]='g';
		else if(d==3&&!rp('l'))str[idx++]='l';
		else if(d==4&&!rp('m'))str[idx++]='m';
		arr[d]+=a;
		//System.out.println(str[0]+str[1]+str[2]+str[3]+str[4]);
		return;
	}
	public static void LT(){
		for(int i=0;i<idx;i++){
			if(str[i]=='c')
				System.out.println("Cola "+arr[1]);
			else if(str[i]=='g')
				System.out.println("Green Tea "+arr[2]);
			else if(str[i]=='l')
				System.out.println("Lemon Tea "+arr[3]);
			else
				System.out.println("Mineral Water "+arr[4]);
		}
		return;
	}
	public static void PAY(){
		java.util.Scanner s = new java.util.Scanner(System.in);
		int total = arr[1]*35+arr[2]*25+arr[3]*29+arr[4]*20;
		System.out.println("total cost: "+total+"\nplease pay:");
		int p = s.nextInt();
		if(p<total){
			System.out.println("money not enough");
			return;
		}
		System.out.println("money change: "+(p-total)+"\nthank you");
		return;
	}
	public static boolean rp(char c){
		for(int i=0;i<idx;i++)
			if(str[i]==c)
				return true;
		return false;
	}
}