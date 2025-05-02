
package com.commercetools.api.models.me;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder) {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction myCartApplyDeltaToLineItemShippingDetailsTargetsAction = builder
                .buildUnchecked();
        Assertions.assertThat(myCartApplyDeltaToLineItemShippingDetailsTargetsAction)
                .isInstanceOf(MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "targetsDelta",
                        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
                                .targetsDelta(Collections.singletonList(
                                    new com.commercetools.api.models.cart.ItemShippingTargetImpl())) } };
    }

    @Test
    public void lineItemId() {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction value = MyCartApplyDeltaToLineItemShippingDetailsTargetsAction
                .of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction value = MyCartApplyDeltaToLineItemShippingDetailsTargetsAction
                .of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void targetsDelta() {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction value = MyCartApplyDeltaToLineItemShippingDetailsTargetsAction
                .of();
        value.setTargetsDelta(
            Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
        Assertions.assertThat(value.getTargetsDelta())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl()));
    }
}
