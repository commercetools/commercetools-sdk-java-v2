
package com.commercetools.importapi.models.order_patches;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPatchImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPatchImportBuilder builder) {
        OrderPatchImport orderPatchImport = builder.buildUnchecked();
        Assertions.assertThat(orderPatchImport).isInstanceOf(OrderPatchImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "orderNumber", OrderPatchImport.builder().orderNumber("orderNumber") },
                new Object[] { "fields", OrderPatchImport.builder()
                        .fields(new com.commercetools.importapi.models.order_patches.OrderFieldImpl()) } };
    }

    @Test
    public void orderNumber() {
        OrderPatchImport value = OrderPatchImport.of();
        value.setOrderNumber("orderNumber");
        Assertions.assertThat(value.getOrderNumber()).isEqualTo("orderNumber");
    }

    @Test
    public void fields() {
        OrderPatchImport value = OrderPatchImport.of();
        value.setFields(new com.commercetools.importapi.models.order_patches.OrderFieldImpl());
        Assertions.assertThat(value.getFields())
                .isEqualTo(new com.commercetools.importapi.models.order_patches.OrderFieldImpl());
    }
}
