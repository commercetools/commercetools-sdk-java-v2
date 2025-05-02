
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceRemovedMessagePayloadBuilder builder) {
        ProductPriceRemovedMessagePayload productPriceRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceRemovedMessagePayload).isInstanceOf(ProductPriceRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceRemovedMessagePayload.builder().variantId(5L) },
                new Object[] { "price",
                        ProductPriceRemovedMessagePayload.builder()
                                .price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "staged", ProductPriceRemovedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceRemovedMessagePayload value = ProductPriceRemovedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void price() {
        ProductPriceRemovedMessagePayload value = ProductPriceRemovedMessagePayload.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceRemovedMessagePayload value = ProductPriceRemovedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
