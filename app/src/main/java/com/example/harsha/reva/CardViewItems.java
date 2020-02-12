package com.example.harsha.reva;

/**
 * Created by harsha on 28-11-2018.
 */

public class CardViewItems {
    private String mTitle;
    private String mUploadBy;
    private String mUploadOn;
    private int mUnitNo;

    public CardViewItems(String Title, String UploadBy,String UploadOn, int UnitNo) {
        mTitle = Title;
        mUploadBy = UploadBy;
        mUploadOn = UploadOn;
        mUnitNo = UnitNo;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUploadBy() {
        return mUploadBy;
    }

    public String getUploadOn(){
        return mUploadOn;
    }

    public int getUnitNo() {
        return mUnitNo;
    }
}
