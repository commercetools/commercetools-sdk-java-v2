
package com.commercetools.importapi.models.productdrafts;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantDraftImportTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantDraftImportBuilder builder) {
        ProductVariantDraftImport productVariantDraftImport = builder.buildUnchecked();
        Assertions.assertThat(productVariantDraftImport).isInstanceOf(ProductVariantDraftImport.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", ProductVariantDraftImport.builder().sku("sku") },
                new Object[] { "key", ProductVariantDraftImport.builder().key("key") },
                new Object[] { "prices",
                        ProductVariantDraftImport.builder()
                                .prices(Collections.singletonList(
                                    new com.commercetools.importapi.models.productdrafts.PriceDraftImportImpl())) },
                new Object[] { "attributes",
                        ProductVariantDraftImport.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.importapi.models.productvariants.AttributeImpl())) },
                new Object[] { "images",
                        ProductVariantDraftImport.builder()
                                .images(Collections
                                        .singletonList(new com.commercetools.importapi.models.common.ImageImpl())) },
                new Object[] { "assets", ProductVariantDraftImport.builder()
                        .assets(
                            Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl())) } };
    }

    @Test
    public void sku() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void prices() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setPrices(
            Collections.singletonList(new com.commercetools.importapi.models.productdrafts.PriceDraftImportImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.productdrafts.PriceDraftImportImpl()));
    }

    @Test
    public void attributes() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }

    @Test
    public void images() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setImages(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductVariantDraftImport value = ProductVariantDraftImport.of();
        value.setAssets(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.AssetImpl()));
    }
}
