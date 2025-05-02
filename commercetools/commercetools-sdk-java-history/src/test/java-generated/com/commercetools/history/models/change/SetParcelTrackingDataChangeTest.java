
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetParcelTrackingDataChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetParcelTrackingDataChangeBuilder builder) {
        SetParcelTrackingDataChange setParcelTrackingDataChange = builder.buildUnchecked();
        Assertions.assertThat(setParcelTrackingDataChange).isInstanceOf(SetParcelTrackingDataChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetParcelTrackingDataChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetParcelTrackingDataChange.builder()
                                .previousValue(new com.commercetools.history.models.common.TrackingDataImpl()) },
                new Object[] { "nextValue",
                        SetParcelTrackingDataChange.builder()
                                .nextValue(new com.commercetools.history.models.common.TrackingDataImpl()) },
                new Object[] { "parcel", SetParcelTrackingDataChange.builder()
                        .parcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.TrackingDataImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.TrackingDataImpl());
    }

    @Test
    public void nextValue() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setNextValue(new com.commercetools.history.models.common.TrackingDataImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.TrackingDataImpl());
    }

    @Test
    public void parcel() {
        SetParcelTrackingDataChange value = SetParcelTrackingDataChange.of();
        value.setParcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
        Assertions.assertThat(value.getParcel())
                .isEqualTo(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
    }
}
