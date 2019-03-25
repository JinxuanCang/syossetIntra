/**
 * @author Chite
 * initial creation: 2/25/19
 */
// where are Ms. Owens' demanded comments?
package models;

import java.util.ArrayList;

public class Coordinator extends Staff {
	// Lucas: @Nichol, if you define department as ArrayList<Department> departments,
	//			there is a lopping issue.
	// Department object also contains Coordinator, Coordinator contains Department?
	private ArrayList<String> departments;
	private String coordinatorTitle;

	public Coordinator() {
		super();// Lucas: ??? default constructor always calls super() at first line?
	}

	/**
	 * @param department setter and getter
	 */
	public void setDepartment(ArrayList<String> departments) {
		this.departments = departments;
	}

	public ArrayList<String> getDepartment() {
		return departments;
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
