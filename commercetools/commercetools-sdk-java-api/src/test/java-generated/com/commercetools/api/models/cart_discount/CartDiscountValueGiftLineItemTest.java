
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueGiftLineItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueGiftLineItemBuilder builder) {
        CartDiscountValueGiftLineItem cartDiscountValueGiftLineItem = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueGiftLineItem).isInstanceOf(CartDiscountValueGiftLineItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        CartDiscountValueGiftLineItem.builder()
                                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { "variantId", CartDiscountValueGiftLineItem.builder().variantId(5L) },
                new Object[] { "supplyChannel",
                        CartDiscountValueGiftLineItem.builder()
                                .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { "distributionChannel", CartDiscountValueGiftLineItem.builder()
                        .distributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) } };
    }

    @Test
    public void product() {
        CartDiscountValueGiftLineItem value = CartDiscountValueGiftLineItem.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        CartDiscountValueGiftLineItem value = CartDiscountValueGiftLineItem.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void supplyChannel() {
        CartDiscountValueGiftLineItem value = CartDiscountValueGiftLineItem.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }

    @Test
    public void distributionChannel() {
        CartDiscountValueGiftLineItem value = CartDiscountValueGiftLineItem.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelReferenceImpl());
    }
}
