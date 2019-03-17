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

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import testPOJO.POJOPerson;

@WebServlet("/POJOTest")
public class POJOTest extends HttpServlet implements Settings{
	private static final long serialVersionUID = 1L;
	// create codec registries for POJOs
	CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));
	
	//DB access authentication
	static com.mongodb.client.MongoClient mongo = MongoClients.create(Settings.MongoClientURL); // bind port
	
	// must, vital database access info storage
	MongoDatabase database = mongo.getDatabase("DemoSite");
	MongoCollection<POJOPerson> collection = database.getCollection("sample3", POJOPerson.class);
	FindIterable<Document> documents;
	
	//constructor
    public POJOTest() {
        super();
    }
    private void helper() {
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		helper();
		response.getWriter().append("Check Console");
	}
}
