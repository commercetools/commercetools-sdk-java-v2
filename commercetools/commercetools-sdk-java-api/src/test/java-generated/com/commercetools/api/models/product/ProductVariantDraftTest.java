
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
public class ProductVariantDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantDraftBuilder builder) {
        ProductVariantDraft productVariantDraft = builder.buildUnchecked();
        Assertions.assertThat(productVariantDraft).isInstanceOf(ProductVariantDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantDraft.builder().sku("sku") },
                new Object[] { ProductVariantDraft.builder().key("key") },
                new Object[] { ProductVariantDraft.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] {
                        ProductVariantDraft.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { ProductVariantDraft.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { ProductVariantDraft.builder()
                        .assets(
                            Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl())) } };
    }

    @Test
    public void sku() {
        ProductVariantDraft value = ProductVariantDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        ProductVariantDraft value = ProductVariantDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void prices() {
        ProductVariantDraft value = ProductVariantDraft.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
    }

    @Test
    public void attributes() {
        ProductVariantDraft value = ProductVariantDraft.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void images() {
        ProductVariantDraft value = ProductVariantDraft.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantDraft value = ProductVariantDraft.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
    }
}
