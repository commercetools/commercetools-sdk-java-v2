
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductCreatedMessagePayloadBuilder builder) {
        ProductCreatedMessagePayload productCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productCreatedMessagePayload).isInstanceOf(ProductCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productProjection", ProductCreatedMessagePayload.builder()
                .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void productProjection() {
        ProductCreatedMessagePayload value = ProductCreatedMessagePayload.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
