public class A7{
	static class Transaction{
		private String name;
		private int income;
		private int pay;
		public Transaction(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
		public int getIncome(){
			return this.income;
		}
		public int getPay(){
			return this.pay;
		}
		public void setIncome(int income){
			this.income = income;
		}
		public void setPay(int pay){
			this.pay = pay;
		}
	}
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Transaction[] ta = new Transaction[999];
		int idx = 0,l1=-1,l2=-1,total=0;
		while(true){
			int ip = sc.nextInt();
			if(ip==4) break;
			if(ip==1){
				ta[idx] = new Transaction(sc.next());
				ta[idx].setPay(0);
				ta[idx++].setIncome(sc.nextInt());
			}
			else if(ip==2){
				ta[idx] = new Transaction(sc.next());
				ta[idx].setIncome(0);
				ta[idx++].setPay(sc.nextInt());
			}
			else if(ip==3){
				for(int i = 0;i<idx;i++){
					System.out.print(ta[i].getName());
					for(int j=0;j<(l1-ta[i].getName().length())+2;j++)
						System.out.print(" ");
					System.out.print(ta[i].getIncome());
					for(int j=0;j<(l(l2)-l(ta[i].getIncome()))+2;j++)
						System.out.print(" ");
					System.out.println(ta[i].getPay());
				}
				System.out.println("Total: "+total);
			}
			else
				System.out.println("Invalid Operation");
			if(ta[idx-1].getName().length()>l1) l1=ta[idx-1].getName().length();
			if(ta[idx-1].getIncome()>l2) l2=ta[idx-1].getIncome();
			total = total + ta[idx-1].getIncome() - ta[idx-1].getPay();
		}
		sc.close();
	}
	public static int l(int x){
		int r=0;
		while(x>=10){
			x/=10;
			r++;
		}
		return r+1;
	}
}