package org.example;

import org.example.feature1.Feature1;

public class Aggregator {
    private final Feature1 feature1 = new Feature1();

    public String getMainFeature() {
        return feature1.getFeature1();
    }
}
