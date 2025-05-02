
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingMethodChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingMethodChangeBuilder builder) {
        SetShippingMethodChange setShippingMethodChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingMethodChange).isInstanceOf(SetShippingMethodChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingMethodChange.builder().change("change") },
                new Object[] { "previousValue", SetShippingMethodChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl()) },
                new Object[] { "nextValue", SetShippingMethodChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl()) } };
    }

    @Test
    public void change() {
        SetShippingMethodChange value = SetShippingMethodChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingMethodChange value = SetShippingMethodChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
    }

    @Test
    public void nextValue() {
        SetShippingMethodChange value = SetShippingMethodChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.ShippingMethodChangeValueImpl());
    }
}
