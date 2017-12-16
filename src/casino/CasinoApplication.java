package casino;


public class CasinoApplication  {

	
	public static void main(String[] args) {
		
	 Casino.start();
		
		Person[] visitors =  new  Person[20];	
		
		visitors [0]  = new Player("idan", 0, 0, 0);
		visitors[1] = new Player("aviv", 0, 0, 0);
		visitors[2] = new Player("omer", 0, 0, 0);
		visitors[3] = new AddictedPlayer("zohar", 0, 0, 0);
		visitors[4] = new AddictedPlayer("freddie", 0, 0, 0);
		visitors[5] = new AddictedPlayer("prince", 0, 0, 0);
		visitors[6]=  new CardsDealer("tomy");
		visitors[7]=  new CardsDealer("james");
		visitors[8] = new DrugsDealer("moti");
		
         for(Person tmp: visitors) {
        	 if(tmp instanceof Player)
        	 tmp.getName();
		
		
		 
         }
		
		
		

		
		
		/* Player consumer[] = new Player[6];
		 consumer[0] = new Player("idan");
		 consumer[1] = new Player("aviv");
		 consumer[2] = new Player("omer");
		 consumer[3] = new AddictedPlayer("zohar");
		 consumer[4] = new AddictedPlayer("freddie");
		 consumer[5] = new AddictedPlayer("prince");
		 
		 consumer[0].consumeDrugs();
		 
		 
		 //Player player = new Player("moshe")
		 //player.consumeDrugs();
		 //consumer[0].consume();		 
		  
		 //consumer[0]
		 */
		 
		 
		 
	}
    
}
