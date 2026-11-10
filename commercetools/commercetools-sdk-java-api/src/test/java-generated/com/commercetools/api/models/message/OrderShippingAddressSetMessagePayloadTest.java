
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderShippingAddressSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderShippingAddressSetMessagePayloadBuilder builder) {
        OrderShippingAddressSetMessagePayload orderShippingAddressSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderShippingAddressSetMessagePayload)
                .isInstanceOf(OrderShippingAddressSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "address",
                        OrderShippingAddressSetMessagePayload.builder()
                                .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "oldAddress", OrderShippingAddressSetMessagePayload.builder()
                        .oldAddress(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        OrderShippingAddressSetMessagePayload value = OrderShippingAddressSetMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        OrderShippingAddressSetMessagePayload value = OrderShippingAddressSetMessagePayload.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
