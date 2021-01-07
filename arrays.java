public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a =new int[5];
		//int []a=new int[];
		//int []a=new int[-5];
		
		 double []d = new double[5];
		 short[]s = new short[5];
		 byte []b = new byte[5];
		 boolean []b1 = new boolean[5];
		 
		 System.out.println(a.getClass().getName());     //[I
		 System.out.println(d.getClass().getName());     //[D
		 System.out.println(s.getClass().getName());     //[S
		 System.out.println(b.getClass().getName());     //[B
		 System.out.println(b1.getClass().getName());    //[Z
         
		 
		 int [][]a1=new int[3][2];
		 System.out.println(a1.getClass().getName());    //[[I
		 
		 int []x=new int[0];
		 int []a2=new int['a'];
		 int a3=20;
		 int a4[] =new int[a3];
		 short s1=30;
		 int []a5=new int[s1];
		 
		 System.out.println(args.length);   //0
		 System.out.println(a2[0]);   //0
		 System.out.println(a4[0]);   //0
		 System.out.println(a5[0]);   //0
		 
		 System.out.println(a2);     //[I@1d251891      hexa-decimal values
		 System.out.println(a4);     //[I@48140564      theses values
		 System.out.println(a5);     //[I@58ceff1       may change

	
	
	}

}
