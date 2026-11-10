
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantDeletedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantDeletedMessageBuilder builder) {
        ProductVariantDeletedMessage productVariantDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(productVariantDeletedMessage).isInstanceOf(ProductVariantDeletedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variant",
                        ProductVariantDeletedMessage.builder()
                                .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "removedImageUrls",
                        ProductVariantDeletedMessage.builder()
                                .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { "staged", ProductVariantDeletedMessage.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductVariantDeletedMessage value = ProductVariantDeletedMessage.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void removedImageUrls() {
        ProductVariantDeletedMessage value = ProductVariantDeletedMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void staged() {
        ProductVariantDeletedMessage value = ProductVariantDeletedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
