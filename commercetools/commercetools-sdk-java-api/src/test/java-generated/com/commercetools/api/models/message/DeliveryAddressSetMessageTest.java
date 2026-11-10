
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryAddressSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryAddressSetMessageBuilder builder) {
        DeliveryAddressSetMessage deliveryAddressSetMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddressSetMessage).isInstanceOf(DeliveryAddressSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", DeliveryAddressSetMessage.builder().deliveryId("deliveryId") },
                new Object[] { "address",
                        DeliveryAddressSetMessage.builder()
                                .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "oldAddress",
                        DeliveryAddressSetMessage.builder()
                                .oldAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "shippingKey", DeliveryAddressSetMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void address() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
