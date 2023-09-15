
package com.commercetools.api.models.order;

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
public class ProductVariantImportDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantImportDraftBuilder builder) {
        ProductVariantImportDraft productVariantImportDraft = builder.buildUnchecked();
        Assertions.assertThat(productVariantImportDraft).isInstanceOf(ProductVariantImportDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantImportDraft.builder().id(2L) },
                new Object[] { ProductVariantImportDraft.builder().sku("sku") },
                new Object[] { ProductVariantImportDraft.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] {
                        ProductVariantImportDraft.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { ProductVariantImportDraft.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) } };
    }

    @Test
    public void id() {
        ProductVariantImportDraft value = ProductVariantImportDraft.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductVariantImportDraft value = ProductVariantImportDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void prices() {
        ProductVariantImportDraft value = ProductVariantImportDraft.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
    }

    @Test
    public void attributes() {
        ProductVariantImportDraft value = ProductVariantImportDraft.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }

    @Test
    public void images() {
        ProductVariantImportDraft value = ProductVariantImportDraft.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }
}
