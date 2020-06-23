package OmdbApi.OMDApi;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class CodeTest {
	@Test
	public void Test() throws IOException {

		JSONObject harryPotterResponse = new JSONObject(URLTest.URL(Variables.getHarryPotterURL()));

		JSONArray jArray = harryPotterResponse.getJSONArray("Search");

		String imdbURL = null;

		for (int i = 0; i < jArray.length(); i++) {

			JSONObject object = jArray.optJSONObject(i);

			if (object.getString("Title").contentEquals(Variables.getHarryPotterTitle())) {

				imdbURL = "http://www.omdbapi.com/?i=" + object.get("imdbID") + "&apikey=ad4d70bc&plot=full";
				Variables.setImdbURL(imdbURL);

			}

		}

		JSONObject IMDBResponse = new JSONObject(URLTest.URL(Variables.getImdbURL()));

		System.out.println("Title: " + IMDBResponse.get("Title"));
		System.out.println("Year: " + IMDBResponse.get("Year"));
		System.out.println("Released: " + IMDBResponse.get("Released"));
		System.out.println("Http Status Code: " + Variables.getResponseCode());

	}
}
