package kr.co.ezenac.project.cost;

public class PlatinumCost implements GeneralCost {

	@Override
	public int returnCost(int day) {
		if(day >= 1 && day <=3)
			return 500;
		else if(day >= 4 && day <= 6)
			return 1000;
		else
			return 2000;
	}

}
