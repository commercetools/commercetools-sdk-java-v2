
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetLineItemShippingDetailsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetLineItemShippingDetailsActionBuilder builder) {
        MyCartSetLineItemShippingDetailsAction myCartSetLineItemShippingDetailsAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetLineItemShippingDetailsAction)
                .isInstanceOf(MyCartSetLineItemShippingDetailsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        MyCartSetLineItemShippingDetailsAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        MyCartSetLineItemShippingDetailsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "shippingDetails", MyCartSetLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartSetLineItemShippingDetailsAction value = MyCartSetLineItemShippingDetailsAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartSetLineItemShippingDetailsAction value = MyCartSetLineItemShippingDetailsAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void shippingDetails() {
        MyCartSetLineItemShippingDetailsAction value = MyCartSetLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
