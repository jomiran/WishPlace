package bross.wishplace.data;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

import bross.wishplace.entity.User;
import bross.wishplace.entity.WishPlace;


public class DataStore {
    public User user;
    public ArrayList<WishPlace> wishList = new ArrayList<WishPlace>();
    public ArrayList<WishPlace> selectCategory = new ArrayList<WishPlace>();
    public LatLng latlng = new LatLng(37, 128);
    public String locationName = new String();
    private volatile static DataStore uniqueInstance;
    private int select;

    private DataStore() {
    }

    private int lastWishPlaceNum;

    public void addWishplace(WishPlace wishPlace) {
        wishList.add(wishPlace);
    }

    public WishPlace getWishData(int num) {
        return wishList.get(num);
    }

    public static DataStore getInstnace() {
        if (uniqueInstance == null) {
            synchronized (DataStore.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DataStore();
                }
            }
        }
        return uniqueInstance;
    }

    public int getSelect() {
        return select;
    }

    public void setSelect(int select) {
        this.select = select;
    }

    public int getLastWishPlaceNum() {
        return lastWishPlaceNum;
    }

    public void setLastWishPlaceNum(int lastWishPlaceNum) {
        this.lastWishPlaceNum = lastWishPlaceNum;
    }
}

