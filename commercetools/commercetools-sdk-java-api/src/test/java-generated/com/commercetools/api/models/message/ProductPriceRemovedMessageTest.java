
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceRemovedMessageBuilder builder) {
        ProductPriceRemovedMessage productPriceRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceRemovedMessage).isInstanceOf(ProductPriceRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceRemovedMessage.builder().variantId(5L) },
                new Object[] { "price",
                        ProductPriceRemovedMessage.builder()
                                .price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "staged", ProductPriceRemovedMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceRemovedMessage value = ProductPriceRemovedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void price() {
        ProductPriceRemovedMessage value = ProductPriceRemovedMessage.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceRemovedMessage value = ProductPriceRemovedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
