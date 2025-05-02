
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelMeasurementsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelMeasurementsBuilder builder) {
        ParcelMeasurements parcelMeasurements = builder.buildUnchecked();
        Assertions.assertThat(parcelMeasurements).isInstanceOf(ParcelMeasurements.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "heightInMillimeter", ParcelMeasurements.builder().heightInMillimeter(5) },
                new Object[] { "lengthInMillimeter", ParcelMeasurements.builder().lengthInMillimeter(4) },
                new Object[] { "widthInMillimeter", ParcelMeasurements.builder().widthInMillimeter(2) },
                new Object[] { "weightInGram", ParcelMeasurements.builder().weightInGram(9) } };
    }

    @Test
    public void heightInMillimeter() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setHeightInMillimeter(5);
        Assertions.assertThat(value.getHeightInMillimeter()).isEqualTo(5);
    }

    @Test
    public void lengthInMillimeter() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setLengthInMillimeter(4);
        Assertions.assertThat(value.getLengthInMillimeter()).isEqualTo(4);
    }

    @Test
    public void widthInMillimeter() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setWidthInMillimeter(2);
        Assertions.assertThat(value.getWidthInMillimeter()).isEqualTo(2);
    }

    @Test
    public void weightInGram() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setWeightInGram(9);
        Assertions.assertThat(value.getWeightInGram()).isEqualTo(9);
    }
}
