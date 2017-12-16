package casino;

public class Player extends Person implements Consumer {

	
	protected String name;
	protected int cards;
	protected int drugs;
	protected int gifts;

	public Player(String name,int cards,int drugs, int gifts) {
		super(name);
		
	this.cards = cards;	
	this.name = name;
	this.gifts = gifts;
	this.drugs = drugs;
	
	
	}

	@Override
	public void getCards(Person[] visitors) {
		
		int cards= 0;
			
			System.out.println("Deal me ");
		
	}

	@Override
	public void getDrugs() {
		
		System.out.println("I am not an addict, say no to drugs!!!");
		
   
	}

	
}
	

