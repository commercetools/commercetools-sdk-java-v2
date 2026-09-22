
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentResponsesCartSuccessTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentResponsesCartSuccessBuilder builder) {
        AgentResponsesCartSuccess agentResponsesCartSuccess = builder.buildUnchecked();
        Assertions.assertThat(agentResponsesCartSuccess).isInstanceOf(AgentResponsesCartSuccess.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "entity",
                AgentResponsesCartSuccess.builder().entity(new com.commercetools.api.models.cart.CartImpl()) } };
    }

    @Test
    public void entity() {
        AgentResponsesCartSuccess value = AgentResponsesCartSuccess.of();
        value.setEntity(new com.commercetools.api.models.cart.CartImpl());
        Assertions.assertThat(value.getEntity()).isEqualTo(new com.commercetools.api.models.cart.CartImpl());
    }
}
