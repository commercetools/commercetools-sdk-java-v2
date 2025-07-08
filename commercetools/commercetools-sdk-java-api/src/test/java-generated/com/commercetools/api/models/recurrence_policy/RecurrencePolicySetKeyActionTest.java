
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicySetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicySetKeyActionBuilder builder) {
        RecurrencePolicySetKeyAction recurrencePolicySetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicySetKeyAction).isInstanceOf(RecurrencePolicySetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurrencePolicySetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        RecurrencePolicySetKeyAction value = RecurrencePolicySetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
