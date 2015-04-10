package bross.wishplace.json;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JSONParserHelper {
    static JSONArray jsonArray = null;
    ArrayList<JSONObject> jsonarr = new ArrayList<JSONObject>();

    public JSONParserHelper() {
        jsonarr = new ArrayList<JSONObject>();
    }

    public static JSONArray getJSONFromURL(String url) {
        try {

            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet httpPost = new HttpGet(url);
            HttpResponse httpResponse;
            httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            InputStream inputStream = httpEntity.getContent();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream));
            String line = null;
            String tmp = "";
            // jsonArray = new JSONArray();
            while ((line = bufferedReader.readLine()) != null)
                tmp += line;

            Log.i("line", tmp);
            try {
                jsonArray = new JSONArray(tmp);
            } catch (Exception e) {
                Log.i("JsonArray", e.toString());
            }
            inputStream.close();
        } catch (ClientProtocolException e) {
            Log.i("Protocol", e.toString());
        } catch (IOException e) {
            Log.i("IOException", e.toString());
        }
        return jsonArray;
    }
}