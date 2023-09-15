
package com.commercetools.api.models.me;

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
public class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyCartApplyDeltaToLineItemShippingDetailsTargetsActionBuilder builder) {
        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction myCartApplyDeltaToLineItemShippingDetailsTargetsAction = builder
                .buildUnchecked();
        Assertions.assertThat(myCartApplyDeltaToLineItemShippingDetailsTargetsAction)
                .isInstanceOf(MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemId("lineItemId") },
                new Object[] {
                        MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.builder()
                        .targetsDelta(Collections
                                .singletonList(new com.commercetools.api.models.cart.ItemShippingTargetImpl())) } };
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
