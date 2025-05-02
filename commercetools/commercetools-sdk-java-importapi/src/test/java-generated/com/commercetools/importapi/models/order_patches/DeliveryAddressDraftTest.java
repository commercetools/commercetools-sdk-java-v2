
package com.commercetools.importapi.models.order_patches;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryAddressDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryAddressDraftBuilder builder) {
        DeliveryAddressDraft deliveryAddressDraft = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddressDraft).isInstanceOf(DeliveryAddressDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "deliveryId", DeliveryAddressDraft.builder().deliveryId("deliveryId") },
                new Object[] { "address", DeliveryAddressDraft.builder()
                        .address(new com.commercetools.importapi.models.common.AddressImpl()) } };
    }

    @Test
    public void deliveryId() {
        DeliveryAddressDraft value = DeliveryAddressDraft.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void address() {
        DeliveryAddressDraft value = DeliveryAddressDraft.of();
        value.setAddress(new com.commercetools.importapi.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress())
                .isEqualTo(new com.commercetools.importapi.models.common.AddressImpl());
    }
}
