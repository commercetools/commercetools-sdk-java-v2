
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDeletedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDeletedMessageBuilder builder) {
        ProductDeletedMessage productDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(productDeletedMessage).isInstanceOf(ProductDeletedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "removedImageUrls",
                        ProductDeletedMessage.builder()
                                .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { "currentProjection", ProductDeletedMessage.builder()
                        .currentProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void removedImageUrls() {
        ProductDeletedMessage value = ProductDeletedMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void currentProjection() {
        ProductDeletedMessage value = ProductDeletedMessage.of();
        value.setCurrentProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getCurrentProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
