package com.example.ztv.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TVShowDetails {

    @SerializedName("url")
    private String url;

    @SerializedName("description")
    private String description;

    @SerializedName("runtime")
    private int runtime;

    @SerializedName("image_path")
    private String image_path;

    @SerializedName("rating")
    private String rating;

    @SerializedName("genres")
    private String[] genres;

    @SerializedName("pictures")
    private String[] pictures;

    @SerializedName("episodes")
    private List<Episodes> episodes;


    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public int getRuntime() {
        return runtime;
    }

    public String getImage_path() {
        return image_path;
    }

    public String getRating() {
        return rating;
    }

    public String[] getGenres() {
        return genres;
    }

    public String[] getPictures() {
        return pictures;
    }

    public List<Episodes> getEpisodes() {
        return episodes;
    }
}
