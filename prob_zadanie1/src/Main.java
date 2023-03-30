
public class Main {
	public static void main(String[] args) {
		MineField mineField = new MineField();
		Bozena mineFlail = new Bozena(mineField);

		for(int i=0;i<50;i++){
			mineFlail.destroyMines(mineField);
		}
	}
}
