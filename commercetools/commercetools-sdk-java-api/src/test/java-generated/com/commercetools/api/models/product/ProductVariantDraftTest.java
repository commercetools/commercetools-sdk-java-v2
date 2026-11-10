
package com.commercetools.api.models.product;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantDraftBuilder builder) {
        ProductVariantDraft productVariantDraft = builder.buildUnchecked();
        Assertions.assertThat(productVariantDraft).isInstanceOf(ProductVariantDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", ProductVariantDraft.builder().sku("sku") },
                new Object[] { "key", ProductVariantDraft.builder().key("key") },
                new Object[] { "prices",
                        ProductVariantDraft.builder()
                                .prices(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] { "attributes",
                        ProductVariantDraft.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "images", ProductVariantDraft.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { "assets", ProductVariantDraft.builder()
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
