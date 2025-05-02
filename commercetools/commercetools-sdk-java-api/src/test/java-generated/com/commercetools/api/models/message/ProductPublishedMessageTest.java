
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPublishedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPublishedMessageBuilder builder) {
        ProductPublishedMessage productPublishedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPublishedMessage).isInstanceOf(ProductPublishedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "removedImageUrls",
                        ProductPublishedMessage.builder()
                                .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { "productProjection",
                        ProductPublishedMessage.builder()
                                .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) },
                new Object[] { "scope", ProductPublishedMessage.builder()
                        .scope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All")) } };
    }

    @Test
    public void removedImageUrls() {
        ProductPublishedMessage value = ProductPublishedMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void productProjection() {
        ProductPublishedMessage value = ProductPublishedMessage.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }

    @Test
    public void scope() {
        ProductPublishedMessage value = ProductPublishedMessage.of();
        value.setScope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
    }
}
