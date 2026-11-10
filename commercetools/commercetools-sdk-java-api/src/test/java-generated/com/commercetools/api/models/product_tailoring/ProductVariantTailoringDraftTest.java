
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantTailoringDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantTailoringDraftBuilder builder) {
        ProductVariantTailoringDraft productVariantTailoringDraft = builder.buildUnchecked();
        Assertions.assertThat(productVariantTailoringDraft).isInstanceOf(ProductVariantTailoringDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductVariantTailoringDraft.builder().id(2L) },
                new Object[] { "sku", ProductVariantTailoringDraft.builder().sku("sku") },
                new Object[] { "images", ProductVariantTailoringDraft.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "assets", ProductVariantTailoringDraft.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { "attributes", ProductVariantTailoringDraft.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl())) } };
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

    @Test
    public void attributes() {
        ProductVariantTailoringDraft value = ProductVariantTailoringDraft.of();
        value.setAttributes(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
    }
}
