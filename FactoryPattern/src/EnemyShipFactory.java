
public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String req)
	{
		
		if (req.equals("U")) return new UFOEnemyShip();
		
		else if (req.equals("R")) return new RocketEnemyShip();
		
		else if (req.equals("B")) return new BigUFOEnemyShip();
		
		else return null;
	}

}
