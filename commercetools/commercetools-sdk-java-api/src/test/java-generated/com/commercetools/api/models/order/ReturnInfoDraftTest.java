
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnInfoDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnInfoDraftBuilder builder) {
        ReturnInfoDraft returnInfoDraft = builder.buildUnchecked();
        Assertions.assertThat(returnInfoDraft).isInstanceOf(ReturnInfoDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "items",
                        ReturnInfoDraft.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl())) },
                new Object[] { "returnTrackingId", ReturnInfoDraft.builder().returnTrackingId("returnTrackingId") },
                new Object[] { "returnDate",
                        ReturnInfoDraft.builder().returnDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void items() {
        ReturnInfoDraft value = ReturnInfoDraft.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
    }

    @Test
    public void returnTrackingId() {
        ReturnInfoDraft value = ReturnInfoDraft.of();
        value.setReturnTrackingId("returnTrackingId");
        Assertions.assertThat(value.getReturnTrackingId()).isEqualTo("returnTrackingId");
    }

    @Test
    public void returnDate() {
        ReturnInfoDraft value = ReturnInfoDraft.of();
        value.setReturnDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getReturnDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
