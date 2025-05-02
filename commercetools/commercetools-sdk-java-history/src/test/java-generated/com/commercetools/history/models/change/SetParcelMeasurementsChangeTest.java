
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetParcelMeasurementsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetParcelMeasurementsChangeBuilder builder) {
        SetParcelMeasurementsChange setParcelMeasurementsChange = builder.buildUnchecked();
        Assertions.assertThat(setParcelMeasurementsChange).isInstanceOf(SetParcelMeasurementsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetParcelMeasurementsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetParcelMeasurementsChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl()) },
                new Object[] { "nextValue",
                        SetParcelMeasurementsChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl()) },
                new Object[] { "parcel", SetParcelMeasurementsChange.builder()
                        .parcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
    }

    @Test
    public void nextValue() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ParcelMeasurementsImpl());
    }

    @Test
    public void parcel() {
        SetParcelMeasurementsChange value = SetParcelMeasurementsChange.of();
        value.setParcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
        Assertions.assertThat(value.getParcel())
                .isEqualTo(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
    }
}
