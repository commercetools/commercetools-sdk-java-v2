
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantDeletedMessagePayloadBuilder builder) {
        ProductVariantDeletedMessagePayload productVariantDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productVariantDeletedMessagePayload)
                .isInstanceOf(ProductVariantDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variant",
                        ProductVariantDeletedMessagePayload.builder()
                                .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "removedImageUrls",
                        ProductVariantDeletedMessagePayload.builder()
                                .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { "staged", ProductVariantDeletedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductVariantDeletedMessagePayload value = ProductVariantDeletedMessagePayload.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void removedImageUrls() {
        ProductVariantDeletedMessagePayload value = ProductVariantDeletedMessagePayload.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void staged() {
        ProductVariantDeletedMessagePayload value = ProductVariantDeletedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
