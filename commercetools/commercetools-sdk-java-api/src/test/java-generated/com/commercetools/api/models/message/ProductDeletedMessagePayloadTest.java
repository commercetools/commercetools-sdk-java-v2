
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductDeletedMessagePayloadBuilder builder) {
        ProductDeletedMessagePayload productDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productDeletedMessagePayload).isInstanceOf(ProductDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "removedImageUrls",
                        ProductDeletedMessagePayload.builder()
                                .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { "currentProjection", ProductDeletedMessagePayload.builder()
                        .currentProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void removedImageUrls() {
        ProductDeletedMessagePayload value = ProductDeletedMessagePayload.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void currentProjection() {
        ProductDeletedMessagePayload value = ProductDeletedMessagePayload.of();
        value.setCurrentProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getCurrentProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
