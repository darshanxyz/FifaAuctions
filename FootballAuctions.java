package auctions;

import java.util.*;
import java.util.Map.Entry;

public class FootballAuctions {
	
	void addPlayerToAuctionsPool(HashMap playerMap, String playerName, int playerValue) {
		playerMap.put(playerName, playerValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> playerMap = new HashMap<String, Integer>();
		FootballAuctions fifa = new FootballAuctions();
		//format: (map, player name, base value)
		
		//Goalkeepers
		fifa.addPlayerToAuctionsPool(playerMap, "Courtois", 3000000);
		fifa.addPlayerToAuctionsPool(playerMap, "de Gea", 3000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Neuer", 3000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Buffon", 3000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Handanovic", 3000000);
		fifa.addPlayerToAuctionsPool(playerMap, "K.Navas", 3000000);
		
		//Defenders
		fifa.addPlayerToAuctionsPool(playerMap, "Dani Alves", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Lahm", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Carvajal", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Azpilicueta", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Clyne", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Bonucci", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Chiellini", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Hummels", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Boetang", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Ramos", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Pique", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "David Luiz", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Kompany", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Alderw.", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Smalling", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Vertonghen", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Bellerin", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Koscielny", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Marcelo", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Alba", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Alaba", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Shaw", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Walker", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Alex Sandro", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Thiago Silva", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Kurwaza", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Aurier", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Ricardo Rodriguez", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Hector", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Valencia", 5000000);
		
		//Midfielders
		fifa.addPlayerToAuctionsPool(playerMap, "Modric", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Kroos", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Iniesta", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Busquets", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Coutinho", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Vidal", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Mahrez", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Hazard", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Ronaldo", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Pogba", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "James", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Kante", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Fabregas", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Firmino", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Mane", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Messi", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Robben", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Neymar", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Ribery", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Doug.Costa", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Ozil", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Reus", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "di Maria", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Eriksen", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Alli", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Matic", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "A.Sanchez", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Bale", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Willian", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Nainggolan", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Veratti", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Pjanic", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Payet", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "de Breune", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "David Silva", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Pedro", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Mkhitaryan", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Mata", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Xhaka", 5000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Carassco", 5000000);		
		
		//Forwards
		fifa.addPlayerToAuctionsPool(playerMap, "Suarez", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Lewandowski", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Kane", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Diego Costa", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Lukaku", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Ibrahimovic", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Griezman", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Benzema", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Higuain", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Aubameyang", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Cavani", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Aguero", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Lacazette", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Morata", 8000000);
		fifa.addPlayerToAuctionsPool(playerMap, "Dybala", 8000000);
		
		//Gamers
		Gamer gamer1 = new Gamer("P1");
		Gamer gamer2 = new Gamer("P2");
		Gamer gamer3 = new Gamer("P3");
		Gamer gamer4 = new Gamer("P4");
		
		Conversion c = new Conversion();
		
		for(Map.Entry player : playerMap.entrySet()) { 	
			System.out.println(player.getKey() + " - " + c.convert((Integer)player.getValue()).toUpperCase());
			Scanner sc = new Scanner(System.in);
			System.out.print("Gamer: ");
			switch (sc.next()) {
			case "1":
				System.out.println("Value: ");
				if(gamer1.getBudget() < (Integer)player.getValue()) {
					System.out.println("You can't buy this player.");
				}
				else {
					gamer1.assignPlayerToTeam(player.getKey(), sc.nextInt()*1000000);
					break;
				}

			case "2":
				System.out.println("Value: ");
				gamer2.assignPlayerToTeam(player.getKey(), sc.nextInt()*1000000);
				break;
			case "3":
				System.out.println("Value: ");
				gamer3.assignPlayerToTeam(player.getKey(), sc.nextInt()*1000000);
				break;
			case "4":
				System.out.println("Value: ");
				gamer4.assignPlayerToTeam(player.getKey(), sc.nextInt()*1000000);
				break;
			default:
				System.out.println("Player doesn't exist.");
				break;
			}

			//Displaying current squads with remaining budget
			System.out.println("*************************************");
			System.out.println("-------------------------------------");
			gamer1.showAllPlayers();
			System.out.println("-------------------------------------");
			gamer2.showAllPlayers();
			System.out.println("-------------------------------------");
			gamer3.showAllPlayers();
			System.out.println("-------------------------------------");
			gamer4.showAllPlayers();
			System.out.println("-------------------------------------");
			System.out.println("*************************************");
		}
		
	}

}

class Conversion {
	private static final String[] specialNames = {
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	    };
	    
    private static final String[] tensNames = {
        "",
        " ten",
        " twenty",
        " thirty",
        " forty",
        " fifty",
        " sixty",
        " seventy",
        " eighty",
        " ninety"
    };
    
    private static final String[] numNames = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };
    
    private static String convertLessThanOneThousand(int number) {
        String current;
        
        if (number % 100 < 20){
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            current = numNames[number % 10];
            number /= 10;
            
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }
    
    public static String convert(int number) {

        if (number == 0) { return "zero"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        return (prefix + current).trim();
    }
}

class Gamer {
	private String gamerName, teamName;
	private int budget = 125000000;
	private List <String> players = new ArrayList<String>();
	
	public Gamer(String gamerName) {
		this.gamerName = gamerName;
	}
	
	Conversion c = new Conversion();
	
	public void assignPlayerToTeam(Object playerName, Object playerValue) {
		if(budget >= (Integer)playerValue) {
			this.players.add((String) playerName);
			this.budget -= (Integer)playerValue;
			System.out.println(playerName + " has been added to " + gamerName + "\'s team. \nRemaining Budget: " + c.convert(budget).toUpperCase());
		}
	}
	
	public void showAllPlayers() {
		System.out.println(gamerName + "\'s players: ");
		System.out.println("Budget: " + c.convert(getBudget()).toUpperCase());
		int i = 1;
		for(String player : this.players) {
			System.out.println(i + ". " + player);
			i++;
		}
	}
	
	public int getBudget() {
		return budget;
	}
	
	public String getGamerName() {
		return gamerName;
	}
}
