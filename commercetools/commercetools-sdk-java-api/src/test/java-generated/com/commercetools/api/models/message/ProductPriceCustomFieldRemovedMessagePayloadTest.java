
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldRemovedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldRemovedMessagePayload productPriceCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldRemovedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldRemovedMessagePayload.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldRemovedMessagePayload.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldRemovedMessagePayload.builder().staged(true) },
                new Object[] { "name", ProductPriceCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
