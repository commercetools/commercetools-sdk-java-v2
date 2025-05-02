
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddShippingAddressIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddShippingAddressIdChangeBuilder builder) {
        AddShippingAddressIdChange addShippingAddressIdChange = builder.buildUnchecked();
        Assertions.assertThat(addShippingAddressIdChange).isInstanceOf(AddShippingAddressIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddShippingAddressIdChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddShippingAddressIdChange.builder()
                                .previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        AddShippingAddressIdChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { "address", AddShippingAddressIdChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void address() {
        AddShippingAddressIdChange value = AddShippingAddressIdChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
