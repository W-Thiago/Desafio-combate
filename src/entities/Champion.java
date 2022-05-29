package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {    
		this.life = life;
	}

	public int getAttack() {          //
		return attack;
	}

	public int getArmor() {
		return armor;
	}
	
	public void takeDamage (Champion other) {
		
		int damage;
		if (armor >= other.getAttack()) {   // se a minha armadura for maior ou igual ao ataque do outro (-1 de dano) 
			damage =1;
		}
		else {
			damage = other.getAttack() - armor;
		}
		
		life = life - damage;
	}
	
	public String status() {
		if (this.life <=0) {
			return this.name + ": " + "0 de vida (morreu)";
		} else {
			return this.name + ": " + String.format("%d", this.life) +  " de vida";
		}
	}

	
	
	
}



                         // champion - campe�o //
                         //name - nome // 
                         //life - vida//
                         //attack - ataque 
                         // armor - armaduras


                        //champion - campe�o
                       // takeDamage - levar dano  (other-outro): vazio
                       // status, Initial life-  Vida inicial, 