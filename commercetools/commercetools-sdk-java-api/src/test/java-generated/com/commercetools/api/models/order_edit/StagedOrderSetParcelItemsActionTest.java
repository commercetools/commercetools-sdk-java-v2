
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderSetParcelItemsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderSetParcelItemsActionBuilder builder) {
        StagedOrderSetParcelItemsAction stagedOrderSetParcelItemsAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderSetParcelItemsAction).isInstanceOf(StagedOrderSetParcelItemsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "parcelId", StagedOrderSetParcelItemsAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", StagedOrderSetParcelItemsAction.builder().parcelKey("parcelKey") },
                new Object[] { "items", StagedOrderSetParcelItemsAction.builder()
                        .items(
                            Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) } };
    }

    @Test
    public void parcelId() {
        StagedOrderSetParcelItemsAction value = StagedOrderSetParcelItemsAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        StagedOrderSetParcelItemsAction value = StagedOrderSetParcelItemsAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void items() {
        StagedOrderSetParcelItemsAction value = StagedOrderSetParcelItemsAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }
}
