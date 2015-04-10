package bross.wishplace.json;

import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import bross.wishplace.data.DataStore;
import bross.wishplace.entity.WishPlace;


public class JSONParser extends AsyncTask<Void, Void, Void> {
    String url = "http://202.31.202.172:8080/WishPlace_Server/jsp/";
    boolean isNull = false;
    public static String result = "";
    String menu;
    DataStore datas = DataStore.getInstnace();

    public JSONParser(String menu, String url) {
        this.menu = menu;
        this.url += url;
        result = "false";
    }

    @Override
    protected Void doInBackground(Void... params) {

        JSONParserHelper jsonParserHelper = new JSONParserHelper();
        JSONArray jsonArray = jsonParserHelper.getJSONFromURL(url);

        if (jsonArray == null) {
            isNull = true;
            return null;
        }

        try {
            if (menu.equals("findID")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("email").toString();
            } else if (menu.equals("findPW")) {

                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("password").toString();
                Log.i("result", result);
            } else if (menu.equals("join")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("join").toString();
                Log.i("result", result);
            } else if (menu.equals("getAddress")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("local").toString();
                Log.i("result", result);
            } else if (menu.equals("login")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("login").toString();
                Log.i("result", result);
            } else if (menu.equals("regit")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("regit").toString();
                int lastWishNum = jsonObject.getInt("wish_num");
                datas.setLastWishPlaceNum(lastWishNum + 1);
                Log.i("result", result);

            } else if (menu.equals("like")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("state").toString();
                Log.i("result", result);
            } else if (menu.equals("savedMoney")) {
                Log.i("URL__", url);
            } else if (menu.equals("leaveUser")) {
                Log.i("URL__", url);
            } else if (menu.equals("serverState")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                result = jsonObject.get("state").toString();
                Log.i("result", result);
            } else if (menu.equals("getUser")) {
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                String email = jsonObject.get("email").toString();
                Log.i("email", email);
                String phone = jsonObject.get("phone").toString();
                Log.i("phone", phone);
                int wishPoint = jsonObject.getInt("wishPoint");
                Log.i("wishPoint", Integer.toString(wishPoint));
                int maxWishPoint = jsonObject.getInt("maxWishPoint");
                Log.i("maxWishPoint", Integer.toString(maxWishPoint));
                int pointMoney = jsonObject.getInt("money");
                Log.i("money", Integer.toString(pointMoney));
//				MyInfo.user = new User(email, phone, wishPoint, maxWishPoint,
//						pointMoney);

            } else if (menu.equals("changePW")) {
                Log.i("URL__", url);
            } else if (menu.equals("getWishPlace")) {
                DataStore datas = DataStore.getInstnace();
                datas.wishList.clear();

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    int num = Integer.parseInt(jsonObject.getString("num"));
                    double lng = Double
                            .parseDouble(jsonObject.getString("lng"));
                    String email = jsonObject.getString("email");
                    double lat = Double
                            .parseDouble(jsonObject.getString("lat"));
                    String category = jsonObject.getString("category");
                    String type = jsonObject.getString("type");
                    int point = Integer.parseInt(jsonObject
                            .getString("point"));
                    String location = jsonObject.getString("location");
                    String contents = jsonObject.getString("content");

                    datas.addWishplace(new WishPlace(num, email, lat,
                            lng, category, type, location, contents, point));
                    MarkerOptions marker = new MarkerOptions();
                    marker.position(new LatLng(lat, lng));

                }
                result = "true";
            }
        } catch (JSONException e) {
            Log.i("JOSNEXception", e.toString());
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPreExecute() {

        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Void... progress) {
    }

    @Override
    protected void onPostExecute(Void result) {
    }
}
