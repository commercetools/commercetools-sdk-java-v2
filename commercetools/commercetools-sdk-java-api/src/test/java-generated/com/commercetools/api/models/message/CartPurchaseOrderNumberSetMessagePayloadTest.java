
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartPurchaseOrderNumberSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartPurchaseOrderNumberSetMessagePayloadBuilder builder) {
        CartPurchaseOrderNumberSetMessagePayload cartPurchaseOrderNumberSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(cartPurchaseOrderNumberSetMessagePayload)
                .isInstanceOf(CartPurchaseOrderNumberSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "purchaseOrderNumber",
                        CartPurchaseOrderNumberSetMessagePayload.builder().purchaseOrderNumber("purchaseOrderNumber") },
                new Object[] { "oldPurchaseOrderNumber", CartPurchaseOrderNumberSetMessagePayload.builder()
                        .oldPurchaseOrderNumber("oldPurchaseOrderNumber") } };
    }

    @Test
    public void purchaseOrderNumber() {
        CartPurchaseOrderNumberSetMessagePayload value = CartPurchaseOrderNumberSetMessagePayload.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }

    @Test
    public void oldPurchaseOrderNumber() {
        CartPurchaseOrderNumberSetMessagePayload value = CartPurchaseOrderNumberSetMessagePayload.of();
        value.setOldPurchaseOrderNumber("oldPurchaseOrderNumber");
        Assertions.assertThat(value.getOldPurchaseOrderNumber()).isEqualTo("oldPurchaseOrderNumber");
    }
}
