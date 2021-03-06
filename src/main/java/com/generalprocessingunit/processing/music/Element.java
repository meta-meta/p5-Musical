package com.generalprocessingunit.processing.music;

import processing.core.PApplet;

public abstract class Element {
    Duration rhythm;

    public float percentagePlayed = 0;
    public float percentagePassed = 0;

    public boolean wasPassed = false;

    public void reset() {
        wasPassed = false;
        percentagePlayed = 0;
        percentagePassed = 0;
    }

    public void incrementPercentagePlayed(float amount) {
        percentagePlayed = PApplet.min(amount + percentagePlayed, 1);
    }

    public abstract String getGlyph();
}
