
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPublishedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPublishedMessagePayloadBuilder builder) {
        ProductPublishedMessagePayload productPublishedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPublishedMessagePayload).isInstanceOf(ProductPublishedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "removedImageUrls",
                        ProductPublishedMessagePayload.builder()
                                .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { "productProjection",
                        ProductPublishedMessagePayload.builder()
                                .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) },
                new Object[] { "scope", ProductPublishedMessagePayload.builder()
                        .scope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All")) } };
    }

    @Test
    public void removedImageUrls() {
        ProductPublishedMessagePayload value = ProductPublishedMessagePayload.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void productProjection() {
        ProductPublishedMessagePayload value = ProductPublishedMessagePayload.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }

    @Test
    public void scope() {
        ProductPublishedMessagePayload value = ProductPublishedMessagePayload.of();
        value.setScope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
    }
}
