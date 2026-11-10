
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceDiscountsSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceDiscountsSetMessagePayloadBuilder builder) {
        ProductPriceDiscountsSetMessagePayload productPriceDiscountsSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceDiscountsSetMessagePayload)
                .isInstanceOf(ProductPriceDiscountsSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "updatedPrices",
                ProductPriceDiscountsSetMessagePayload.builder()
                        .updatedPrices(Collections.singletonList(
                            new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl())) } };
    }

    @Test
    public void updatedPrices() {
        ProductPriceDiscountsSetMessagePayload value = ProductPriceDiscountsSetMessagePayload.of();
        value.setUpdatedPrices(Collections
                .singletonList(new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
        Assertions.assertThat(value.getUpdatedPrices())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
    }
}
