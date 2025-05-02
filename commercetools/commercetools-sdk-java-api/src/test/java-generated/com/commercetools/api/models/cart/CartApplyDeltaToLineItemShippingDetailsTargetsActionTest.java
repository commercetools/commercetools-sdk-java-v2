
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartApplyDeltaToLineItemShippingDetailsTargetsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder) {
        CartApplyDeltaToLineItemShippingDetailsTargetsAction cartApplyDeltaToLineItemShippingDetailsTargetsAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartApplyDeltaToLineItemShippingDetailsTargetsAction)
                .isInstanceOf(CartApplyDeltaToLineItemShippingDetailsTargetsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "targetsDelta",
                        CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
                                .targetsDelta(Collections.singletonList(
                                    new com.commercetools.api.models.cart.ItemShippingTargetImpl())) } };
    }

    @Test
    public void lineItemId() {
        CartApplyDeltaToLineItemShippingDetailsTargetsAction value = CartApplyDeltaToLineItemShippingDetailsTargetsAction
                .of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartApplyDeltaToLineItemShippingDetailsTargetsAction value = CartApplyDeltaToLineItemShippingDetailsTargetsAction
                .of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void targetsDelta() {
        CartApplyDeltaToLineItemShippingDetailsTargetsAction value = CartApplyDeltaToLineItemShippingDetailsTargetsAction
                .of();
        value.setTargetsDelta(
            Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
        Assertions.assertThat(value.getTargetsDelta())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
    }
}
