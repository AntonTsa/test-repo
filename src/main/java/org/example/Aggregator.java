package org.example;

import org.example.feature2.Feature2;

public class Aggregator {
    private final Feature2 feature2 = new Feature2();

    public String getMainFeature() {
        return feature2.getFeature2();
    }
}
