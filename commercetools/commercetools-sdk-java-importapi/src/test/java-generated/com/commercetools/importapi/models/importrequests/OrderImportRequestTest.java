
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderImportRequestBuilder builder) {
        OrderImportRequest orderImportRequest = builder.buildUnchecked();
        Assertions.assertThat(orderImportRequest).isInstanceOf(OrderImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources", OrderImportRequest.builder()
                .resources(
                    Collections.singletonList(new com.commercetools.importapi.models.orders.OrderImportImpl())) } };
    }

    @Test
    public void resources() {
        OrderImportRequest value = OrderImportRequest.of();
        value.setResources(Collections.singletonList(new com.commercetools.importapi.models.orders.OrderImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.OrderImportImpl()));
    }
}
