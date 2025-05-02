
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceTierRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceTierRemovedMessageBuilder builder) {
        StandalonePriceTierRemovedMessage standalonePriceTierRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierRemovedMessage).isInstanceOf(StandalonePriceTierRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "removedTier", StandalonePriceTierRemovedMessage.builder()
                .removedTier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void removedTier() {
        StandalonePriceTierRemovedMessage value = StandalonePriceTierRemovedMessage.of();
        value.setRemovedTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getRemovedTier())
                .isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
