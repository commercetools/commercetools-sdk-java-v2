
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class HighPrecisionMoneyDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, HighPrecisionMoneyDraftBuilder builder) {
        HighPrecisionMoneyDraft highPrecisionMoneyDraft = builder.buildUnchecked();
        Assertions.assertThat(highPrecisionMoneyDraft).isInstanceOf(HighPrecisionMoneyDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "fractionDigits", HighPrecisionMoneyDraft.builder().fractionDigits(4) },
                new Object[] { "preciseAmount", HighPrecisionMoneyDraft.builder().preciseAmount(3L) },
                new Object[] { "centAmount", HighPrecisionMoneyDraft.builder().centAmount(3L) } };
    }

    @Test
    public void fractionDigits() {
        HighPrecisionMoneyDraft value = HighPrecisionMoneyDraft.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }

    @Test
    public void preciseAmount() {
        HighPrecisionMoneyDraft value = HighPrecisionMoneyDraft.of();
        value.setPreciseAmount(3L);
        Assertions.assertThat(value.getPreciseAmount()).isEqualTo(3L);
    }

    @Test
    public void centAmount() {
        HighPrecisionMoneyDraft value = HighPrecisionMoneyDraft.of();
        value.setCentAmount(3L);
        Assertions.assertThat(value.getCentAmount()).isEqualTo(3L);
    }
}
