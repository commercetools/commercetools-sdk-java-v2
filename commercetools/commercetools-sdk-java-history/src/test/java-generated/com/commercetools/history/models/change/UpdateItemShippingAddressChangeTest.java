
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UpdateItemShippingAddressChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UpdateItemShippingAddressChangeBuilder builder) {
        UpdateItemShippingAddressChange updateItemShippingAddressChange = builder.buildUnchecked();
        Assertions.assertThat(updateItemShippingAddressChange).isInstanceOf(UpdateItemShippingAddressChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", UpdateItemShippingAddressChange.builder().change("change") },
                new Object[] { "previousValue",
                        UpdateItemShippingAddressChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "nextValue", UpdateItemShippingAddressChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        UpdateItemShippingAddressChange value = UpdateItemShippingAddressChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        UpdateItemShippingAddressChange value = UpdateItemShippingAddressChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void nextValue() {
        UpdateItemShippingAddressChange value = UpdateItemShippingAddressChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
