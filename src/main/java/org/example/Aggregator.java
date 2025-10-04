package org.example;

import org.example.feature3.Feature3;

public class Aggregator {
    private final Feature3 feature3 = new Feature3();

    public String getMainFeature() {
        return feature3.getFeature3();
    }
}
