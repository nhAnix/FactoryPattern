import java.util.Scanner;

public class EnemyShipTesting {
	
	public static void main(String[] args)
	{
		EnemyShipFactory factory=new EnemyShipFactory();
		EnemyShip anEnemyShip=null;
		
		Scanner inp=new Scanner(System.in);
		
		String option ="";
		
		System.out.println("what type of ship? (U / R / B)");
		
		while (inp.hasNextLine()) {
			option=inp.nextLine();
			anEnemyShip=factory.makeEnemyShip(option);
		
		
			if (anEnemyShip!=null) {
				doStuffEnemy(anEnemyShip);
			}
			else System.out.println("Type U, B or R");
		}
		
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip)
	{
		anEnemyShip.followHeroShip();
		anEnemyShip.displayEnemyShip();;
		anEnemyShip.enemyShipShoots();
	}

}
