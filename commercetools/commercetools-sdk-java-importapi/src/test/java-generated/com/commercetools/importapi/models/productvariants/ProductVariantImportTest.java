
package com.commercetools.importapi.models.productvariants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantImportBuilder builder) {
        ProductVariantImport productVariantImport = builder.buildUnchecked();
        Assertions.assertThat(productVariantImport).isInstanceOf(ProductVariantImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ProductVariantImport.builder().key("key") },
                new Object[] { "sku", ProductVariantImport.builder().sku("sku") },
                new Object[] { "isMasterVariant", ProductVariantImport.builder().isMasterVariant(true) },
                new Object[] { "attributes",
                        ProductVariantImport.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.importapi.models.productvariants.AttributeImpl())) },
                new Object[] { "images",
                        ProductVariantImport.builder()
                                .images(Collections
                                        .singletonList(new com.commercetools.importapi.models.common.ImageImpl())) },
                new Object[] { "assets",
                        ProductVariantImport.builder()
                                .assets(Collections
                                        .singletonList(new com.commercetools.importapi.models.common.AssetImpl())) },
                new Object[] { "staged", ProductVariantImport.builder().staged(true) },
                new Object[] { "product", ProductVariantImport.builder()
                        .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) } };
    }

    @Test
    public void key() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void isMasterVariant() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setIsMasterVariant(true);
        Assertions.assertThat(value.getIsMasterVariant()).isEqualTo(true);
    }

    @Test
    public void attributes() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }

    @Test
    public void images() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setImages(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setAssets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
    }

    @Test
    public void staged() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void product() {
        ProductVariantImport value = ProductVariantImport.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }
}
