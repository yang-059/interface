# 学号：2020322059 班级：G201 姓名：杨一博 （interface）
## 实验四 接口程序及异常处理实验

## 实验目的：
+ 掌握Java中抽象类和抽象方法的定义； 
+ 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
+ 了解异常的使用方法，并在程序中根据输入情况做异常处理
## 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
## 实验要求：
1. 在 _博士研究生类_ 中实现各个接口定义的抽象方法;
2. 对 _年学费和年收入_ 进行统计，用收入减去学费，求得纳税额；
3. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4. 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5. 根据输入情况，要在程序中做异常处理。
## 实验过程
1. 确认抽象类ZhuJiao,XueSheng的内容和要求；
2. 自定义独有异常；
3. 完成基本信息的获取和输出后，并用第三名人员做异常测试
## 核心代码
1. 接口的定义
```
public interface ZhuJiao{              //用接口定义助教的行为
	float setSalary(float x,float z);    
	double querySalary(double y); 
  }
public class BoShiYanJiuSheng implements ZhuJiao,XueSheng {
  //用研究生类实现两接口
	public float getTuition(float t) {
		return t;
	}
  }
```
2. 自定义异常
```
public class YiChang extends Exception {          //自定义Exception的子类作为本次实验的异常测试
	String CuoWu;
	public YiChang(float x,float z) {
		CuoWu="薪资有误，请检查后重输！";
	}
	public String warnEx() {
		 return CuoWu;
	}
}

public void In (float x,float z) throws YiChang{  //在研究生类里实现异常的规定范围
		if (x<=2000&&z<=0) {
			throw new YiChang(x,z);
		}	
	}
```
3. 针对是否会出现异常定义不同的信息显示
```
public String toString() {
		return"==========个人信息:=========="+"\n"
				+ " 姓名："+name+"   |   年龄："+age+"   |   性别："+sex+"\n"
				+"2020年度结余"+this.balance*12+"  | 已缴纳学费"+this.s;
	}
	public String toString1() {
		return"==========个人信息:=========="+"\n"
				+ " 姓名："+name+"   |   年龄："+age+"   |   性别："+sex;
	}
```
4.计税
```
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
   ```

## 运行结果
+ 正常运行结果
![](https://github.com/yang-059/interface/blob/main/bsyjs运行结果.PNG)
+ 异常测试结果
![](https://github.com/yang-059/interface/blob/main/异常测试运行结果.PNG)
## 编程感想
- 在本次实验中，主要使用接口和if分支语句做人员信息输出，通过对自定义异常的抛出与使用，理解throw与throws的区别，并以try catch语句完成对对象是否发生异常做出判断。
- 不足：没有采用Scanner类实现运行时交互式输入，直接采用运行时通过main方法的参数args一次性赋值，增加了不必要的工作量，需要在之后的实验中改正。
