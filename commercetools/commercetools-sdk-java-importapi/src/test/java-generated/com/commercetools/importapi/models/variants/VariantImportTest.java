
package com.commercetools.importapi.models.variants;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantImportBuilder builder) {
        VariantImport variantImport = builder.buildUnchecked();
        Assertions.assertThat(variantImport).isInstanceOf(VariantImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", VariantImport.builder().key("key") },
                new Object[] { "sku", VariantImport.builder().sku("sku") },
                new Object[] { "product",
                        VariantImport.builder()
                                .product(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl()) },
                new Object[] { "publish", VariantImport.builder().publish(true) },
                new Object[] { "images",
                        VariantImport.builder()
                                .images(Collections
                                        .singletonList(new com.commercetools.importapi.models.common.ImageImpl())) },
                new Object[] { "attributes",
                        VariantImport.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.importapi.models.productvariants.AttributeImpl())) },
                new Object[] { "assets", VariantImport.builder()
                        .assets(
                            Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl())) } };
    }

    @Test
    public void key() {
        VariantImport value = VariantImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void sku() {
        VariantImport value = VariantImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void product() {
        VariantImport value = VariantImport.of();
        value.setProduct(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductKeyReferenceImpl());
    }

    @Test
    public void publish() {
        VariantImport value = VariantImport.of();
        value.setPublish(true);
        Assertions.assertThat(value.getPublish()).isEqualTo(true);
    }

    @Test
    public void images() {
        VariantImport value = VariantImport.of();
        value.setImages(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
    }

    @Test
    public void attributes() {
        VariantImport value = VariantImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }

    @Test
    public void assets() {
        VariantImport value = VariantImport.of();
        value.setAssets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
    }
}
