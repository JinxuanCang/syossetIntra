import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class DatabaseAccess {
	//DB access authentication
	static MongoClient mongo = MongoClients.create(Settings.MongoClientURL); // bind port
	
	// custom variables below
	ArrayList<String> docsJson;
	
	// must, vital database access info storage
	MongoDatabase db;
	MongoCollection<Document> collection;
	FindIterable<Document> documents;
	
	// other constructor, sets target database and collection.
	protected DatabaseAccess(String database, String collection) {
		setDatabase(database);
		setCollection(collection);
	}
	// default constructor
	protected DatabaseAccess() {
		// nothing to do
	}
	
	// sets database by name
	protected void setDatabase(String database) {
		db = mongo.getDatabase(database);
	}
	// sets collection by name
	protected void setCollection(String collection) {
		this.collection = db.getCollection(collection);
	}
	protected ArrayList<String> getAllDocs() {
		docsJson = new ArrayList<String>();
		FindIterable<Document> documents = collection.find();
		for (Document document : documents) {
			docsJson.add(document.toJson());
	    }
		return docsJson;
	}
	protected void getAllDocs(HttpServletResponse response) throws IOException, ServletException {
		getAllDocs();
		for (String document : docsJson) {
			response.getWriter().append(document);
	    }
	}
	protected boolean updateOne() {
		// TODO update one document
		return false;
	}
	
//	protected boolean addCoordinator() {
//		Coordinator c = new Coordinator();
//		db.add(c);
//	}
}
