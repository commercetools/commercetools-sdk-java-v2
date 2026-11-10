
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderAddReturnInfoActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderAddReturnInfoActionBuilder builder) {
        StagedOrderAddReturnInfoAction stagedOrderAddReturnInfoAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddReturnInfoAction).isInstanceOf(StagedOrderAddReturnInfoAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "returnTrackingId",
                        StagedOrderAddReturnInfoAction.builder().returnTrackingId("returnTrackingId") },
                new Object[] { "items",
                        StagedOrderAddReturnInfoAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl())) },
                new Object[] { "returnDate", StagedOrderAddReturnInfoAction.builder()
                        .returnDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void returnTrackingId() {
        StagedOrderAddReturnInfoAction value = StagedOrderAddReturnInfoAction.of();
        value.setReturnTrackingId("returnTrackingId");
        Assertions.assertThat(value.getReturnTrackingId()).isEqualTo("returnTrackingId");
    }

    @Test
    public void items() {
        StagedOrderAddReturnInfoAction value = StagedOrderAddReturnInfoAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
    }

    @Test
    public void returnDate() {
        StagedOrderAddReturnInfoAction value = StagedOrderAddReturnInfoAction.of();
        value.setReturnDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getReturnDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
