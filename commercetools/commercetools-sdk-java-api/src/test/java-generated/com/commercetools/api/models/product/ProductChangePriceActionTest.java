
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductChangePriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductChangePriceActionBuilder builder) {
        ProductChangePriceAction productChangePriceAction = builder.buildUnchecked();
        Assertions.assertThat(productChangePriceAction).isInstanceOf(ProductChangePriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priceId", ProductChangePriceAction.builder().priceId("priceId") },
                new Object[] { "price",
                        ProductChangePriceAction.builder()
                                .price(new com.commercetools.api.models.common.PriceDraftImpl()) },
                new Object[] { "staged", ProductChangePriceAction.builder().staged(true) } };
    }

    @Test
    public void priceId() {
        ProductChangePriceAction value = ProductChangePriceAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void price() {
        ProductChangePriceAction value = ProductChangePriceAction.of();
        value.setPrice(new com.commercetools.api.models.common.PriceDraftImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.api.models.common.PriceDraftImpl());
    }

    @Test
    public void staged() {
        ProductChangePriceAction value = ProductChangePriceAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
