
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceChangedMessagePayloadBuilder builder) {
        ProductPriceChangedMessagePayload productPriceChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceChangedMessagePayload).isInstanceOf(ProductPriceChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "variantId", ProductPriceChangedMessagePayload.builder().variantId(5L) },
                new Object[] { "oldPrice",
                        ProductPriceChangedMessagePayload.builder()
                                .oldPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "newPrice",
                        ProductPriceChangedMessagePayload.builder()
                                .newPrice(new com.commercetools.api.models.common.PriceImpl()) },
                new Object[] { "staged", ProductPriceChangedMessagePayload.builder().staged(true) },
                new Object[] { "oldStagedPrice", ProductPriceChangedMessagePayload.builder()
                        .oldStagedPrice(new com.commercetools.api.models.common.PriceImpl()) } };
    }

    @Test
    public void variantId() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void oldPrice() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setOldPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void newPrice() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setNewPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getNewPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }

    @Test
    public void staged() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldStagedPrice() {
        ProductPriceChangedMessagePayload value = ProductPriceChangedMessagePayload.of();
        value.setOldStagedPrice(new com.commercetools.api.models.common.PriceImpl());
        Assertions.assertThat(value.getOldStagedPrice()).isEqualTo(new com.commercetools.api.models.common.PriceImpl());
    }
}
