package models.map;

import java.util.List;

import org.bson.types.ObjectId;

public class Map {
	private ObjectId id;

	private List<Room> rooms;
	private List<Hall> halls;
}
