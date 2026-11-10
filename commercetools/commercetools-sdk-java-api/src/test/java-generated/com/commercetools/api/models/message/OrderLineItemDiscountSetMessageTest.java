
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLineItemDiscountSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLineItemDiscountSetMessageBuilder builder) {
        OrderLineItemDiscountSetMessage orderLineItemDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemDiscountSetMessage).isInstanceOf(OrderLineItemDiscountSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", OrderLineItemDiscountSetMessage.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", OrderLineItemDiscountSetMessage.builder().lineItemKey("lineItemKey") },
                new Object[] { "discountedPricePerQuantity",
                        OrderLineItemDiscountSetMessage.builder()
                                .discountedPricePerQuantity(Collections.singletonList(
                                    new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { "totalPrice",
                        OrderLineItemDiscountSetMessage.builder()
                                .totalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "taxedPrice",
                        OrderLineItemDiscountSetMessage.builder()
                                .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { "taxedPricePortions",
                        OrderLineItemDiscountSetMessage.builder()
                                .taxedPricePortions(Collections.singletonList(
                                    new com.commercetools.api.models.cart.MethodTaxedPriceImpl())) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void totalPrice() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void taxedPricePortions() {
        OrderLineItemDiscountSetMessage value = OrderLineItemDiscountSetMessage.of();
        value.setTaxedPricePortions(
            Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
        Assertions.assertThat(value.getTaxedPricePortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
    }
}
