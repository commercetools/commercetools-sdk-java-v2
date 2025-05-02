
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddBillingAddressIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddBillingAddressIdChangeBuilder builder) {
        AddBillingAddressIdChange addBillingAddressIdChange = builder.buildUnchecked();
        Assertions.assertThat(addBillingAddressIdChange).isInstanceOf(AddBillingAddressIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddBillingAddressIdChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddBillingAddressIdChange.builder().previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        AddBillingAddressIdChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { "address", AddBillingAddressIdChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        AddBillingAddressIdChange value = AddBillingAddressIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddBillingAddressIdChange value = AddBillingAddressIdChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        AddBillingAddressIdChange value = AddBillingAddressIdChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void address() {
        AddBillingAddressIdChange value = AddBillingAddressIdChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
