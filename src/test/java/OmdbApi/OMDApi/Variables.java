package OmdbApi.OMDApi;


public class Variables {
	private static String title = "harry+potter";
	private static String harryPotterURL = "http://www.omdbapi.com/?s=" + getTitle() + "&apikey=ad4d70bc";
	private static String imdbURL;
	private static int responseCode = 0;
	private static String harryPotterTitle = "Harry Potter and the Sorcerer's Stone";

	public static String getHarryPotterTitle() {
		return harryPotterTitle;
	}

	public static void setHarryPotterTitle(String harryPotterTitle) {
		Variables.harryPotterTitle = harryPotterTitle;
	}

	public static int getResponseCode() {
		return responseCode;
	}

	public static void setResponseCode(int responseCode) {
		Variables.responseCode = responseCode;
	}

	public static String getHarryPotterURL() {
		return harryPotterURL;
	}

	public static void setHarryPotterURL(String harryPotterURL) {
		Variables.harryPotterURL = harryPotterURL;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Variables.title = title;
	}

	public static String getImdbURL() {
		return imdbURL;
	}

	public static void setImdbURL(String imdbURL) {
		Variables.imdbURL = imdbURL;
	}
}
