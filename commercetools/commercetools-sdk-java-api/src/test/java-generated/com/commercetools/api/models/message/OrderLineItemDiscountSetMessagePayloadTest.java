
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderLineItemDiscountSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderLineItemDiscountSetMessagePayloadBuilder builder) {
        OrderLineItemDiscountSetMessagePayload orderLineItemDiscountSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderLineItemDiscountSetMessagePayload)
                .isInstanceOf(OrderLineItemDiscountSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId",
                        OrderLineItemDiscountSetMessagePayload.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        OrderLineItemDiscountSetMessagePayload.builder().lineItemKey("lineItemKey") },
                new Object[] { "discountedPricePerQuantity",
                        OrderLineItemDiscountSetMessagePayload.builder()
                                .discountedPricePerQuantity(Collections.singletonList(
                                    new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { "totalPrice",
                        OrderLineItemDiscountSetMessagePayload.builder()
                                .totalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "taxedPrice",
                        OrderLineItemDiscountSetMessagePayload.builder()
                                .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) },
                new Object[] { "taxedPricePortions",
                        OrderLineItemDiscountSetMessagePayload.builder()
                                .taxedPricePortions(Collections.singletonList(
                                    new com.commercetools.api.models.cart.MethodTaxedPriceImpl())) } };
    }

    @Test
    public void lineItemId() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void totalPrice() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setTotalPrice(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }

    @Test
    public void taxedPricePortions() {
        OrderLineItemDiscountSetMessagePayload value = OrderLineItemDiscountSetMessagePayload.of();
        value.setTaxedPricePortions(
            Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
        Assertions.assertThat(value.getTaxedPricePortions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.cart.MethodTaxedPriceImpl()));
    }
}
