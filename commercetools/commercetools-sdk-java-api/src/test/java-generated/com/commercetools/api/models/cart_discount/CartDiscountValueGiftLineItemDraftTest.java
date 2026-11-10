
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountValueGiftLineItemDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountValueGiftLineItemDraftBuilder builder) {
        CartDiscountValueGiftLineItemDraft cartDiscountValueGiftLineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueGiftLineItemDraft)
                .isInstanceOf(CartDiscountValueGiftLineItemDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "product",
                        CartDiscountValueGiftLineItemDraft.builder()
                                .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { "variantId", CartDiscountValueGiftLineItemDraft.builder().variantId(5L) },
                new Object[] { "supplyChannel", CartDiscountValueGiftLineItemDraft.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "distributionChannel",
                        CartDiscountValueGiftLineItemDraft.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void product() {
        CartDiscountValueGiftLineItemDraft value = CartDiscountValueGiftLineItemDraft.of();
        value.setProduct(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductResourceIdentifierImpl());
    }

    @Test
    public void variantId() {
        CartDiscountValueGiftLineItemDraft value = CartDiscountValueGiftLineItemDraft.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void supplyChannel() {
        CartDiscountValueGiftLineItemDraft value = CartDiscountValueGiftLineItemDraft.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void distributionChannel() {
        CartDiscountValueGiftLineItemDraft value = CartDiscountValueGiftLineItemDraft.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
