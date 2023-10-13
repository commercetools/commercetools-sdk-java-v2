
package com.commercetools.history.models.common;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ParcelMeasurementsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelMeasurementsBuilder builder) {
        ParcelMeasurements parcelMeasurements = builder.buildUnchecked();
        Assertions.assertThat(parcelMeasurements).isInstanceOf(ParcelMeasurements.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelMeasurements.builder().heightInMillimeter(5) },
                new Object[] { ParcelMeasurements.builder().lengthInMillimeter(4) },
                new Object[] { ParcelMeasurements.builder().widthInMillimeter(2) },
                new Object[] { ParcelMeasurements.builder().weightInGram(9) } };
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
