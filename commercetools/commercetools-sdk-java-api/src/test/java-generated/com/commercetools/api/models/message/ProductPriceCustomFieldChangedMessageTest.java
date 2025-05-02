
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldChangedMessageBuilder builder) {
        ProductPriceCustomFieldChangedMessage productPriceCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldChangedMessage)
                .isInstanceOf(ProductPriceCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldChangedMessage.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldChangedMessage.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldChangedMessage.builder().staged(true) },
                new Object[] { "name", ProductPriceCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", ProductPriceCustomFieldChangedMessage.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldChangedMessage value = ProductPriceCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
