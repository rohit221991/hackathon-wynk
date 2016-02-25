package model;

import constants.ApiConstants;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by rohit on 2/25/16.
 */
public class HelloTune implements Serializable {
    private String mId;

    private String mLang;

    private String mTitle;

    private String mPrice;

    private String mPurchaseUrl;

    private String mOperator;

    private String mPreviewUrl;

    private String mVCode;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getLang() {
        return mLang;
    }

    public void setLang(String lang) {
        mLang = lang;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getPurchaseUrl() {
        return mPurchaseUrl;
    }

    public void setPurchaseUrl(String purchaseUrl) {
        mPurchaseUrl = purchaseUrl;
    }

    public String getOperator() {
        return mOperator;
    }

    public void setOperator(String operator) {
        mOperator = operator;
    }

    public String getPreviewUrl() {
        return mPreviewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        mPreviewUrl = previewUrl;
    }

    public String getVCode() {
        return mVCode;
    }

    public void setVCode(String vCode) {
        mVCode = vCode;
    }

    public HelloTune fromJsonObject(JSONObject obj) throws JSONException {
        this.setTitle(obj.optString(ApiConstants.HelloTune.TITLE));
        this.setPrice(obj.optString(ApiConstants.HelloTune.PRICE));
        this.setPurchaseUrl(obj.optString(ApiConstants.HelloTune.PURCHASE_URL));
        this.setOperator(obj.optString(ApiConstants.HelloTune.OPERATOR));
        this.setPreviewUrl(obj.optString(ApiConstants.HelloTune.PREVIEW_URL));
        this.setVCode(obj.optString(ApiConstants.HelloTune.VCODE));
        return this;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put(ApiConstants.HelloTune.TITLE, this.getTitle());
        obj.put(ApiConstants.HelloTune.PRICE, this.getPrice());
        obj.put(ApiConstants.HelloTune.PURCHASE_URL, this.getPurchaseUrl());
        obj.put(ApiConstants.HelloTune.OPERATOR, this.getOperator());
        obj.put(ApiConstants.HelloTune.PREVIEW_URL, this.getPreviewUrl());
        obj.put(ApiConstants.HelloTune.VCODE, this.getVCode());
        return obj;
    }
}
