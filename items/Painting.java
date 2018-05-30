package com.alexvasilkov.foldablelayout.sample.items;

import android.content.res.Resources;
import android.content.res.TypedArray;

import com.alexvasilkov.foldablelayout.sample.R;

public class Painting {

    private final int imageId;
    private final String title;
    private final String year;
    private final String amount;
    private final String location;
    private final String description;

    private Painting(int imageId, String title, String year, String amount, String location, String description) {
        this.imageId = imageId;
        this.title = title;
        this.year = year;
        this.amount = amount;
        this.location = location;
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {return year;}

    public String getAmount() {return amount;}

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }


    public static Painting[] getAllPaintings(Resources res) {
        String[] titles = res.getStringArray(R.array.paintings_titles);
        String[] years = res.getStringArray(R.array.paintings_years);
        String[] amounts = res.getStringArray(R.array.amounts);
        String[] locations = res.getStringArray(R.array.paintings_locations);
        String[] descriptions = res.getStringArray(R.array.description);

        TypedArray images = res.obtainTypedArray(R.array.paintings_images);

        int size = titles.length;
        Painting[] paintings = new Painting[size];

        for (int i = 0; i < size; i++) {
            final int imageId = images.getResourceId(i, -1);
            paintings[i] = new Painting(imageId, titles[i], years[i], amounts[i], locations[i], descriptions[i]);
        }

        images.recycle();

        return paintings;
    }

}
