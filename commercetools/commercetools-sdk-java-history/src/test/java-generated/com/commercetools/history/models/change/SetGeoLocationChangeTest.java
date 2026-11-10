
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetGeoLocationChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetGeoLocationChangeBuilder builder) {
        SetGeoLocationChange setGeoLocationChange = builder.buildUnchecked();
        Assertions.assertThat(setGeoLocationChange).isInstanceOf(SetGeoLocationChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetGeoLocationChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetGeoLocationChange.builder()
                                .previousValue(new com.commercetools.history.models.common.GeoLocationImpl()) },
                new Object[] { "nextValue", SetGeoLocationChange.builder()
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
