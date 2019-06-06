package com.miguelacevedo.hw6;

public class Camera {

    private String url;
    private String location;
    private String type;

    public Camera (String description, String url, String type) {
        this.type = type;
        this.location = description;
        setUrl(url);
    }

    private void setUrl(String url) {

        String SDOTBaseUrl = "http://www.seattle.gov/trafficcams/images/";
        String WSDOTBaseUrl = "http://images.wsdot.wa.gov/nw/";

        if (type.equals("sdot")) {
            this.url = SDOTBaseUrl + url;
        } else if (type.equals("wsdot")) {
            this.url = WSDOTBaseUrl + url;
        }

    }

    public String getUrl() {
        return this.url;
    }

    public String getLocation() {
        return this.location;
    }
}
