
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldsRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldsRemovedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldsRemovedMessagePayload productPriceCustomFieldsRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsRemovedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldsRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldsRemovedMessagePayload.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldsRemovedMessagePayload.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldsRemovedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldsRemovedMessagePayload value = ProductPriceCustomFieldsRemovedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldsRemovedMessagePayload value = ProductPriceCustomFieldsRemovedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldsRemovedMessagePayload value = ProductPriceCustomFieldsRemovedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
