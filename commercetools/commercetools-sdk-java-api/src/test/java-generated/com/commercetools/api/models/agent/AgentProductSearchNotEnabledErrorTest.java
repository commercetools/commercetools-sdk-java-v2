
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentProductSearchNotEnabledErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentProductSearchNotEnabledErrorBuilder builder) {
        AgentProductSearchNotEnabledError agentProductSearchNotEnabledError = builder.buildUnchecked();
        Assertions.assertThat(agentProductSearchNotEnabledError).isInstanceOf(AgentProductSearchNotEnabledError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AgentProductSearchNotEnabledError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentProductSearchNotEnabledError value = AgentProductSearchNotEnabledError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
