
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderRemoveDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderRemoveDeliveryActionBuilder builder) {
        StagedOrderRemoveDeliveryAction stagedOrderRemoveDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderRemoveDeliveryAction).isInstanceOf(StagedOrderRemoveDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", StagedOrderRemoveDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", StagedOrderRemoveDeliveryAction.builder().deliveryKey("deliveryKey") } };
    }

    @Test
    public void deliveryId() {
        StagedOrderRemoveDeliveryAction value = StagedOrderRemoveDeliveryAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderRemoveDeliveryAction value = StagedOrderRemoveDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }
}
