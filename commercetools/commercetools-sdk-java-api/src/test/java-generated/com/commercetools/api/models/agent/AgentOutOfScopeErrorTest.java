
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentOutOfScopeErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentOutOfScopeErrorBuilder builder) {
        AgentOutOfScopeError agentOutOfScopeError = builder.buildUnchecked();
        Assertions.assertThat(agentOutOfScopeError).isInstanceOf(AgentOutOfScopeError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentOutOfScopeError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentOutOfScopeError value = AgentOutOfScopeError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
