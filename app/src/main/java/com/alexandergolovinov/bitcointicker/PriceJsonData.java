package com.alexandergolovinov.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class PriceJsonData {

    private String price;

    protected static PriceJsonData jsonMapToObject(JSONObject response) {
        PriceJsonData priceJsonData = new PriceJsonData();
        try {
            priceJsonData.setPrice((String.valueOf(response.getJSONObject("open").getDouble("hour"))));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return priceJsonData;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
