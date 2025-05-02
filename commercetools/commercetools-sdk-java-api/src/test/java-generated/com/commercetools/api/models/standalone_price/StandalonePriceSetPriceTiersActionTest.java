
package com.commercetools.api.models.standalone_price;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetPriceTiersActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetPriceTiersActionBuilder builder) {
        StandalonePriceSetPriceTiersAction standalonePriceSetPriceTiersAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetPriceTiersAction)
                .isInstanceOf(StandalonePriceSetPriceTiersAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tiers", StandalonePriceSetPriceTiersAction.builder()
                .tiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl())) } };
    }

    @Test
    public void tiers() {
        StandalonePriceSetPriceTiersAction value = StandalonePriceSetPriceTiersAction.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierDraftImpl()));
    }
}
