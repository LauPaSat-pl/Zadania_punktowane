import ammoTypes.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class AmmoChest {
	HashSet<Ammo> chest;

	public AmmoChest() {
		this.chest = new HashSet<>();
		for (int i = 0; i < 20; i++) {
			chest.add(new AntiArmorGrenade());
			chest.add(new OffensiveGrenade());
			chest.add(new DefensiveGrenade());
		}
		for (int i = 0; i < 2000; i++) {
			chest.add(new Bullet());
		}
	}

	public HashSet<Ammo> getEcoArmourPiercingGrenades(){
		HashSet<Ammo> res = new HashSet<>();
		Consumer<Ammo> lambda = (ammo)->{
			if (ammo instanceof AntiArmorGrenade ){
				if (((AntiArmorGrenade) ammo).getCO2Emission()<=225){
					res.add(ammo);
				}
			}
		};
		chest.forEach(lambda);
		return res;
	}

	public void findUnlockedGrenades(){
		Consumer<Ammo> lambda = (ammo)->{
			if (ammo instanceof DefensiveGrenade | ammo instanceof OffensiveGrenade ){
				if (!((Grenade) ammo).isUnarmed()){
					System.out.println("Watch out!!!");
				}
			}
		};
		chest.forEach(lambda);
	}
	public void getSummarizedCaliber(){
		Consumer<Ammo> lambda = (ammo)->{
			if (ammo instanceof Bullet ){
				System.out.println("Watch out!!!");
			}

		};
	}

}

