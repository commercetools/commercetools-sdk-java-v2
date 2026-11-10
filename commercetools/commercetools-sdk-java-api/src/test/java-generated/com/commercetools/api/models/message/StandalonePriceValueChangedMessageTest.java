
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceValueChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceValueChangedMessageBuilder builder) {
        StandalonePriceValueChangedMessage standalonePriceValueChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceValueChangedMessage)
                .isInstanceOf(StandalonePriceValueChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        StandalonePriceValueChangedMessage.builder()
                                .value(new com.commercetools.api.models.common.TypedMoneyImpl()) },
                new Object[] { "staged", StandalonePriceValueChangedMessage.builder().staged(true) },
                new Object[] { "oldValue", StandalonePriceValueChangedMessage.builder()
                        .oldValue(new com.commercetools.api.models.common.TypedMoneyImpl()) } };
    }

    @Test
    public void value() {
        StandalonePriceValueChangedMessage value = StandalonePriceValueChangedMessage.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }

    @Test
    public void staged() {
        StandalonePriceValueChangedMessage value = StandalonePriceValueChangedMessage.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void oldValue() {
        StandalonePriceValueChangedMessage value = StandalonePriceValueChangedMessage.of();
        value.setOldValue(new com.commercetools.api.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getOldValue()).isEqualTo(new com.commercetools.api.models.common.TypedMoneyImpl());
    }
}
