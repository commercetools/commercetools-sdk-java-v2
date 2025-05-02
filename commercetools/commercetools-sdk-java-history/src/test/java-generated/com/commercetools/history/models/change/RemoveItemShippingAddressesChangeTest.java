
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveItemShippingAddressesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveItemShippingAddressesChangeBuilder builder) {
        RemoveItemShippingAddressesChange removeItemShippingAddressesChange = builder.buildUnchecked();
        Assertions.assertThat(removeItemShippingAddressesChange).isInstanceOf(RemoveItemShippingAddressesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveItemShippingAddressesChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveItemShippingAddressesChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "nextValue", RemoveItemShippingAddressesChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        RemoveItemShippingAddressesChange value = RemoveItemShippingAddressesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveItemShippingAddressesChange value = RemoveItemShippingAddressesChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void nextValue() {
        RemoveItemShippingAddressesChange value = RemoveItemShippingAddressesChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
