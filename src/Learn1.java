
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
		 return new Pdestination(s);/////����ת��  ת�ɽӿ�
	}
	 public static void main(String[] args)
	 {
		 Learn1 p=new Learn1();
		 Destination d=p.dest("visen");////��ʾ�ӿ�  ��������Ľӿ��Ѿ�ʵ����
		 d.readLine();
	 }
}


