
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDeliveryAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDeliveryAddressActionBuilder builder) {
        StagedOrderSetDeliveryAddressAction stagedOrderSetDeliveryAddressAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryAddressAction)
                .isInstanceOf(StagedOrderSetDeliveryAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", StagedOrderSetDeliveryAddressAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        StagedOrderSetDeliveryAddressAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "address", StagedOrderSetDeliveryAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryAddressAction value = StagedOrderSetDeliveryAddressAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryAddressAction value = StagedOrderSetDeliveryAddressAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void address() {
        StagedOrderSetDeliveryAddressAction value = StagedOrderSetDeliveryAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
