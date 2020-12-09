package boYanJiuShengZhuJiao;

public class BoShiYanJiuSheng implements ZhuJiao,XueSheng {
	String name;
	int age;
	String sex;
	float taxable,insurance;      //应纳税金额，五险一金
	float x,z,t,s;                //薪水，奖金，学费，已交学费
	float sy;                    //
	double rate,balance;	      //税率，税后收入
	
	//个人信息
	BoShiYanJiuSheng(String name,int age,String sex
			,float x,float z,float t){       //个人基本信息
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.t=t;
		this.x=x;
		this.z=z;
	}
	public String toString() {
		return"==========个人信息:=========="+"\n"
				+ " 姓名："+name+"   |   年龄："+age+"   |   性别："+sex+"\n"
				+"2020年度结余"+this.balance*12+"  | 已缴纳学费"+this.s;
	}
	public String toString1() {
		return"==========个人信息:=========="+"\n"
				+ " 姓名："+name+"   |   年龄："+age+"   |   性别："+sex;
	}
	
	//实现两接口
	public float getTuition(float t) {
		return t;
	}
	public float queryTuition(float s) {
		this.s=s;
		return s;
	}
	public float setSalary(float x,float z) {
		return x+z;
	}
	public double querySalary(double y) {
		return this.balance;
	}


	//计算个人税额及税后额
	public void Taxable() {
		this.taxable=(x*12+z*12-t*2-this.insurance)/12;       //计算应纳税金额
		this.insurance=(float) ((float) (x*12+z*12)*0.22);    //计算五险一金
		if (this.taxable>0&&this.taxable<=3000) {
			rate=0.03;                                        //税率
			this.balance=this.taxable;                        //税后额
		}
		else if (this.taxable>3000&&this.taxable<=12000) {
			rate=0.12;
			this.balance=(this.taxable-210)*(1-rate);
		}
		else if(this.taxable>12000&&this.taxable<=25000) {
			rate=0.2;
			this.balance=(this.taxable-1410)*(1-rate);
		}else{
			System.out.println("应纳税金额有误，请检查后重输！");
		}
	}
	public double getbanlance() {
		return this.balance;
	}//System.out.println(this.balance);
	public void gettax() {
		System.out.println("==========资金明细:==========");
		System.out.println("每月基本工资："+this.x+"     |   每月奖金："+this.z);
		System.out.println("2020年总工资："+this.x*12+"   |   总奖金："+this.z*12);
		System.out.println("五险一金费用（每月）"+this.insurance/12
				+"  |  学费（每学期）："+this.t);
		System.out.println("每月结余："+this.balance+"   |   年度结余："+this.balance*12);
		System.out.println();
	}

	//学费计算及查询
	public void Sum() {
		s=(int)this.s;
		sy=(int)this.t*2-s;
		if (sy<=0) {
			System.out.println("您已交齐本年度学费。");
		}else {
			System.out.println("请您继续缴纳学费"+sy+"yuan.");
		}
	}
	public void getSum(){
		System.out.println("==========学费缴纳:==========");
		System.out.println("已缴纳学费："+s+"   |剩余应缴学费"+sy);
	}
	
	
	public void In (float x,float z) throws YiChang{
		if (x<=2000&&z<=0) {
			throw new YiChang(x,z);
		}	
	}
	
	
	
}
