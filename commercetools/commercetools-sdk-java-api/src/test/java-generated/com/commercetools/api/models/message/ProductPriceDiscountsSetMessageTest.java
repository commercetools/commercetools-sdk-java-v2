
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceDiscountsSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceDiscountsSetMessageBuilder builder) {
        ProductPriceDiscountsSetMessage productPriceDiscountsSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceDiscountsSetMessage).isInstanceOf(ProductPriceDiscountsSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "updatedPrices",
                ProductPriceDiscountsSetMessage.builder()
                        .updatedPrices(Collections.singletonList(
                            new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl())) } };
    }

    @Test
    public void updatedPrices() {
        ProductPriceDiscountsSetMessage value = ProductPriceDiscountsSetMessage.of();
        value.setUpdatedPrices(Collections
                .singletonList(new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
        Assertions.assertThat(value.getUpdatedPrices())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl()));
    }
}
