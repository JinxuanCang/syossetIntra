package pdf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurriculumUploader
 */
@WebServlet("/CurriculumUploader")
public class CurriculumUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*
	 * 
	 * CodecRegistry pojoCodecRegistry =
	 * fromRegistries(MongoClient.getDefaultCodecRegistry(),
	 * fromProviders(PojoCodecProvider.builder().automatic(true).build()));
	 * //registers POJO object classes // DB access authentication static
	 * com.mongodb.client.MongoClient mongo; // bind port { MongoClientSettings
	 * settings =
	 * MongoClientSettings.builder().codecRegistry(pojoCodecRegistry).build(); mongo
	 * = MongoClients.create(settings); }
	 * 
	 * // must, vital database access info storage MongoDatabase database =
	 * mongo.getDatabase("DemoSite"); MongoCollection<Curriculum> collection =
	 * database.getCollection("ModelTest", Curriculum.class);
	 */

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CurriculumUploader() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Check Console");
	}

}
