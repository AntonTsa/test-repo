package org.example;

import org.example.feature1.Feature1;
import org.example.feature2.Feature2;

public class Aggregator {
    private final Feature1 feature1 = new Feature1();
    private final Feature2 feature2 = new Feature2();

    public String getFeatures() {
        return feature1.getFeature1() + " & " + feature2.getFeature2();
    }
}
