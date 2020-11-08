package boYanJiuShengZhuJiao;

public class BoShiYanJiuSheng implements ZhuJiao,XueSheng {
	String name;
	int age;
	String sex;
	float taxable,insurance;        //应纳税金额，五险一金
	float x,y,z,t,s;                //薪水，查薪，奖金,学费，已交学费
	double rate,balance;	    //税率，税后收入
	BoShiYanJiuSheng(String name,int age,String sex
			,float x,float z,float t,float s){       //个人基本信息
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.t=t;
		this.s=s;
		this.x=x;
		this.z=z;
	}
	
	//实现两接口
	public float getTuition(float t) {
		return t;
	}
	public float queryTuition(float s) {
		return s;
	}
	public float setSalary(float x,float z) {
		return x+z;
	}
	public float querySalary(float y) {
		return y;
	}
	
	//计算个人税额及税后额
	public void Taxable() {
		this.taxable=x+z-t-this.insurance;            //计算应纳税金额
		this.insurance=(float) (insurance*(1-0.22));  //计算五险一金
		if (this.taxable>0&&this.taxable<=3000) {
			rate=0.03;
			this.balance=this.taxable;
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
		System.out.println();
	}
	
	public String toString() {
		return"姓名："+name+"  年龄："+age+"  性别："+sex
				+"  本月结余薪资："+y+"本学期已缴纳学费:"+s;
	}

}
