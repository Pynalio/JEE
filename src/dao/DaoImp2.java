package dao;

public class DaoImp2 implements IDao{
	
	@Override
	public double getdata() {
		double temp=Math.random()*450;
		System.out.println("BD");
		return temp;
	}

}
