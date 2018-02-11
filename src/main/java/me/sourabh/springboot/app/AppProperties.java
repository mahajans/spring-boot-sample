package me.sourabh.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * App configurations
 * <p>
 * Created by sourabhmahajan on 12/02/18.
 */
@ConfigurationProperties(prefix = "app")
@Component
public class AppProperties {

    private int sampleIntProperty;

    private String sampleStringProperty;

    private List<Integer> sampleListProperty;

    public List<Integer> getSampleListProperty() {
        return sampleListProperty;
    }

    public void setSampleListProperty(List<Integer> sampleListProperty) {
        this.sampleListProperty = sampleListProperty;
    }

    public int getSampleIntProperty() {
        return sampleIntProperty;
    }

    public void setSampleIntProperty(int sampleIntProperty) {
        this.sampleIntProperty = sampleIntProperty;
    }

    public String getSampleStringProperty() {
        return sampleStringProperty;
    }

    public void setSampleStringProperty(String sampleStringProperty) {
        this.sampleStringProperty = sampleStringProperty;
    }
}
