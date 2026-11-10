
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderAddReturnInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderAddReturnInfoActionBuilder builder) {
        OrderAddReturnInfoAction orderAddReturnInfoAction = builder.buildUnchecked();
        Assertions.assertThat(orderAddReturnInfoAction).isInstanceOf(OrderAddReturnInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnTrackingId",
                        OrderAddReturnInfoAction.builder().returnTrackingId("returnTrackingId") },
                new Object[] { "items",
                        OrderAddReturnInfoAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl())) },
                new Object[] { "returnDate",
                        OrderAddReturnInfoAction.builder().returnDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void returnTrackingId() {
        OrderAddReturnInfoAction value = OrderAddReturnInfoAction.of();
        value.setReturnTrackingId("returnTrackingId");
        Assertions.assertThat(value.getReturnTrackingId()).isEqualTo("returnTrackingId");
    }

    @Test
    public void items() {
        OrderAddReturnInfoAction value = OrderAddReturnInfoAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
    }

    @Test
    public void returnDate() {
        OrderAddReturnInfoAction value = OrderAddReturnInfoAction.of();
        value.setReturnDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getReturnDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
