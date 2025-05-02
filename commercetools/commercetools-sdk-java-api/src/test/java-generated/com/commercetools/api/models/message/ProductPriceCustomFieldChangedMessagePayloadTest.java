
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldChangedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldChangedMessagePayload productPriceCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldChangedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldChangedMessagePayload.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldChangedMessagePayload.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldChangedMessagePayload.builder().staged(true) },
                new Object[] { "name", ProductPriceCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", ProductPriceCustomFieldChangedMessagePayload.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
