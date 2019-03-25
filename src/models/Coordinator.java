package models;

public class Coordinator extends Staff {
	private String coordinatorTitle;

	public Coordinator() {
		super();
	}

	/**
	 * @param coordinatorTitle setter and getter
	 */
	public String getCoordinatorTitle() {
		return coordinatorTitle;
	}

	public void setCoordinatorTitle(String coordinatorTitle) {
		this.coordinatorTitle = coordinatorTitle;
	}
}
