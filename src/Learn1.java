
 class IceCream {

	public IceCream()
	{
		System.out.println("create !!");
	}
	
	static IceCream MakeExample()
	{
		return new IceCream();
	}
}


 
 public class Learn1
{
	 public Destination dest(String s)
	 {
		 class Pdestination implements Destination
		 {
			 private String label;
			 private Pdestination(String whereTo)
			 {
				 label=whereTo;
				 
			 }
			 public String readLine()
			 {
				 System.out.println(label);
				 return label;
			 }
		 }
		 return new Pdestination(s);/////向上转型  转成接口
	}
	 public static void main(String[] args)
	 {
		 Learn1 p=new Learn1();
		 Destination d=p.dest("visen");////表示接口  但是这个的接口已经实例化
		 d.readLine();
	 }
}


