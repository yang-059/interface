package boYanJiuShengZhuJiao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoShiYanJiuSheng bj1=new BoShiYanJiuSheng("李四", 26, "男",6000,500,4600); 
		BoShiYanJiuSheng bj2=new BoShiYanJiuSheng("王五", 27, "女",11000,200,5000);
	    bj1.setSalary(6000, 500);
	    bj1.getTuition(5000);
	    bj1.queryTuition(3300);
	    bj1.Taxable();
	    bj1.getbanlance();
	    bj1.toString();
	    
	    bj2.setSalary(6000, 500);
	    bj2.getTuition(5000);
	    bj2.queryTuition(10000);
	    bj2.Taxable();
	    bj2.toString();
	    
	    
	    //输出内容
	    
	    System.out.println(bj1.toString());
	    System.out.println();
	    bj1.gettax();
	    bj1.getSum();
	    bj1.Sum();
	    System.out.println();
	    
	    System.out.println(bj2.toString());
	    System.out.println();
	    bj2.gettax();
	    bj2.getSum();
	    bj2.Sum();
	    System.out.println();
	}	
}

