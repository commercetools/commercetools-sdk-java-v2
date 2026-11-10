
package com.commercetools.api.models.common;

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
        return new Object[][] { new Object[] { "preciseAmount", HighPrecisionMoney.builder().preciseAmount(3L) },
                new Object[] { "fractionDigits", HighPrecisionMoney.builder().fractionDigits(4) } };
    }

    @Test
    public void preciseAmount() {
        HighPrecisionMoney value = HighPrecisionMoney.of();
        value.setPreciseAmount(3L);
        Assertions.assertThat(value.getPreciseAmount()).isEqualTo(3L);
    }

    @Test
    public void fractionDigits() {
        HighPrecisionMoney value = HighPrecisionMoney.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }
}
