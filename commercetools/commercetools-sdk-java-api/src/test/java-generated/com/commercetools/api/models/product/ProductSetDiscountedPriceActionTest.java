
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductSetDiscountedPriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductSetDiscountedPriceActionBuilder builder) {
        ProductSetDiscountedPriceAction productSetDiscountedPriceAction = builder.buildUnchecked();
        Assertions.assertThat(productSetDiscountedPriceAction).isInstanceOf(ProductSetDiscountedPriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductSetDiscountedPriceAction.builder().priceId("priceId") },
                new Object[] { "staged", ProductSetDiscountedPriceAction.builder().staged(true) },
                new Object[] { "discounted", ProductSetDiscountedPriceAction.builder()
                        .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) } };
    }

    @Test
    public void priceId() {
        ProductSetDiscountedPriceAction value = ProductSetDiscountedPriceAction.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void staged() {
        ProductSetDiscountedPriceAction value = ProductSetDiscountedPriceAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void discounted() {
        ProductSetDiscountedPriceAction value = ProductSetDiscountedPriceAction.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
    }
}
