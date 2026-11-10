
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentBusinessUnitLimitExceededErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentBusinessUnitLimitExceededErrorBuilder builder) {
        AgentBusinessUnitLimitExceededError agentBusinessUnitLimitExceededError = builder.buildUnchecked();
        Assertions.assertThat(agentBusinessUnitLimitExceededError)
                .isInstanceOf(AgentBusinessUnitLimitExceededError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AgentBusinessUnitLimitExceededError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentBusinessUnitLimitExceededError value = AgentBusinessUnitLimitExceededError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
