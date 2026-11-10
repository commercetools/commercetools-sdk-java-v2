
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldAddedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldAddedMessagePayload productPriceCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldAddedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldAddedMessagePayload.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldAddedMessagePayload.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldAddedMessagePayload.builder().staged(true) },
                new Object[] { "name", ProductPriceCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", ProductPriceCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
