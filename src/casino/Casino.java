package casino;


public class Casino {
	
	
    static void initialize() {
	}
     
    static void testDealerInterface() {
	}
    static void testConsumerInterface() {
	}
	
	public static void start() { 


        create();
        initialize();
        testDealerInterface();
        testConsumerInterface();
    }
	
	static void create(){
		
	Person[] visitors =  new  Person[20];	
	
	}
	
	void initialize(Person[] visitors) {
		
		
		visitors [0]  = new Player("idan", 0, 0, 0);
		visitors[1] = new Player("aviv", 0, 0, 0);
		visitors[2] = new Player("omer", 0, 0, 0);
		visitors[3] = new AddictedPlayer("zohar", 0, 0, 0);
		visitors[4] = new AddictedPlayer("freddie", 0, 0, 0);
		visitors[5] = new AddictedPlayer("prince", 0, 0, 0);
		visitors[6]=  new CardsDealer("tomy");
		visitors[7]=  new CardsDealer("james");
		visitors[8] = new DrugsDealer("moti");
		 
		  ((Player) visitors[0]).getCards(visitors);
	}
	
	
	
	}
	

		

	


