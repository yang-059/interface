package boYanJiuShengZhuJiao;

public class YiChang extends Exception {
	String CuoWu;
	public YiChang(float x,float z) {
		CuoWu="薪资有误，请检查后重输！";
	}
	public String warnEx() {
		 return CuoWu;
	}
}
