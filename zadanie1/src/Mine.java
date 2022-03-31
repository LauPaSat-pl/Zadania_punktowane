public abstract class Mine extends Entity{

	private static int mineCounter = 0;
	private int mineId;
	protected boolean armed;

	public Mine() {
		mineCounter+=10;
		this.mineId = mineCounter;
		this.armed = false;
	}

	public void armMe(){
		armed=true;
	}

	@Override
	public abstract void pressMe();
}
