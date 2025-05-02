
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceAddPriceTierActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceAddPriceTierActionBuilder builder) {
        StandalonePriceAddPriceTierAction standalonePriceAddPriceTierAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceAddPriceTierAction).isInstanceOf(StandalonePriceAddPriceTierAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tier", StandalonePriceAddPriceTierAction.builder()
                .tier(new com.commercetools.api.models.common.PriceTierDraftImpl()) } };
    }

    @Test
    public void tier() {
        StandalonePriceAddPriceTierAction value = StandalonePriceAddPriceTierAction.of();
        value.setTier(new com.commercetools.api.models.common.PriceTierDraftImpl());
        Assertions.assertThat(value.getTier()).isEqualTo(new com.commercetools.api.models.common.PriceTierDraftImpl());
    }
}
