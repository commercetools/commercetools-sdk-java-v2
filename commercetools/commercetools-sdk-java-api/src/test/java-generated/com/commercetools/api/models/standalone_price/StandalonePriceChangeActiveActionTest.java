
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceChangeActiveActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceChangeActiveActionBuilder builder) {
        StandalonePriceChangeActiveAction standalonePriceChangeActiveAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceChangeActiveAction).isInstanceOf(StandalonePriceChangeActiveAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "active", StandalonePriceChangeActiveAction.builder().active(true) } };
    }

    @Test
    public void active() {
        StandalonePriceChangeActiveAction value = StandalonePriceChangeActiveAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
