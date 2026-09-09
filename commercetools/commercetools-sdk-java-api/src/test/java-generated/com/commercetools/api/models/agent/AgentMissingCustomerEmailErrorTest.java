
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentMissingCustomerEmailErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentMissingCustomerEmailErrorBuilder builder) {
        AgentMissingCustomerEmailError agentMissingCustomerEmailError = builder.buildUnchecked();
        Assertions.assertThat(agentMissingCustomerEmailError).isInstanceOf(AgentMissingCustomerEmailError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AgentMissingCustomerEmailError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentMissingCustomerEmailError value = AgentMissingCustomerEmailError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
