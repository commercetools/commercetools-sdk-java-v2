
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetParcelCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetParcelCustomTypeChangeBuilder builder) {
        SetParcelCustomTypeChange setParcelCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setParcelCustomTypeChange).isInstanceOf(SetParcelCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetParcelCustomTypeChange.builder().change("change") },
                new Object[] { "parcel",
                        SetParcelCustomTypeChange.builder()
                                .parcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl()) },
                new Object[] { "previousValue",
                        SetParcelCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetParcelCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetParcelCustomTypeChange value = SetParcelCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void parcel() {
        SetParcelCustomTypeChange value = SetParcelCustomTypeChange.of();
        value.setParcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
        Assertions.assertThat(value.getParcel())
                .isEqualTo(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
    }

    @Test
    public void previousValue() {
        SetParcelCustomTypeChange value = SetParcelCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetParcelCustomTypeChange value = SetParcelCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
