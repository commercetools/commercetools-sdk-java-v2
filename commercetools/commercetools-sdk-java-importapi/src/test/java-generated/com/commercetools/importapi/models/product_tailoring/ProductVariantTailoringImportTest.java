
package com.commercetools.importapi.models.product_tailoring;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantTailoringImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantTailoringImportBuilder builder) {
        ProductVariantTailoringImport productVariantTailoringImport = builder.buildUnchecked();
        Assertions.assertThat(productVariantTailoringImport).isInstanceOf(ProductVariantTailoringImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", ProductVariantTailoringImport.builder().sku("sku") },
                new Object[] { "images",
                        ProductVariantTailoringImport.builder()
                                .images(Collections
                                        .singletonList(new com.commercetools.importapi.models.common.ImageImpl())) },
                new Object[] { "assets",
                        ProductVariantTailoringImport.builder()
                                .assets(Collections
                                        .singletonList(new com.commercetools.importapi.models.common.AssetImpl())) },
                new Object[] { "attributes",
                        ProductVariantTailoringImport.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.importapi.models.productvariants.AttributeImpl())) } };
    }

    @Test
    public void sku() {
        ProductVariantTailoringImport value = ProductVariantTailoringImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        ProductVariantTailoringImport value = ProductVariantTailoringImport.of();
        value.setImages(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantTailoringImport value = ProductVariantTailoringImport.of();
        value.setAssets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
    }

    @Test
    public void attributes() {
        ProductVariantTailoringImport value = ProductVariantTailoringImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }
}
