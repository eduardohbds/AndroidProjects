package com.treino.recyclerviewcard;

public class ItemCardModel {
    String title;
    String description;
    int imageBackground;
    ItemCardModel(String title, String description, int imageBackground) {
        this.title = title;
        this.description = description;
        this.imageBackground = imageBackground;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getimageBackground() {
        return imageBackground;
    }

    public void setimageBackground(int imageBackground) {
        this.imageBackground = imageBackground;
    }
}
