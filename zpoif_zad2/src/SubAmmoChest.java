import ammoTypes.Bullet;
import ammoTypes.Calibers;

public class SubAmmoChest extends AmmoChest{
	public void upgradeCaliber(Calibers caliber){
		chest.forEach((x)->{
		if (x instanceof Bullet){
			if ( ((Bullet) x).getCaliber()==Calibers.FOURPOINTZERO |  ((Bullet) x).getCaliber()==Calibers.FIVEPOINTFIFTYSIX){
				return;
			}
			((Bullet) x).setCaliber(caliber);
		}
		});
	}
}
