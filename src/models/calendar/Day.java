package models.calendar;

import java.util.Date;

public class Day {
	private int id;

	private Date date;
	private Type type;

	private boolean snowDay;
	private boolean twoHourDelay;

	enum Type {
		RED, WHITE, NO_SCHOOL
	}
}