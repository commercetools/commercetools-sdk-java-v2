
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AbsoluteAllocationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AbsoluteAllocationBuilder builder) {
        AbsoluteAllocation absoluteAllocation = builder.buildUnchecked();
        Assertions.assertThat(absoluteAllocation).isInstanceOf(AbsoluteAllocation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "amount", AbsoluteAllocation.builder()
                .amount(new com.commercetools.api.models.common.HighPrecisionMoneyImpl()) } };
    }

    @Test
    public void amount() {
        AbsoluteAllocation value = AbsoluteAllocation.of();
        value.setAmount(new com.commercetools.api.models.common.HighPrecisionMoneyImpl());
        Assertions.assertThat(value.getAmount())
                .isEqualTo(new com.commercetools.api.models.common.HighPrecisionMoneyImpl());
    }
}
