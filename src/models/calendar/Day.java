package models.calendar;

public class Day {
	private Type type;
	private boolean snowDay;
	private boolean twoHourDelay;
	// Enum declaration day type: RED, WHITE, NO_SCHOOL
	enum Type {
		RED, WHITE, NO_SCHOOL
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the twoHourDelay
	 */
	public boolean isTwoHourDelay() {
		return twoHourDelay;
	}

	/**
	 * @param twoHourDelay the twoHourDelay to set
	 */
	public void setTwoHourDelay(boolean twoHourDelay) {
		this.twoHourDelay = twoHourDelay;
	}

	/**
	 * @return the snowDay
	 */
	public boolean isSnowDay() {
		return snowDay;
	}

	/**
	 * @param snowDay the snowDay to set
	 */
	public void setSnowDay(boolean snowDay) {
		this.snowDay = snowDay;
	}
}