
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
public class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder) {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction cartApplyDeltaToCustomLineItemShippingDetailsTargetsAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartApplyDeltaToCustomLineItemShippingDetailsTargetsAction)
                .isInstanceOf(CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
                        .customLineItemId("customLineItemId") },
                new Object[] { CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
                        .customLineItemKey("customLineItemKey") },
                new Object[] { CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.builder()
                        .targetsDelta(Collections
                                .singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl())) } };
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
