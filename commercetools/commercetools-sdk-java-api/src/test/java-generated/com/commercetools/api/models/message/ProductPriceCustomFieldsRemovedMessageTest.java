
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldsRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldsRemovedMessageBuilder builder) {
        ProductPriceCustomFieldsRemovedMessage productPriceCustomFieldsRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsRemovedMessage)
                .isInstanceOf(ProductPriceCustomFieldsRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldsRemovedMessage.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldsRemovedMessage.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldsRemovedMessage.builder().staged(true) } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldsRemovedMessage value = ProductPriceCustomFieldsRemovedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldsRemovedMessage value = ProductPriceCustomFieldsRemovedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldsRemovedMessage value = ProductPriceCustomFieldsRemovedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
