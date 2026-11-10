
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartRemoveLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartRemoveLineItemActionBuilder builder) {
        MyCartRemoveLineItemAction myCartRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(myCartRemoveLineItemAction).isInstanceOf(MyCartRemoveLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", MyCartRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", MyCartRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", MyCartRemoveLineItemAction.builder().quantity(8L) },
                new Object[] { "externalPrice",
                        MyCartRemoveLineItemAction.builder()
                                .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTotalPrice", MyCartRemoveLineItemAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) },
                new Object[] { "shippingDetailsToRemove",
                        MyCartRemoveLineItemAction.builder()
                                .shippingDetailsToRemove(
                                    new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void externalPrice() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }

    @Test
    public void shippingDetailsToRemove() {
        MyCartRemoveLineItemAction value = MyCartRemoveLineItemAction.of();
        value.setShippingDetailsToRemove(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetailsToRemove())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
