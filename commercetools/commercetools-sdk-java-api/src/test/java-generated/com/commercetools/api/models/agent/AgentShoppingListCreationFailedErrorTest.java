
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentShoppingListCreationFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentShoppingListCreationFailedErrorBuilder builder) {
        AgentShoppingListCreationFailedError agentShoppingListCreationFailedError = builder.buildUnchecked();
        Assertions.assertThat(agentShoppingListCreationFailedError)
                .isInstanceOf(AgentShoppingListCreationFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AgentShoppingListCreationFailedError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentShoppingListCreationFailedError value = AgentShoppingListCreationFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
