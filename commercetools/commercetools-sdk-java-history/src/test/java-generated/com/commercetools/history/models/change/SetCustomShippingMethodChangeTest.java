
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomShippingMethodChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomShippingMethodChangeBuilder builder) {
        SetCustomShippingMethodChange setCustomShippingMethodChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomShippingMethodChange).isInstanceOf(SetCustomShippingMethodChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomShippingMethodChange.builder().change("change") },
                new Object[] { "previousValue", SetCustomShippingMethodChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl()) },
                new Object[] { "nextValue", SetCustomShippingMethodChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetCustomShippingMethodChange value = SetCustomShippingMethodChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomShippingMethodChange value = SetCustomShippingMethodChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
    }

    @Test
    public void nextValue() {
        SetCustomShippingMethodChange value = SetCustomShippingMethodChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.CustomShippingMethodChangeValueImpl());
    }
}
