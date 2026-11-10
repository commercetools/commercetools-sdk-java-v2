
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetParcelItemsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetParcelItemsActionBuilder builder) {
        OrderSetParcelItemsAction orderSetParcelItemsAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetParcelItemsAction).isInstanceOf(OrderSetParcelItemsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parcelId", OrderSetParcelItemsAction.builder().parcelId("parcelId") },
                new Object[] { "parcelKey", OrderSetParcelItemsAction.builder().parcelKey("parcelKey") },
                new Object[] { "items", OrderSetParcelItemsAction.builder()
                        .items(
                            Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) } };
    }

    @Test
    public void parcelId() {
        OrderSetParcelItemsAction value = OrderSetParcelItemsAction.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void parcelKey() {
        OrderSetParcelItemsAction value = OrderSetParcelItemsAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void items() {
        OrderSetParcelItemsAction value = OrderSetParcelItemsAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }
}
