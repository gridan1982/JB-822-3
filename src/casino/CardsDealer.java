package casino;


public class CardsDealer extends Person implements Dealer {
	
	private int  cards = 52;

	public CardsDealer(String name) {
		super(name);
	
	}

	
	@Override
	public void deal(Person[] visitors) {
		for(Person tmpPlayer: visitors) {
			 ((Player) tmpPlayer).getCards(visitors);
			
		}
		
		//for(int i =0; i < visitors.length; i++) {
			//if (visitors[i] instanceof Player) {
			//	if (visitors[i] instanceof AddictedPlayer) 
				 
			
				 
				//System.out.println(" dealing to" + i + this.name);
				
		}
		//}
	//}
		

	
	@Override
	public void deal() {
	
		
	}



}
