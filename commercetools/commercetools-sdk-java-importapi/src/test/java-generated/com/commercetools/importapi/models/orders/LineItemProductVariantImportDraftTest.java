
package com.commercetools.importapi.models.orders;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LineItemProductVariantImportDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LineItemProductVariantImportDraftBuilder builder) {
        LineItemProductVariantImportDraft lineItemProductVariantImportDraft = builder.buildUnchecked();
        Assertions.assertThat(lineItemProductVariantImportDraft).isInstanceOf(LineItemProductVariantImportDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "productVariant",
                        LineItemProductVariantImportDraft.builder()
                                .productVariant(
                                    new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl()) },
                new Object[] { "sku", LineItemProductVariantImportDraft.builder().sku("sku") },
                new Object[] { "prices",
                        LineItemProductVariantImportDraft.builder()
                                .prices(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.LineItemPriceImpl())) },
                new Object[] { "attributes",
                        LineItemProductVariantImportDraft.builder()
                                .attributes(Collections.singletonList(
                                    new com.commercetools.importapi.models.productvariants.AttributeImpl())) },
                new Object[] { "images", LineItemProductVariantImportDraft.builder()
                        .images(
                            Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl())) } };
    }

    @Test
    public void productVariant() {
        LineItemProductVariantImportDraft value = LineItemProductVariantImportDraft.of();
        value.setProductVariant(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
        Assertions.assertThat(value.getProductVariant())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
    }

    @Test
    public void sku() {
        LineItemProductVariantImportDraft value = LineItemProductVariantImportDraft.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void prices() {
        LineItemProductVariantImportDraft value = LineItemProductVariantImportDraft.of();
        value.setPrices(Collections.singletonList(new com.commercetools.importapi.models.orders.LineItemPriceImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.orders.LineItemPriceImpl()));
    }

    @Test
    public void attributes() {
        LineItemProductVariantImportDraft value = LineItemProductVariantImportDraft.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.productvariants.AttributeImpl()));
    }

    @Test
    public void images() {
        LineItemProductVariantImportDraft value = LineItemProductVariantImportDraft.of();
        value.setImages(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.common.ImageImpl()));
    }
}
