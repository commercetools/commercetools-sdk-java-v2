
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldRemovedMessageBuilder builder) {
        ProductPriceCustomFieldRemovedMessage productPriceCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldRemovedMessage)
                .isInstanceOf(ProductPriceCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldRemovedMessage.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldRemovedMessage.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldRemovedMessage.builder().staged(true) },
                new Object[] { "name", ProductPriceCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldRemovedMessage value = ProductPriceCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
