package boYanJiuShengZhuJiao;

public class Test {

	public static void main(String[] args) throws YiChang {
		// TODO Auto-generated method stub
		//定义三个对象
		BoShiYanJiuSheng bj1=new BoShiYanJiuSheng("李四", 26, "男",6000,500,4600); 
		BoShiYanJiuSheng bj2=new BoShiYanJiuSheng("王五", 27, "女",11000,200,5000);
		BoShiYanJiuSheng bj3=new BoShiYanJiuSheng("赵五", 30, "男",1000,-1,200);    //观察异常是否可使用
		bj1.setSalary(6000, 500);
		bj1.getTuition(5000);
		bj1.queryTuition(3300);
		bj1.Taxable();
		bj1.getbanlance();
		bj1.toString();
		bj1.In(6000, 500);
		
		bj2.setSalary(6000, 500);
		bj2.getTuition(5000);
		bj2.queryTuition(10000);
		bj2.Taxable();
		bj2.toString();
		
		bj3.setSalary(6, 5);
		bj3.getTuition(3);
		bj3.queryTuition(9);
		bj3.Taxable();
		bj3.toString();
  
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
	    	    
		
		
		try {
			bj3.In(1000,-1);
			System.out.println();
			bj3.gettax();
			bj3.getSum();
			bj3.Sum();
			System.out.println();
		}catch (YiChang e) {
			System.out.println(bj3.toString1());
			System.out.print(e.warnEx());
		}finally {
			
		}
		
	}	
}

