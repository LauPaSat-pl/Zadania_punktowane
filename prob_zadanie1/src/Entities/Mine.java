package Entities;

public abstract class Mine extends Entity {

	private static int mineCounter = 0;
	protected boolean armed;
	private int mineId;

	public Mine() {
		mineCounter += 10;
		this.mineId = mineCounter;
		this.armed = false;
	}

	public void armMe() {
		armed = true;
	}


	@Override
	public abstract void pressMe();
}
