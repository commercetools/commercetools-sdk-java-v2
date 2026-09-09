
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentFeatureDisabledErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentFeatureDisabledErrorBuilder builder) {
        AgentFeatureDisabledError agentFeatureDisabledError = builder.buildUnchecked();
        Assertions.assertThat(agentFeatureDisabledError).isInstanceOf(AgentFeatureDisabledError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentFeatureDisabledError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentFeatureDisabledError value = AgentFeatureDisabledError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
