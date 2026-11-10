
package com.commercetools.api.models.recurrence_policy;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicyUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicyUpdateBuilder builder) {
        RecurrencePolicyUpdate recurrencePolicyUpdate = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicyUpdate).isInstanceOf(RecurrencePolicyUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", RecurrencePolicyUpdate.builder().version(2L) },
                new Object[] { "actions", RecurrencePolicyUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        RecurrencePolicyUpdate value = RecurrencePolicyUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        RecurrencePolicyUpdate value = RecurrencePolicyUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.recurrence_policy.RecurrencePolicyUpdateActionImpl()));
    }
}
