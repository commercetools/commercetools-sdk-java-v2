
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceTiersSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceTiersSetMessageBuilder builder) {
        StandalonePriceTiersSetMessage standalonePriceTiersSetMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTiersSetMessage).isInstanceOf(StandalonePriceTiersSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "tiers",
                        StandalonePriceTiersSetMessage.builder()
                                .tiers(Collections
                                        .singletonList(new com.commercetools.api.models.common.PriceTierImpl())) },
                new Object[] { "previousTiers", StandalonePriceTiersSetMessage.builder()
                        .previousTiers(
                            Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl())) } };
    }

    @Test
    public void tiers() {
        StandalonePriceTiersSetMessage value = StandalonePriceTiersSetMessage.of();
        value.setTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }

    @Test
    public void previousTiers() {
        StandalonePriceTiersSetMessage value = StandalonePriceTiersSetMessage.of();
        value.setPreviousTiers(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getPreviousTiers())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceTierImpl()));
    }
}
