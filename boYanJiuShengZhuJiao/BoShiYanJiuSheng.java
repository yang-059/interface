package boYanJiuShengZhuJiao;

public class BoShiYanJiuSheng implements ZhuJiao,XueSheng {
	String name;
	int age;
	String sex;
	float taxable,insurance;      //Ӧ��˰������һ��
	float x,z,t,s;                //нˮ������ѧ�ѣ��ѽ�ѧ��
	float sy;                    //
	double rate,balance;	      //˰�ʣ�˰������
	
	//������Ϣ
	BoShiYanJiuSheng(String name,int age,String sex
			,float x,float z,float t){       //���˻�����Ϣ
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.t=t;
		this.x=x;
		this.z=z;
	}
	public String toString() {
		return"==========������Ϣ:=========="+"\n"
				+ " ������"+name+"   |   ���䣺"+age+"   |   �Ա�"+sex+"\n"
				+"2020��Ƚ���"+this.balance*12+"  | �ѽ���ѧ��"+this.s;
	}
	public String toString1() {
		return"==========������Ϣ:=========="+"\n"
				+ " ������"+name+"   |   ���䣺"+age+"   |   �Ա�"+sex;
	}
	
	//ʵ�����ӿ�
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


	//�������˰�˰���
	public void Taxable() {
		this.taxable=(x*12+z*12-t*2-this.insurance)/12;       //����Ӧ��˰���
		this.insurance=(float) ((float) (x*12+z*12)*0.22);    //��������һ��
		if (this.taxable>0&&this.taxable<=3000) {
			rate=0.03;                                        //˰��
			this.balance=this.taxable;                        //˰���
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
	}
	public double getbanlance() {
		return this.balance;
	}//System.out.println(this.balance);
	public void gettax() {
		System.out.println("==========�ʽ���ϸ:==========");
		System.out.println("ÿ�»������ʣ�"+this.x+"     |   ÿ�½���"+this.z);
		System.out.println("2020���ܹ��ʣ�"+this.x*12+"   |   �ܽ���"+this.z*12);
		System.out.println("����һ����ã�ÿ�£�"+this.insurance/12
				+"  |  ѧ�ѣ�ÿѧ�ڣ���"+this.t);
		System.out.println("ÿ�½��ࣺ"+this.balance+"   |   ��Ƚ��ࣺ"+this.balance*12);
		System.out.println();
	}

	//ѧ�Ѽ��㼰��ѯ
	public void Sum() {
		s=(int)this.s;
		sy=(int)this.t*2-s;
		if (sy<=0) {
			System.out.println("���ѽ��뱾���ѧ�ѡ�");
		}else {
			System.out.println("������������ѧ��"+sy+"yuan.");
		}
	}
	public void getSum(){
		System.out.println("==========ѧ�ѽ���:==========");
		System.out.println("�ѽ���ѧ�ѣ�"+s+"   |ʣ��Ӧ��ѧ��"+sy);
	}
	
	
	public void In (float x,float z) throws YiChang{
		if (x<=2000&&z<=0) {
			throw new YiChang(x,z);
		}	
	}
	
	
	
}
