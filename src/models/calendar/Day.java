package models.calendar;

public class Day {
	private Type type;
	private boolean snowDay;
	private boolean twoHourDelay;

	enum Type {
		RED, WHITE, NO_SCHOOL
	}
}