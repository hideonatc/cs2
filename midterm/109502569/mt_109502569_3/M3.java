public class M3{
	static class PM{
		private int H,A;
		private float P;
		public PM(int h,int a,float p){
			this.H = h;
			this.A = a;
			this.P = p;
		}
	}
	public static void main(String[] args){
		PM[] mine = new PM[7];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		PM ta = new PM(sc.nextInt(),sc.nextInt(),sc.nextFloat());
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
			mine[i] = new PM(sc.nextInt(),sc.nextInt(),sc.nextFloat());
		int rnd = 0,idx = 1,turn = 1;
		int th = ta.H,mh = mine[1].H;
		while(true){
			if(th <= 0){
				System.out.println("You Win! Using "+rnd+" rounds!");
				break;
			}
			if(mh<=0){
				if(idx==n){
					System.out.println("You Lose! Using "+rnd+" rounds!");
					break;
				}
				idx++;
				mh = mine[idx].H;
			}
			if(turn==1){
				if(mine[idx].P==1){
					th-=mine[idx].A*3;
					mine[idx].P=0;
				}
				else{
					th-=mine[idx].A;
					mine[idx].P+=0.25;
				}
				turn=0;
				rnd++;
			}
			else{
				if(ta.P==1){
					mh-=ta.A*2;
					/*if(mh<0)
						th+=(mh+ta.A*2)/5;
					else*/
						th+=(ta.A*2)/5;
					ta.P=0;
				}
				else{
					mh-=ta.A;
					/*if(mh<0)
						th+=(mh+ta.A)/5;
					else*/
						th+=(ta.A)/5;
					ta.P+=0.25;
				}
				turn=1;
				rnd++;
			}
			//System.out.println(rnd+" "+turn+" "+mh+" "+th+" "+idx);
		}
		sc.close();
	}
}