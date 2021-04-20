public class P6{
	public static void main(String[] args){
		String s;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		java.util.ArrayList<String> al = new java.util.ArrayList<String>();
		while(true){
			s = sc.nextLine();
			String sa[] = s.split(" ");
			//System.out.println(sa[2]);
			if(sa[0].equals("exit")) break;
			if(sa[0].equals("1"))
				al.add(Integer.parseInt(sa[1])-1,sa[2]);
			else
				al.remove(Integer.parseInt(sa[1])-1);
		}
		System.out.println(al);
		sc.close();
	}
}