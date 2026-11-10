
package com.commercetools.api.models.standalone_price;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetValidFromActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetValidFromActionBuilder builder) {
        StandalonePriceSetValidFromAction standalonePriceSetValidFromAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidFromAction).isInstanceOf(StandalonePriceSetValidFromAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "validFrom",
                StandalonePriceSetValidFromAction.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void validFrom() {
        StandalonePriceSetValidFromAction value = StandalonePriceSetValidFromAction.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
