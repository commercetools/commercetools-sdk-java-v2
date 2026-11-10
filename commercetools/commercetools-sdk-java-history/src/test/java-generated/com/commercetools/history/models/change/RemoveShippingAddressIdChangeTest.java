
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveShippingAddressIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveShippingAddressIdChangeBuilder builder) {
        RemoveShippingAddressIdChange removeShippingAddressIdChange = builder.buildUnchecked();
        Assertions.assertThat(removeShippingAddressIdChange).isInstanceOf(RemoveShippingAddressIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveShippingAddressIdChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveShippingAddressIdChange.builder()
                                .previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        RemoveShippingAddressIdChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { "address", RemoveShippingAddressIdChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void address() {
        RemoveShippingAddressIdChange value = RemoveShippingAddressIdChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
