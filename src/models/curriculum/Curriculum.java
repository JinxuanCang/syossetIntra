package models.curriculum;

import java.awt.Image;
import java.util.List;

import org.bson.types.ObjectId;

public class Curriculum {
	private ObjectId id;

	private String schoolName;
	private int year;
	private Image coverPicture;
	private String acknowledgements;

	private List<Section> sections;
	private List<Department> departments;
	private List<Course> courses;
}