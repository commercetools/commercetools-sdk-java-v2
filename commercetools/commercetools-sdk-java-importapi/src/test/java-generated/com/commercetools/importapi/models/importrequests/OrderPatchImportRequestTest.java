
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPatchImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPatchImportRequestBuilder builder) {
        OrderPatchImportRequest orderPatchImportRequest = builder.buildUnchecked();
        Assertions.assertThat(orderPatchImportRequest).isInstanceOf(OrderPatchImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "patches",
                OrderPatchImportRequest.builder()
                        .patches(Collections.singletonList(
                            new com.commercetools.importapi.models.order_patches.OrderPatchImportImpl())) } };
    }

    @Test
    public void patches() {
        OrderPatchImportRequest value = OrderPatchImportRequest.of();
        value.setPatches(
            Collections.singletonList(new com.commercetools.importapi.models.order_patches.OrderPatchImportImpl()));
        Assertions.assertThat(value.getPatches())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.order_patches.OrderPatchImportImpl()));
    }
}
