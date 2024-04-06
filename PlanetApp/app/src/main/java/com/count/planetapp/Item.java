package com.count.planetapp;

public class Item {

    private final String name;  // Name of the item
    private final int imageResourceId;  // Resource ID of the image
    private final int moons;  // Optional moons (can be removed if not needed)

    public Item(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.moons = 0;  // Set an empty string as default for moons (optional)
    }

    public Item(String name, int imageResourceId, int moons) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.moons = moons;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getMoons() {
        return moons;
    }
}
