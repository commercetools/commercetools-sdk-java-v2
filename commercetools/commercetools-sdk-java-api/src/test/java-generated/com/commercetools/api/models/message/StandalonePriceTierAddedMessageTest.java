
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceTierAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceTierAddedMessageBuilder builder) {
        StandalonePriceTierAddedMessage standalonePriceTierAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceTierAddedMessage).isInstanceOf(StandalonePriceTierAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tier", StandalonePriceTierAddedMessage.builder()
                .tier(new com.commercetools.api.models.common.PriceTierImpl()) } };
    }

    @Test
    public void tier() {
        StandalonePriceTierAddedMessage value = StandalonePriceTierAddedMessage.of();
        value.setTier(new com.commercetools.api.models.common.PriceTierImpl());
        Assertions.assertThat(value.getTier()).isEqualTo(new com.commercetools.api.models.common.PriceTierImpl());
    }
}
