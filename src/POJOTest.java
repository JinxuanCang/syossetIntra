import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.io.IOException;

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

import testPOJO.Address;
import testPOJO.Person;

@WebServlet("/POJOTest")
public class POJOTest extends HttpServlet implements Settings {
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
	public POJOTest() {
		super(); // 
	}

	private void test() {
		Person originalPerson = new Person("Nicholas", "Chite",
				new Address("21A", "Johhny Street", "Syosset", "NY", "11791"));

		System.out.println("Person Original: ");
		System.out.println(originalPerson);

		collection.insertOne(originalPerson);

		MongoCursor<Person> iterator = collection.find().iterator();
		Person retrievedPerson = iterator.next(); // only will print the first item!!

		System.out.println("Person Retrieved: ");
		System.out.println(retrievedPerson);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		test();
		response.getWriter().append("Check Console");
	}
}
