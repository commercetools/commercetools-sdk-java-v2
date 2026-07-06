
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
        return new Object[][] { new Object[] { "minimumQuantity",
                StandalonePriceRemovePriceTierAction.builder().minimumQuantity(1L) } };
    }

    @Test
    public void minimumQuantity() {
        StandalonePriceRemovePriceTierAction value = StandalonePriceRemovePriceTierAction.of();
        value.setMinimumQuantity(1L);
        Assertions.assertThat(value.getMinimumQuantity()).isEqualTo(1L);
    }
}
