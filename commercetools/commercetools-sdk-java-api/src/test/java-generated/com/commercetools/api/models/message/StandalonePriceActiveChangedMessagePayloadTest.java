
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceActiveChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceActiveChangedMessagePayloadBuilder builder) {
        StandalonePriceActiveChangedMessagePayload standalonePriceActiveChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(standalonePriceActiveChangedMessagePayload)
                .isInstanceOf(StandalonePriceActiveChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "active", StandalonePriceActiveChangedMessagePayload.builder().active(true) },
                new Object[] { "oldActive", StandalonePriceActiveChangedMessagePayload.builder().oldActive(true) } };
    }

    @Test
    public void active() {
        StandalonePriceActiveChangedMessagePayload value = StandalonePriceActiveChangedMessagePayload.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }

    @Test
    public void oldActive() {
        StandalonePriceActiveChangedMessagePayload value = StandalonePriceActiveChangedMessagePayload.of();
        value.setOldActive(true);
        Assertions.assertThat(value.getOldActive()).isEqualTo(true);
    }
}
