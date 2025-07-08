
package com.commercetools.api.models.recurring_order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CounterDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CounterDraftBuilder builder) {
        CounterDraft counterDraft = builder.buildUnchecked();
        Assertions.assertThat(counterDraft).isInstanceOf(CounterDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "totalToSkip", CounterDraft.builder().totalToSkip(3) } };
    }

    @Test
    public void totalToSkip() {
        CounterDraft value = CounterDraft.of();
        value.setTotalToSkip(3);
        Assertions.assertThat(value.getTotalToSkip()).isEqualTo(3);
    }
}
