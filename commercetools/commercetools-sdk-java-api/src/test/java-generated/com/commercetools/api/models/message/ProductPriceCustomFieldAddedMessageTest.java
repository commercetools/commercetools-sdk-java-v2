
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldAddedMessageBuilder builder) {
        ProductPriceCustomFieldAddedMessage productPriceCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldAddedMessage)
                .isInstanceOf(ProductPriceCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldAddedMessage.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldAddedMessage.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldAddedMessage.builder().staged(true) },
                new Object[] { "name", ProductPriceCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", ProductPriceCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldAddedMessage value = ProductPriceCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
