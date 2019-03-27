package models.calendar;

import java.util.List;

import org.bson.types.ObjectId;

public class Calendar {
	private ObjectId id;
	
	private List<Day> days;
	private List<Announcement> announcements;
	private List<Event> events;
}
