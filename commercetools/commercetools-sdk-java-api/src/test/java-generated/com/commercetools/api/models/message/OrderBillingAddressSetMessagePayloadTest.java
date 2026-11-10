
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderBillingAddressSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderBillingAddressSetMessagePayloadBuilder builder) {
        OrderBillingAddressSetMessagePayload orderBillingAddressSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderBillingAddressSetMessagePayload)
                .isInstanceOf(OrderBillingAddressSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "address",
                        OrderBillingAddressSetMessagePayload.builder()
                                .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "oldAddress", OrderBillingAddressSetMessagePayload.builder()
                        .oldAddress(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        OrderBillingAddressSetMessagePayload value = OrderBillingAddressSetMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        OrderBillingAddressSetMessagePayload value = OrderBillingAddressSetMessagePayload.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
