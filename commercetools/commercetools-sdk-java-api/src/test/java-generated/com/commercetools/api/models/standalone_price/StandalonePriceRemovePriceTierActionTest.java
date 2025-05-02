
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceRemovePriceTierActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceRemovePriceTierActionBuilder builder) {
        StandalonePriceRemovePriceTierAction standalonePriceRemovePriceTierAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceRemovePriceTierAction)
                .isInstanceOf(StandalonePriceRemovePriceTierAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tierMinimumQuantity",
                StandalonePriceRemovePriceTierAction.builder().tierMinimumQuantity(3L) } };
    }

    @Test
    public void tierMinimumQuantity() {
        StandalonePriceRemovePriceTierAction value = StandalonePriceRemovePriceTierAction.of();
        value.setTierMinimumQuantity(3L);
        Assertions.assertThat(value.getTierMinimumQuantity()).isEqualTo(3L);
    }
}
