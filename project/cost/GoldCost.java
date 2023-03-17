package kr.co.ezenac.project.cost;

public class GoldCost implements GeneralCost {
	@Override
	public int returnCost(int day) {
		if(day >= 1 && day <=3)
			return 800;
		else if(day >= 4 && day <= 6)
			return 1600;
		else
			return 3200;
	}
}
