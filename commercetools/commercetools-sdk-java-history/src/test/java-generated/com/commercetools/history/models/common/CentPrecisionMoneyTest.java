
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CentPrecisionMoneyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CentPrecisionMoneyBuilder builder) {
        CentPrecisionMoney centPrecisionMoney = builder.buildUnchecked();
        Assertions.assertThat(centPrecisionMoney).isInstanceOf(CentPrecisionMoney.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fractionDigits", CentPrecisionMoney.builder().fractionDigits(4) } };
    }

    @Test
    public void fractionDigits() {
        CentPrecisionMoney value = CentPrecisionMoney.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }
}
