
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceTierRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceTierRemovedMessagePayloadBuilder builder) {
        StandalonePriceTierRemovedMessagePayload standalonePriceTierRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierRemovedMessagePayload)
                .isInstanceOf(StandalonePriceTierRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "removedTier", StandalonePriceTierRemovedMessagePayload.builder()
                .removedTier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void removedTier() {
        StandalonePriceTierRemovedMessagePayload value = StandalonePriceTierRemovedMessagePayload.of();
        value.setRemovedTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getRemovedTier())
                .isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
