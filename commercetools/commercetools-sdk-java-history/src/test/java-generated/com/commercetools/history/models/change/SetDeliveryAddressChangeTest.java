
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDeliveryAddressChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDeliveryAddressChangeBuilder builder) {
        SetDeliveryAddressChange setDeliveryAddressChange = builder.buildUnchecked();
        Assertions.assertThat(setDeliveryAddressChange).isInstanceOf(SetDeliveryAddressChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDeliveryAddressChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetDeliveryAddressChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "nextValue",
                        SetDeliveryAddressChange.builder()
                                .nextValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "deliveryId", SetDeliveryAddressChange.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void change() {
        SetDeliveryAddressChange value = SetDeliveryAddressChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDeliveryAddressChange value = SetDeliveryAddressChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void nextValue() {
        SetDeliveryAddressChange value = SetDeliveryAddressChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void deliveryId() {
        SetDeliveryAddressChange value = SetDeliveryAddressChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
