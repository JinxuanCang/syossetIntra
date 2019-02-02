/**
 * @author jinxu
 *
 */
public interface Settings {
	final String clientAddr = "localhost";
	final int port = 27017;
	public static final String MongoClientURL = "mongodb://" + clientAddr + ":" + port;
}
