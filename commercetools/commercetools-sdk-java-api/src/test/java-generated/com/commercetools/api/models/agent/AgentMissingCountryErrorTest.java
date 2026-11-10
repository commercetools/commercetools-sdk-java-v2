
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentMissingCountryErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentMissingCountryErrorBuilder builder) {
        AgentMissingCountryError agentMissingCountryError = builder.buildUnchecked();
        Assertions.assertThat(agentMissingCountryError).isInstanceOf(AgentMissingCountryError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentMissingCountryError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentMissingCountryError value = AgentMissingCountryError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
