package com.miguelacevedo.hw5;

import android.content.Context;

public class Movie {

    private String title;
    private String rentOrBuy;

    public Movie(String title, String rentOrBuy) {
        this.title = title;
        this.rentOrBuy = rentOrBuy;
    }

    public Movie(Context context) {
        this.title = "Title";
        this.rentOrBuy = "Buy";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRentOrBuy() {
        return rentOrBuy;
    }

    public void setRentOrBuy(String rentOrBuy) {
        this.rentOrBuy = rentOrBuy;
    }

    public float price(int quantity){
        float price = 0f;

        if (rentOrBuy.equals("Rent")){
            price = 4.99f;
        } else if (rentOrBuy.equals("Buy")){
            price = 19.99f;
        }

        return price*quantity;
    }
}
