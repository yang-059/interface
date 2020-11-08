package boYanJiuShengZhuJiao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoShiYanJiuSheng bj1=new BoShiYanJiuSheng("李四", 26, "男",6000,500,4600,0); 
		BoShiYanJiuSheng bj2=new BoShiYanJiuSheng("王五", 27, "女",11000,200,5000,4000);
	    bj1.setSalary(6000, 500);
	    bj1.getTuition(5000);
	    bj1.Taxable();
	    bj1.toString();
	    
	}	
}

