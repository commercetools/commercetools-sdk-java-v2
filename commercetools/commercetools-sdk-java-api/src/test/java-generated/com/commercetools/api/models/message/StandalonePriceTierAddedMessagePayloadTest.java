
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceTierAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceTierAddedMessagePayloadBuilder builder) {
        StandalonePriceTierAddedMessagePayload standalonePriceTierAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierAddedMessagePayload)
                .isInstanceOf(StandalonePriceTierAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tier", StandalonePriceTierAddedMessagePayload.builder()
                .tier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void tier() {
        StandalonePriceTierAddedMessagePayload value = StandalonePriceTierAddedMessagePayload.of();
        value.setTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getTier()).isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
