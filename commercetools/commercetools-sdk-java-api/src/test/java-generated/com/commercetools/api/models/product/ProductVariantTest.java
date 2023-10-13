
package com.commercetools.api.models.product;

import java.util.Collections;

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
public class ProductVariantTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantBuilder builder) {
        ProductVariant productVariant = builder.buildUnchecked();
        Assertions.assertThat(productVariant).isInstanceOf(ProductVariant.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariant.builder().id(2L) },
                new Object[] { ProductVariant.builder().sku("sku") },
                new Object[] { ProductVariant.builder().key("key") },
                new Object[] { ProductVariant.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl())) },
                new Object[] {
                        ProductVariant.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { ProductVariant.builder().price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { ProductVariant.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { ProductVariant.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { ProductVariant.builder()
                        .availability(new com.commercetools.api.models.product.ProductVariantAvailabilityImpl()) },
                new Object[] { ProductVariant.builder().isMatchingVariant(true) },
                new Object[] { ProductVariant.builder()
                        .scopedPrice(new com.commercetools.api.models.common.ScopedPriceImpl()) },
                new Object[] { ProductVariant.builder().scopedPriceDiscounted(true) } };
    }

    @Test
    public void id() {
        ProductVariant value = ProductVariant.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductVariant value = ProductVariant.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        ProductVariant value = ProductVariant.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void prices() {
        ProductVariant value = ProductVariant.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
    }

    @Test
    public void attributes() {
        ProductVariant value = ProductVariant.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void price() {
        ProductVariant value = ProductVariant.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void images() {
        ProductVariant value = ProductVariant.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariant value = ProductVariant.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }

    @Test
    public void availability() {
        ProductVariant value = ProductVariant.of();
        value.setAvailability(new com.commercetools.api.models.product.ProductVariantAvailabilityImpl());
        Assertions.assertThat(value.getAvailability())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantAvailabilityImpl());
    }

    @Test
    public void isMatchingVariant() {
        ProductVariant value = ProductVariant.of();
        value.setIsMatchingVariant(true);
        Assertions.assertThat(value.getIsMatchingVariant()).isEqualTo(true);
    }

    @Test
    public void scopedPrice() {
        ProductVariant value = ProductVariant.of();
        value.setScopedPrice(new com.commercetools.api.models.common.ScopedPriceImpl());
        Assertions.assertThat(value.getScopedPrice())
                .isEqualTo(new com.commercetools.api.models.common.ScopedPriceImpl());
    }

    @Test
    public void scopedPriceDiscounted() {
        ProductVariant value = ProductVariant.of();
        value.setScopedPriceDiscounted(true);
        Assertions.assertThat(value.getScopedPriceDiscounted()).isEqualTo(true);
    }
}
