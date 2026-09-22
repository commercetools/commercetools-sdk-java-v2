
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentStoreAmbiguousErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentStoreAmbiguousErrorBuilder builder) {
        AgentStoreAmbiguousError agentStoreAmbiguousError = builder.buildUnchecked();
        Assertions.assertThat(agentStoreAmbiguousError).isInstanceOf(AgentStoreAmbiguousError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentStoreAmbiguousError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentStoreAmbiguousError value = AgentStoreAmbiguousError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
