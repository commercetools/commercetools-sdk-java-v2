
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AbsoluteAllocationDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AbsoluteAllocationDraftBuilder builder) {
        AbsoluteAllocationDraft absoluteAllocationDraft = builder.buildUnchecked();
        Assertions.assertThat(absoluteAllocationDraft).isInstanceOf(AbsoluteAllocationDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "amount", AbsoluteAllocationDraft.builder()
                .amount(new com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl()) } };
    }

    @Test
    public void amount() {
        AbsoluteAllocationDraft value = AbsoluteAllocationDraft.of();
        value.setAmount(new com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl());
        Assertions.assertThat(value.getAmount())
                .isEqualTo(new com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl());
    }
}
