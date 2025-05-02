
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceValueChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceValueChangedMessagePayloadBuilder builder) {
        StandalonePriceValueChangedMessagePayload standalonePriceValueChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceValueChangedMessagePayload)
                .isInstanceOf(StandalonePriceValueChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        StandalonePriceValueChangedMessagePayload.builder()
                                .value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "staged", StandalonePriceValueChangedMessagePayload.builder().staged(true) },
                new Object[] { "oldValue", StandalonePriceValueChangedMessagePayload.builder()
                        .oldValue(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void value() {
        StandalonePriceValueChangedMessagePayload value = StandalonePriceValueChangedMessagePayload.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void staged() {
        StandalonePriceValueChangedMessagePayload value = StandalonePriceValueChangedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldValue() {
        StandalonePriceValueChangedMessagePayload value = StandalonePriceValueChangedMessagePayload.of();
        value.setOldValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getOldValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
