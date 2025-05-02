
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPricesSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPricesSetMessagePayloadBuilder builder) {
        ProductPricesSetMessagePayload productPricesSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPricesSetMessagePayload).isInstanceOf(ProductPricesSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPricesSetMessagePayload.builder().variantId(5L) },
                new Object[] { "prices", ProductPricesSetMessagePayload.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl())) },
                new Object[] { "staged", ProductPricesSetMessagePayload.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPricesSetMessagePayload value = ProductPricesSetMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void prices() {
        ProductPricesSetMessagePayload value = ProductPricesSetMessagePayload.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceImpl()));
    }

    @Test
    public void staged() {
        ProductPricesSetMessagePayload value = ProductPricesSetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
