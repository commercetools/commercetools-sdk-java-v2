
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomLineItemDiscountSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomLineItemDiscountSetMessageBuilder builder) {
        OrderCustomLineItemDiscountSetMessage orderCustomLineItemDiscountSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomLineItemDiscountSetMessage)
                .isInstanceOf(OrderCustomLineItemDiscountSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        OrderCustomLineItemDiscountSetMessage.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        OrderCustomLineItemDiscountSetMessage.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "discountedPricePerQuantity",
                        OrderCustomLineItemDiscountSetMessage.builder()
                                .discountedPricePerQuantity(Collections.singletonList(
                                    new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { "taxedPrice", OrderCustomLineItemDiscountSetMessage.builder()
                        .taxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl()) } };
    }

    @Test
    public void customLineItemId() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void discountedPricePerQuantity() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setDiscountedPricePerQuantity(
            Collections.singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void taxedPrice() {
        OrderCustomLineItemDiscountSetMessage value = OrderCustomLineItemDiscountSetMessage.of();
        value.setTaxedPrice(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.api.models.cart.TaxedItemPriceImpl());
    }
}
