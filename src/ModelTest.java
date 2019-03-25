import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import models.Course;
import models.Curriculum;
import models.Department;
import models.Staff;
import models.Teacher;
import testPOJO.Address;
import models.Person;

@WebServlet("/ModelTest")
public class ModelTest extends HttpServlet implements Settings {
	private static final long serialVersionUID = 1L;
	// create automatic codec registries for POJOs
	CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
			fromProviders(PojoCodecProvider.builder().automatic(true).build()));
	
	// DB access configuration
	static com.mongodb.client.MongoClient mongo; // create once for all instances
	{ // registers POJO object classes
		ConnectionString connection = new ConnectionString("mongodb://localhost:27017");
		MongoClientSettings settings = MongoClientSettings.builder()
														  .codecRegistry(pojoCodecRegistry)
														  .applyConnectionString(connection)
														  .build();
		mongo = MongoClients.create(settings);
	}

	// must, vital database access info storage
	MongoDatabase database = mongo.getDatabase("DemoSite");// select database
	MongoCollection<Person> collection = database.getCollection("sample3", Person.class); // select collection and model class

	FindIterable<Document> documents;

	// default constructor
	public ModelTest() {
		super(); // 
	}

	/*private void test() {
		Curriculum curriculum = new Curriculum();
		curriculum.setYear(2018);
		Course course = new Course();
		course.setName("JohN ChAe");
		course.setDescription("john chae hhosdfkajshldfjksdf");
		course.setCredits(50);
		Department department = new Department();
		var courses = new ArrayList<Course>();
		courses.add(course);
		department.setCourses(courses);
		ArrayList<Department> deps = new ArrayList<Department>();
		deps.add(department);
		curriculum.setDepartments(deps);
		collection.insertOne(curriculum);
	}*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//test();
		response.getWriter().append("Check Console");
	}
}
