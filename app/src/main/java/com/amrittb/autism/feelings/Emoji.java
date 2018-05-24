package com.amrittb.autism.feelings;

import java.util.ArrayList;

public final class Emoji {

    private int drawableResourceId;
    private String name;
    private String caption;

    public Emoji(int pathToDrawableRes, String name, String caption) {
        this.drawableResourceId = pathToDrawableRes;
        this.name = name;
        this.caption = caption;
    }

    public int getDrawableRes() {
        return drawableResourceId;
    }

    public String getName() {
        return name;
    }

    public String getCaption() {
        return caption;
    }

    // List of the emojies that will be displayed in
    public static ArrayList<Emoji> getEmojiList() {
        ArrayList<Emoji> emojies = new ArrayList<>();
        emojies.add(new Emoji(R.drawable.emoji_happy, "Happy", "I am happy."));
        emojies.add(new Emoji(R.drawable.emoji_angry, "Angry", "I am angry."));
        emojies.add(new Emoji(R.drawable.emoji_sick, "Sick", "I am feeling sick."));
        emojies.add(new Emoji(R.drawable.emoji_crying, "Sad", "I am feeling sad."));
        emojies.add(new Emoji(R.drawable.emoji_confused, "Confused", "I am confused!"));
        emojies.add(new Emoji(R.drawable.emoji_love, "Love", "I love this!"));
        emojies.add(new Emoji(R.drawable.alert_food, "Food", "I want some food."));
        emojies.add(new Emoji(R.drawable.alert_drink, "Drink", "I need some water."));
        emojies.add(new Emoji(R.drawable.alert_bell, "Help", "Help me!"));
        return emojies;
    }
}
