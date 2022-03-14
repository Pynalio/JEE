package dao;

public class DaoImpl implements IDao {

	@Override
	public double getdata() {
		double temp=Math.random()*40;
		System.out.println("CP");
		return temp;		
	}

}
