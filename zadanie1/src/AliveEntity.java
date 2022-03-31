public abstract class AliveEntity extends Entity{
	private double height;

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public abstract void pressMe();
}
