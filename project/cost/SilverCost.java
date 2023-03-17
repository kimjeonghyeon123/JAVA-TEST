package kr.co.ezenac.project.cost;

public class SilverCost implements GeneralCost {
	@Override
	public int returnCost(int day) {
		if(day >= 1 && day <=3)
			return 1000;
		else if(day >= 4 && day <= 6)
			return 2000;
		else
			return 4000;
	}
}
