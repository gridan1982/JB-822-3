package casino;

public class AddictedPlayer extends Player implements Consumer{

		int drugs = 0;
	
		public AddictedPlayer(String name,int drugs, int cards,int gifts) {
		super(name, drugs, cards, gifts);
		
		 			
		}
		@Override
		public void getCards(Person[] visitors) {
			int cards=0;
			System.out.println("Getting cards");
			
		}
		
		@Override
		public void getDrugs() {	
			System.out.println("I am a junky, give me more drugs");}
			
		}
	
		
	

		
	
		





