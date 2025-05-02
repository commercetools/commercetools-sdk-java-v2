
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryAddressSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryAddressSetMessagePayloadBuilder builder) {
        DeliveryAddressSetMessagePayload deliveryAddressSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddressSetMessagePayload).isInstanceOf(DeliveryAddressSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", DeliveryAddressSetMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { "address",
                        DeliveryAddressSetMessagePayload.builder()
                                .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "oldAddress",
                        DeliveryAddressSetMessagePayload.builder()
                                .oldAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "shippingKey", DeliveryAddressSetMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void address() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
