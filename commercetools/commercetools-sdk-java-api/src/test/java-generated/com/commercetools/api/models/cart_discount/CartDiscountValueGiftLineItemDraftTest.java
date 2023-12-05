
package com.commercetools.api.models.cart_discount;

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
public class CartDiscountValueGiftLineItemDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountValueGiftLineItemDraftBuilder builder) {
        CartDiscountValueGiftLineItemDraft cartDiscountValueGiftLineItemDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueGiftLineItemDraft)
                .isInstanceOf(CartDiscountValueGiftLineItemDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountValueGiftLineItemDraft.builder()
                        .product(new com.commercetools.api.models.product.ProductResourceIdentifierImpl()) },
                new Object[] { CartDiscountValueGiftLineItemDraft.builder().variantId(5L) },
                new Object[] { CartDiscountValueGiftLineItemDraft.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { CartDiscountValueGiftLineItemDraft.builder()
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
