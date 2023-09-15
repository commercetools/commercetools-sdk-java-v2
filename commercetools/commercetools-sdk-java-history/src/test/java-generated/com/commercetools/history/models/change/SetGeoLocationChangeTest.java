
package com.commercetools.history.models.change;

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
public class SetGeoLocationChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetGeoLocationChangeBuilder builder) {
        SetGeoLocationChange setGeoLocationChange = builder.buildUnchecked();
        Assertions.assertThat(setGeoLocationChange).isInstanceOf(SetGeoLocationChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetGeoLocationChange.builder().change("change") },
                new Object[] { SetGeoLocationChange.builder()
                        .previousValue(new com.commercetools.history.models.common.GeoLocationImpl()) },
                new Object[] { SetGeoLocationChange.builder()
                        .nextValue(new com.commercetools.history.models.common.GeoLocationImpl()) } };
    }

    @Test
    public void change() {
        SetGeoLocationChange value = SetGeoLocationChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetGeoLocationChange value = SetGeoLocationChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.GeoLocationImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.GeoLocationImpl());
    }

    @Test
    public void nextValue() {
        SetGeoLocationChange value = SetGeoLocationChange.of();
        value.setNextValue(new com.commercetools.history.models.common.GeoLocationImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.GeoLocationImpl());
    }
}
