
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartPurchaseOrderNumberSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartPurchaseOrderNumberSetMessageBuilder builder) {
        CartPurchaseOrderNumberSetMessage cartPurchaseOrderNumberSetMessage = builder.buildUnchecked();
        Assertions.assertThat(cartPurchaseOrderNumberSetMessage).isInstanceOf(CartPurchaseOrderNumberSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "purchaseOrderNumber",
                        CartPurchaseOrderNumberSetMessage.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "oldPurchaseOrderNumber", CartPurchaseOrderNumberSetMessage.builder()
                        .oldPurchaseOrderNumber("oldPurchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        CartPurchaseOrderNumberSetMessage value = CartPurchaseOrderNumberSetMessage.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void oldPurchaseOrderNumber() {
        CartPurchaseOrderNumberSetMessage value = CartPurchaseOrderNumberSetMessage.of();
        value.setOldPurchaseOrderNumber("oldPurchaseOrderNumber");
        Assertions.assertThat(value.getOldPurchaseOrderNumber()).isEqualTo("oldPurchaseOrderNumber");
    }
}
