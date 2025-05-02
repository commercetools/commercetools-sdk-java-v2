
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceAddedMessageBuilder builder) {
        ProductPriceAddedMessage productPriceAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceAddedMessage).isInstanceOf(ProductPriceAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceAddedMessage.builder().variantId(5L) },
                new Object[] { "price",
                        ProductPriceAddedMessage.builder().price(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "staged", ProductPriceAddedMessage.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductPriceAddedMessage value = ProductPriceAddedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void price() {
        ProductPriceAddedMessage value = ProductPriceAddedMessage.of();
        value.setPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceAddedMessage value = ProductPriceAddedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
