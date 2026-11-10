
package com.commercetools.importapi.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class HighPrecisionMoneyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, HighPrecisionMoneyBuilder builder) {
        HighPrecisionMoney highPrecisionMoney = builder.buildUnchecked();
        Assertions.assertThat(highPrecisionMoney).isInstanceOf(HighPrecisionMoney.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "preciseAmount", HighPrecisionMoney.builder().preciseAmount(3L) } };
    }

    @Test
    public void preciseAmount() {
        HighPrecisionMoney value = HighPrecisionMoney.of();
        value.setPreciseAmount(3L);
        Assertions.assertThat(value.getPreciseAmount()).isEqualTo(3L);
    }
}
