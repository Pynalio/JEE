package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	
	private IDao dao;

	@Override
	public double calcul() {
		double temp=dao.getdata();
		double res=temp*10;
		return res;
	}

	
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	

}
