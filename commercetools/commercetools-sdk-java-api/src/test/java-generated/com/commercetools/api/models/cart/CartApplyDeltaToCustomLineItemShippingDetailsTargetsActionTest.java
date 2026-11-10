
package com.commercetools.api.models.cart;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder) {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction cartApplyDeltaToCustomLineItemShippingDetailsTargetsAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartApplyDeltaToCustomLineItemShippingDetailsTargetsAction)
                .isInstanceOf(CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
                                .customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
                                .customLineItemKey("customLineItemKey") },
                new Object[] { "targetsDelta",
                        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
                                .targetsDelta(Collections.singletonList(
                                    new com.commercetools.api.models.cart.ItemShippingTargetImpl())) } };
    }

    @Test
    public void customLineItemId() {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction value = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
                .of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction value = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
                .of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void targetsDelta() {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction value = CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
                .of();
        value.setTargetsDelta(
            Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
        Assertions.assertThat(value.getTargetsDelta())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
    }
}
