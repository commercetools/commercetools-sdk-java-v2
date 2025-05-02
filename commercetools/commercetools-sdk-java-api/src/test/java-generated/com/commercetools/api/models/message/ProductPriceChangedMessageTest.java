
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceChangedMessageBuilder builder) {
        ProductPriceChangedMessage productPriceChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceChangedMessage).isInstanceOf(ProductPriceChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceChangedMessage.builder().variantId(5L) },
                new Object[] { "oldPrice",
                        ProductPriceChangedMessage.builder()
                                .oldPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "newPrice",
                        ProductPriceChangedMessage.builder()
                                .newPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "staged", ProductPriceChangedMessage.builder().staged(true) },
                new Object[] { "oldStagedPrice", ProductPriceChangedMessage.builder()
                        .oldStagedPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void variantId() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void oldPrice() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setOldPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void newPrice() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setNewPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getNewPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldStagedPrice() {
        ProductPriceChangedMessage value = ProductPriceChangedMessage.of();
        value.setOldStagedPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldStagedPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
