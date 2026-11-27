
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentMissingCurrencyErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentMissingCurrencyErrorBuilder builder) {
        AgentMissingCurrencyError agentMissingCurrencyError = builder.buildUnchecked();
        Assertions.assertThat(agentMissingCurrencyError).isInstanceOf(AgentMissingCurrencyError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentMissingCurrencyError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentMissingCurrencyError value = AgentMissingCurrencyError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
