
package com.commercetools.importapi.models.orders;

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
        return new Object[][] { new Object[] { ParcelMeasurements.builder().heightInMillimeter(0.917797) },
                new Object[] { ParcelMeasurements.builder().lengthInMillimeter(0.6846919) },
                new Object[] { ParcelMeasurements.builder().widthInMillimeter(0.89507943) },
                new Object[] { ParcelMeasurements.builder().weightInGram(0.583528) } };
    }

    @Test
    public void heightInMillimeter() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setHeightInMillimeter(0.917797);
        Assertions.assertThat(value.getHeightInMillimeter()).isEqualTo(0.917797);
    }

    @Test
    public void lengthInMillimeter() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setLengthInMillimeter(0.6846919);
        Assertions.assertThat(value.getLengthInMillimeter()).isEqualTo(0.6846919);
    }

    @Test
    public void widthInMillimeter() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setWidthInMillimeter(0.89507943);
        Assertions.assertThat(value.getWidthInMillimeter()).isEqualTo(0.89507943);
    }

    @Test
    public void weightInGram() {
        ParcelMeasurements value = ParcelMeasurements.of();
        value.setWeightInGram(0.583528);
        Assertions.assertThat(value.getWeightInGram()).isEqualTo(0.583528);
    }
}
