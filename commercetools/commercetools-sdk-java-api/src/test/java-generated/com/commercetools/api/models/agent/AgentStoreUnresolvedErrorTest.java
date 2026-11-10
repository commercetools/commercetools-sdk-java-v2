
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentStoreUnresolvedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentStoreUnresolvedErrorBuilder builder) {
        AgentStoreUnresolvedError agentStoreUnresolvedError = builder.buildUnchecked();
        Assertions.assertThat(agentStoreUnresolvedError).isInstanceOf(AgentStoreUnresolvedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentStoreUnresolvedError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentStoreUnresolvedError value = AgentStoreUnresolvedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
