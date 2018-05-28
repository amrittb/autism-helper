package com.amrittb.autism.feelings;

import java.util.ArrayList;

public final class Emoji {

    private int drawableResourceId;
    private String name;
    private String caption;
    private int audioResourceId;

    public Emoji(int pathToDrawableRes, String name, String caption, int pathToAudioRes) {
        this.drawableResourceId = pathToDrawableRes;
        this.name = name;
        this.caption = caption;
        this.audioResourceId = pathToAudioRes;
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

    public int getAudioRes() {
        return audioResourceId;
    }

    // List of the emojies that will be displayed in
    public static ArrayList<Emoji> getEmojiList() {
        ArrayList<Emoji> emojies = new ArrayList<>();
        emojies.add(new Emoji(R.drawable.emoji_happy, "Happy", "I am happy.", R.raw.happy));
        emojies.add(new Emoji(R.drawable.emoji_angry, "Angry", "I am angry.", R.raw.angry));
        emojies.add(new Emoji(R.drawable.emoji_sick, "Sick", "I am sick.", R.raw.sick));
        emojies.add(new Emoji(R.drawable.emoji_crying, "Sad", "I am sad.", R.raw.sad));
        emojies.add(new Emoji(R.drawable.emoji_confused, "Confused", "I am confused!", R.raw.confused));
        emojies.add(new Emoji(R.drawable.emoji_love, "Love", "I love this!", R.raw.love));
        emojies.add(new Emoji(R.drawable.alert_food, "Food", "I want food.", R.raw.food));
        emojies.add(new Emoji(R.drawable.alert_drink, "Drink", "I need some drink.", R.raw.drink));
        emojies.add(new Emoji(R.drawable.alert_bell, "Help", "I need help.", R.raw.help));
        return emojies;
    }
}
