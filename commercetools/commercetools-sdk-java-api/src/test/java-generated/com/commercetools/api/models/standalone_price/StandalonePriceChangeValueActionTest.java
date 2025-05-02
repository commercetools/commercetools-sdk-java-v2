
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceChangeValueActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceChangeValueActionBuilder builder) {
        StandalonePriceChangeValueAction standalonePriceChangeValueAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceChangeValueAction).isInstanceOf(StandalonePriceChangeValueAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "value",
                        StandalonePriceChangeValueAction.builder()
                                .value(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "staged", StandalonePriceChangeValueAction.builder().staged(true) } };
    }

    @Test
    public void value() {
        StandalonePriceChangeValueAction value = StandalonePriceChangeValueAction.of();
        value.setValue(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getValue()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void staged() {
        StandalonePriceChangeValueAction value = StandalonePriceChangeValueAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
