
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveBillingAddressIdChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveBillingAddressIdChangeBuilder builder) {
        RemoveBillingAddressIdChange removeBillingAddressIdChange = builder.buildUnchecked();
        Assertions.assertThat(removeBillingAddressIdChange).isInstanceOf(RemoveBillingAddressIdChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveBillingAddressIdChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemoveBillingAddressIdChange.builder()
                                .previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        RemoveBillingAddressIdChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { "address", RemoveBillingAddressIdChange.builder()
                        .address(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void address() {
        RemoveBillingAddressIdChange value = RemoveBillingAddressIdChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
