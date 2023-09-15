
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
public class CartDiscountValueGiftLineItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountValueGiftLineItemBuilder builder) {
        CartDiscountValueGiftLineItem cartDiscountValueGiftLineItem = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueGiftLineItem).isInstanceOf(CartDiscountValueGiftLineItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountValueGiftLineItem.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) },
                new Object[] { CartDiscountValueGiftLineItem.builder().variantId(5L) },
                new Object[] { CartDiscountValueGiftLineItem.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelReferenceImpl()) },
                new Object[] { CartDiscountValueGiftLineItem.builder()
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
