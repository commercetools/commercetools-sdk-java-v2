
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentProductsNotFoundErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentProductsNotFoundErrorBuilder builder) {
        AgentProductsNotFoundError agentProductsNotFoundError = builder.buildUnchecked();
        Assertions.assertThat(agentProductsNotFoundError).isInstanceOf(AgentProductsNotFoundError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentProductsNotFoundError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentProductsNotFoundError value = AgentProductsNotFoundError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
