/**
 * @Author: Joseph Bott
 * @Description: This is an enum class that sets up the coins to pick from. For my fellow group-mates this is how this class works.
 * We create are enums, penny, nickel, etc. Then we create a constructor. This constructor will be called for each of the enums automatically.
 * So PENNY is created by calling the constructor with amount "1" and so on. Then we have a function that returns this amount. This class is 
 * public, meaning we can call it from other files.  
 */
public enum Coins {
		PENNY   (.01), 
		NICKEL  (.05),
		DIME    (.10),
		QUARTER (.25);
		
		private final double amount;
		
		Coins(double amount){
			this.amount = amount;
		}
		
		public double getAmount(){
			return this.amount;
		}
}