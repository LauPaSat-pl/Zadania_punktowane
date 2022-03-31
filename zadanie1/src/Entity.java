public abstract class Entity {
	private boolean ecological;

	public Entity() {
		ecological = false;
	}

	public void setEcological(boolean ecological) {
		this.ecological = ecological;
	}

	public abstract void pressMe();

}
