public class A6_2{
	static char[][] map = new char[101][101];
	static int n;
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			String l = sc.next();
			for(int j=0;j<n;j++){
				map[i][j] = l.charAt(j);
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mn(i,j)==-1) System.out.print('*');
				else System.out.print(mn(i,j));
			}
			System.out.println();
		}
		sc.close();
	}
	public static int mn(int x ,int y){
		if(map[x][y]=='*') return -1;
		int m = 0;
		for(int i=-1;i<=1;i++)
			for(int j=-1;j<=1;j++)
				if(x+i>=0&&x+i<n&&y+j<n&&y+j>=0&&map[x+i][y+j]=='*') m++;
		return m;
	}
}