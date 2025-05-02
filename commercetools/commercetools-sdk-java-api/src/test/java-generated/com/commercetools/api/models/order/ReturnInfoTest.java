
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnInfoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnInfoBuilder builder) {
        ReturnInfo returnInfo = builder.buildUnchecked();
        Assertions.assertThat(returnInfo).isInstanceOf(ReturnInfo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "items",
                        ReturnInfo.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.ReturnItemImpl())) },
                new Object[] { "returnTrackingId", ReturnInfo.builder().returnTrackingId("returnTrackingId") },
                new Object[] { "returnDate",
                        ReturnInfo.builder().returnDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void items() {
        ReturnInfo value = ReturnInfo.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemImpl()));
    }

    @Test
    public void returnTrackingId() {
        ReturnInfo value = ReturnInfo.of();
        value.setReturnTrackingId("returnTrackingId");
        Assertions.assertThat(value.getReturnTrackingId()).isEqualTo("returnTrackingId");
    }

    @Test
    public void returnDate() {
        ReturnInfo value = ReturnInfo.of();
        value.setReturnDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getReturnDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
