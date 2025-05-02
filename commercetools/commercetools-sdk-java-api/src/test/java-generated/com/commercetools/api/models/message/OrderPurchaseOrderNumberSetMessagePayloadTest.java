
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPurchaseOrderNumberSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPurchaseOrderNumberSetMessagePayloadBuilder builder) {
        OrderPurchaseOrderNumberSetMessagePayload orderPurchaseOrderNumberSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderPurchaseOrderNumberSetMessagePayload)
                .isInstanceOf(OrderPurchaseOrderNumberSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "purchaseOrderNumber",
                        OrderPurchaseOrderNumberSetMessagePayload.builder()
                                .purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "oldPurchaseOrderNumber", OrderPurchaseOrderNumberSetMessagePayload.builder()
                        .oldPurchaseOrderNumber("oldPurchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessagePayload value = OrderPurchaseOrderNumberSetMessagePayload.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void oldPurchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessagePayload value = OrderPurchaseOrderNumberSetMessagePayload.of();
        value.setOldPurchaseOrderNumber("oldPurchaseOrderNumber");
        Assertions.assertThat(value.getOldPurchaseOrderNumber()).isEqualTo("oldPurchaseOrderNumber");
    }
}
