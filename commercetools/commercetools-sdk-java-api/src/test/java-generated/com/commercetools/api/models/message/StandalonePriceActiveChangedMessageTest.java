
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceActiveChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceActiveChangedMessageBuilder builder) {
        StandalonePriceActiveChangedMessage standalonePriceActiveChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceActiveChangedMessage)
                .isInstanceOf(StandalonePriceActiveChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "active", StandalonePriceActiveChangedMessage.builder().active(true) },
                new Object[] { "oldActive", StandalonePriceActiveChangedMessage.builder().oldActive(true) } };
    }

    @Test
    public void active() {
        StandalonePriceActiveChangedMessage value = StandalonePriceActiveChangedMessage.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }

    @Test
    public void oldActive() {
        StandalonePriceActiveChangedMessage value = StandalonePriceActiveChangedMessage.of();
        value.setOldActive(true);
        Assertions.assertThat(value.getOldActive()).isEqualTo(true);
    }
}
