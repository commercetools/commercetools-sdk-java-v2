
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetDeliveryItemsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetDeliveryItemsActionBuilder builder) {
        StagedOrderSetDeliveryItemsAction stagedOrderSetDeliveryItemsAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetDeliveryItemsAction).isInstanceOf(StagedOrderSetDeliveryItemsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", StagedOrderSetDeliveryItemsAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", StagedOrderSetDeliveryItemsAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "items", StagedOrderSetDeliveryItemsAction.builder()
                        .items(
                            Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderSetDeliveryItemsAction value = StagedOrderSetDeliveryItemsAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderSetDeliveryItemsAction value = StagedOrderSetDeliveryItemsAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void items() {
        StagedOrderSetDeliveryItemsAction value = StagedOrderSetDeliveryItemsAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }
}
