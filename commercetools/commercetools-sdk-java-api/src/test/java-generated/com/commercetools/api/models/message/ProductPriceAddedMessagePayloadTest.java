
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceAddedMessagePayloadBuilder builder) {
        ProductPriceAddedMessagePayload productPriceAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceAddedMessagePayload).isInstanceOf(ProductPriceAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceAddedMessagePayload.builder().variantId(5L) },
                new Object[] { "price",
                        ProductPriceAddedMessagePayload.builder()
                                .price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "staged", ProductPriceAddedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceAddedMessagePayload value = ProductPriceAddedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void price() {
        ProductPriceAddedMessagePayload value = ProductPriceAddedMessagePayload.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceAddedMessagePayload value = ProductPriceAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
