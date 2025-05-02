
package com.commercetools.api.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantTailoringTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantTailoringBuilder builder) {
        ProductVariantTailoring productVariantTailoring = builder.buildUnchecked();
        Assertions.assertThat(productVariantTailoring).isInstanceOf(ProductVariantTailoring.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductVariantTailoring.builder().id(2L) },
                new Object[] { "images", ProductVariantTailoring.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "assets", ProductVariantTailoring.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl())) },
                new Object[] { "attributes", ProductVariantTailoring.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl())) } };
    }

    @Test
    public void id() {
        ProductVariantTailoring value = ProductVariantTailoring.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void images() {
        ProductVariantTailoring value = ProductVariantTailoring.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantTailoring value = ProductVariantTailoring.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetImpl()));
    }

    @Test
    public void attributes() {
        ProductVariantTailoring value = ProductVariantTailoring.of();
        value.setAttributes(Collections
                .singletonList(new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_tailoring.ProductTailoringAttributeImpl()));
    }
}
