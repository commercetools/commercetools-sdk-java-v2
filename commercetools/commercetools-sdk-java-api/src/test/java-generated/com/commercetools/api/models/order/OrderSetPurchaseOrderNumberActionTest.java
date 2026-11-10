
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetPurchaseOrderNumberActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetPurchaseOrderNumberActionBuilder builder) {
        OrderSetPurchaseOrderNumberAction orderSetPurchaseOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetPurchaseOrderNumberAction).isInstanceOf(OrderSetPurchaseOrderNumberAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "purchaseOrderNumber",
                OrderSetPurchaseOrderNumberAction.builder().purchaseOrderNumber("purchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        OrderSetPurchaseOrderNumberAction value = OrderSetPurchaseOrderNumberAction.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }
}
