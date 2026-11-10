
package com.commercetools.api.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CentPrecisionMoneyDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CentPrecisionMoneyDraftBuilder builder) {
        CentPrecisionMoneyDraft centPrecisionMoneyDraft = builder.buildUnchecked();
        Assertions.assertThat(centPrecisionMoneyDraft).isInstanceOf(CentPrecisionMoneyDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "fractionDigits", CentPrecisionMoneyDraft.builder().fractionDigits(4) } };
    }

    @Test
    public void fractionDigits() {
        CentPrecisionMoneyDraft value = CentPrecisionMoneyDraft.of();
        value.setFractionDigits(4);
        Assertions.assertThat(value.getFractionDigits()).isEqualTo(4);
    }
}
