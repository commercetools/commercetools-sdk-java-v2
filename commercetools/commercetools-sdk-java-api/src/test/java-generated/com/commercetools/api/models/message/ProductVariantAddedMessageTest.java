
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductVariantAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductVariantAddedMessageBuilder builder) {
        ProductVariantAddedMessage productVariantAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productVariantAddedMessage).isInstanceOf(ProductVariantAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "variant",
                        ProductVariantAddedMessage.builder()
                                .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { "staged", ProductVariantAddedMessage.builder().staged(true) } };
    }

    @Test
    public void variant() {
        ProductVariantAddedMessage value = ProductVariantAddedMessage.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void staged() {
        ProductVariantAddedMessage value = ProductVariantAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
