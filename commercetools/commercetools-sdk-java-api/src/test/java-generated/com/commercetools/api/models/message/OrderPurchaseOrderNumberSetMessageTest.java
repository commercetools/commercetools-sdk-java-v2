
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderPurchaseOrderNumberSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderPurchaseOrderNumberSetMessageBuilder builder) {
        OrderPurchaseOrderNumberSetMessage orderPurchaseOrderNumberSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderPurchaseOrderNumberSetMessage)
                .isInstanceOf(OrderPurchaseOrderNumberSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "purchaseOrderNumber",
                        OrderPurchaseOrderNumberSetMessage.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "oldPurchaseOrderNumber", OrderPurchaseOrderNumberSetMessage.builder()
                        .oldPurchaseOrderNumber("oldPurchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessage value = OrderPurchaseOrderNumberSetMessage.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void oldPurchaseOrderNumber() {
        OrderPurchaseOrderNumberSetMessage value = OrderPurchaseOrderNumberSetMessage.of();
        value.setOldPurchaseOrderNumber("oldPurchaseOrderNumber");
        Assertions.assertThat(value.getOldPurchaseOrderNumber()).isEqualTo("oldPurchaseOrderNumber");
    }
}
