
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemDiscountSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemDiscountSetMessagePayloadBuilder builder) {
        OrderCustomLineItemDiscountSetMessagePayload orderCustomLineItemDiscountSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(orderCustomLineItemDiscountSetMessagePayload)
                .isInstanceOf(OrderCustomLineItemDiscountSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderCustomLineItemDiscountSetMessagePayload.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderCustomLineItemDiscountSetMessagePayload.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "discountedPricePerQuantity",
                        OrderCustomLineItemDiscountSetMessagePayload.builder()
                                .discountedPricePerQuantity(Collections.singletonList(
                                    new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { "taxedPrice", OrderCustomLineItemDiscountSetMessagePayload.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void taxedPrice() {
        OrderCustomLineItemDiscountSetMessagePayload value = OrderCustomLineItemDiscountSetMessagePayload.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }
}
