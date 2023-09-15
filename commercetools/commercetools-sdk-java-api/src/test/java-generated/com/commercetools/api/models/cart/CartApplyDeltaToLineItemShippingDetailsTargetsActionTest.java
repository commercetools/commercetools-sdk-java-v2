
package com.commercetools.api.models.cart;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CartApplyDeltaToLineItemShippingDetailsTargetsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder) {
        CartApplyDeltaToLineItemShippingDetailsTargetsAction cartApplyDeltaToLineItemShippingDetailsTargetsAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartApplyDeltaToLineItemShippingDetailsTargetsAction)
                .isInstanceOf(CartApplyDeltaToLineItemShippingDetailsTargetsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemId("lineItemId") },
                new Object[] {
                        CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { CartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
                        .targetsDelta(Collections
                                .singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl())) } };
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
