package boYanJiuShengZhuJiao;

public class BoShiYanJiuSheng implements ZhuJiao,XueSheng {
	String name;
	int age;
	String sex;
	float taxable,insurance;        //Ӧ��˰������һ��
	float x,y,z,t,s;                //нˮ����н������,ѧ�ѣ��ѽ�ѧ��
	double rate,balance;	    //˰�ʣ�˰������
	BoShiYanJiuSheng(String name,int age,String sex
			,float x,float z,float t,float s){       //���˻�����Ϣ
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.t=t;
		this.s=s;
		this.x=x;
		this.z=z;
	}
	
	//ʵ�����ӿ�
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
	
	//�������˰�˰���
	public void Taxable() {
		this.taxable=x+z-t-this.insurance;            //����Ӧ��˰���
		this.insurance=(float) (insurance*(1-0.22));  //��������һ��
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
			System.out.println("Ӧ��˰���������������䣡");
		}
		System.out.println();
	}
	
	public String toString() {
		return"������"+name+"  ���䣺"+age+"  �Ա�"+sex
				+"  ���½���н�ʣ�"+y+"��ѧ���ѽ���ѧ��:"+s;
	}

}
