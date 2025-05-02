
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetDiscountedPriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetDiscountedPriceActionBuilder builder) {
        StandalonePriceSetDiscountedPriceAction standalonePriceSetDiscountedPriceAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetDiscountedPriceAction)
                .isInstanceOf(StandalonePriceSetDiscountedPriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discounted", StandalonePriceSetDiscountedPriceAction.builder()
                .discounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl()) } };
    }

    @Test
    public void discounted() {
        StandalonePriceSetDiscountedPriceAction value = StandalonePriceSetDiscountedPriceAction.of();
        value.setDiscounted(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
        Assertions.assertThat(value.getDiscounted())
                .isEqualTo(new com.commercetools.api.models.common.DiscountedPriceDraftImpl());
    }
}
