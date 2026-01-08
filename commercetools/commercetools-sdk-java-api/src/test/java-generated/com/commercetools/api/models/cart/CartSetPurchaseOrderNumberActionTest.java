
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetPurchaseOrderNumberActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetPurchaseOrderNumberActionBuilder builder) {
        CartSetPurchaseOrderNumberAction cartSetPurchaseOrderNumberAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetPurchaseOrderNumberAction).isInstanceOf(CartSetPurchaseOrderNumberAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "purchaseOrderNumber",
                CartSetPurchaseOrderNumberAction.builder().purchaseOrderNumber("purchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        CartSetPurchaseOrderNumberAction value = CartSetPurchaseOrderNumberAction.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }
}
