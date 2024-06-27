
package com.commercetools.api.models.product_tailoring;

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
public class ProductVariantTailoringDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantTailoringDraftBuilder builder) {
        ProductVariantTailoringDraft productVariantTailoringDraft = builder.buildUnchecked();
        Assertions.assertThat(productVariantTailoringDraft).isInstanceOf(ProductVariantTailoringDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantTailoringDraft.builder().id(2L) },
                new Object[] { ProductVariantTailoringDraft.builder().sku("sku") },
                new Object[] { ProductVariantTailoringDraft.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { ProductVariantTailoringDraft.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) } };
    }

    @Test
    public void id() {
        ProductVariantTailoringDraft value = ProductVariantTailoringDraft.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductVariantTailoringDraft value = ProductVariantTailoringDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        ProductVariantTailoringDraft value = ProductVariantTailoringDraft.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantTailoringDraft value = ProductVariantTailoringDraft.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }
}
