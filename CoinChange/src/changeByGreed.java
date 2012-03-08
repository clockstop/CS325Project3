/**
 * 
 */

/**
 * @author Joseph Bott
 * @description This class will compute the change by a greedy algorithm.
 */
public class changeByGreed {
	
	int[] selectedCoins = new int[4]; //used to hold selectedCoins as the algorithm progresses.
	
	public changeByGreed(){
		//void constructor
	}
	
	private double selectLargestCoin(double changeToMake) {	
		double newChange;
		assert(changeToMake > 0); // An assert statement, changeToMake cannot be <= 0.
		
		if(changeToMake >= Coins.QUARTER.getAmount()){
			this.selectedCoins[0]++;
			newChange = changeToMake - Coins.QUARTER.getAmount();
		}		
		else if(changeToMake >= Coins.DIME.getAmount()){
			this.selectedCoins[1]++;
			newChange = changeToMake - Coins.DIME.getAmount();
		}
		else if(changeToMake >= Coins.NICKEL.getAmount()){
			this.selectedCoins[2]++;
			newChange = changeToMake - Coins.NICKEL.getAmount();
		}
		else{
			this.selectedCoins[3]++;
			newChange = changeToMake - Coins.PENNY.getAmount();
		}
		
		return round(newChange);
		
    }
	
	public int[] computeChange(double changeToMake){
		double currentChange = changeToMake;
		
		while(currentChange > 0){
			assert(currentChange > 0);
			currentChange = selectLargestCoin(currentChange);
		}
		return this.selectedCoins;
	}
	
	private static double round(double Rval) {
		double p = (double)Math.pow(10,2);
		double tmp = 0;
		
		Rval = Rval * p;
		tmp = Math.round(Rval);
		return (double)tmp/p;
    }
	
}