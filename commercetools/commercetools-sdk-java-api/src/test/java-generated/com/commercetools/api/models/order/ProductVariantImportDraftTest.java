
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantImportDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantImportDraftBuilder builder) {
        ProductVariantImportDraft productVariantImportDraft = builder.buildUnchecked();
        Assertions.assertThat(productVariantImportDraft).isInstanceOf(ProductVariantImportDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ProductVariantImportDraft.builder().id(2L) },
                new Object[] { "sku", ProductVariantImportDraft.builder().sku("sku") },
                new Object[] { "prices",
                        ProductVariantImportDraft.builder()
                                .prices(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] { "attributes",
                        ProductVariantImportDraft.builder()
                                .attributes(Collections
                                        .singletonList(new com.commercetools.api.models.product.AttributeImpl())) },
                new Object[] { "images", ProductVariantImportDraft.builder()
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
