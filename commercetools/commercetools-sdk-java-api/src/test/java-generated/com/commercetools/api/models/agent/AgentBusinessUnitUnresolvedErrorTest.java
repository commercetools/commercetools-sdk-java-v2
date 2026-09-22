
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentBusinessUnitUnresolvedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentBusinessUnitUnresolvedErrorBuilder builder) {
        AgentBusinessUnitUnresolvedError agentBusinessUnitUnresolvedError = builder.buildUnchecked();
        Assertions.assertThat(agentBusinessUnitUnresolvedError).isInstanceOf(AgentBusinessUnitUnresolvedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AgentBusinessUnitUnresolvedError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentBusinessUnitUnresolvedError value = AgentBusinessUnitUnresolvedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
