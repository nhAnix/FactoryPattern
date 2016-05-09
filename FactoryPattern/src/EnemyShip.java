
public abstract class EnemyShip {
	
	private String name;
	private double amtDmg;
	
	void setName(String newName) {name=newName;}
	String getName() {return name;}
	
	void setDmg(double newDmg) {amtDmg=newDmg;}
	double getDmg() {return amtDmg;}
	
	public void followHeroShip()
	{
		System.out.println(getName()+" is following the hero");
	}
	
	public void displayEnemyShip()
	{
		System.out.println(getName()+" is on the screen");
	}
	
	public void enemyShipShoots()
	{
		System.out.println(getName()+" attacks and does "+getDmg());
	}
}
