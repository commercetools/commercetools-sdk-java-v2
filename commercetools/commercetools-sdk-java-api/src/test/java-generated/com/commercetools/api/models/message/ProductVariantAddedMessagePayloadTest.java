
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantAddedMessagePayloadBuilder builder) {
        ProductVariantAddedMessagePayload productVariantAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productVariantAddedMessagePayload).isInstanceOf(ProductVariantAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variant",
                        ProductVariantAddedMessagePayload.builder()
                                .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "staged", ProductVariantAddedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductVariantAddedMessagePayload value = ProductVariantAddedMessagePayload.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void staged() {
        ProductVariantAddedMessagePayload value = ProductVariantAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
