
package com.commercetools.api.models.standalone_price;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetValidUntilActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetValidUntilActionBuilder builder) {
        StandalonePriceSetValidUntilAction standalonePriceSetValidUntilAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidUntilAction)
                .isInstanceOf(StandalonePriceSetValidUntilAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validUntil",
                StandalonePriceSetValidUntilAction.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validUntil() {
        StandalonePriceSetValidUntilAction value = StandalonePriceSetValidUntilAction.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
