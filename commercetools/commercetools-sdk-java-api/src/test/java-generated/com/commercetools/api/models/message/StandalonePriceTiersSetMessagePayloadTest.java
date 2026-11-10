
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceTiersSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceTiersSetMessagePayloadBuilder builder) {
        StandalonePriceTiersSetMessagePayload standalonePriceTiersSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTiersSetMessagePayload)
                .isInstanceOf(StandalonePriceTiersSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "tiers",
                        StandalonePriceTiersSetMessagePayload.builder()
                                .tiers(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceTierImpl())) },
                new Object[] { "previousTiers", StandalonePriceTiersSetMessagePayload.builder()
                        .previousTiers(
                            Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl())) } };
    }

    @Test
    public void tiers() {
        StandalonePriceTiersSetMessagePayload value = StandalonePriceTiersSetMessagePayload.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }

    @Test
    public void previousTiers() {
        StandalonePriceTiersSetMessagePayload value = StandalonePriceTiersSetMessagePayload.of();
        value.setPreviousTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getPreviousTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }
}
