package org.example.feature3;

import org.example.feature1.Feature1;
import org.example.feature2.Feature2;

public class Feature3 {
    private final Feature1 feature1 = new Feature1();
    private final Feature2 feature2 = new Feature2();

    public String getFeature3() {
        return "Feature3 combines: " + feature1.getFeature1() + " and " + feature2.getFeature2();
    }

}
