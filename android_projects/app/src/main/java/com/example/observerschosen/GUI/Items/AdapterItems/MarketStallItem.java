package com.example.observerschosen.GUI.Items.AdapterItems;

public class MarketStallItem {

    public String MarketStallPurpose;
    public String ImagePath;
    public String stallType;

    public MarketStallItem(String purpose, String image, String stallType){
        this.ImagePath = image;
        this.MarketStallPurpose = purpose;
        this.stallType = stallType;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public String getMarketStallPurpose() {
        return MarketStallPurpose;
    }

    public String getStallType() {
        return stallType;
    }
}
