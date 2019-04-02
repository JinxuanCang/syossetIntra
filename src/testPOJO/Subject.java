/**
 * 
 */
package testPOJO;

/**
 * @author jinxu
 *
 */
public class Subject {
	// private fields
	private String subjectName;
	private short score;

	/**
	 * 
	 */
	public Subject() {

	}

	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * @return the score
	 */
	public short getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(short score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "null";
	}
}
