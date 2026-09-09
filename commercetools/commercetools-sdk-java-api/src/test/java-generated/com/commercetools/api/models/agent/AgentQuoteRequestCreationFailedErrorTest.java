
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentQuoteRequestCreationFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentQuoteRequestCreationFailedErrorBuilder builder) {
        AgentQuoteRequestCreationFailedError agentQuoteRequestCreationFailedError = builder.buildUnchecked();
        Assertions.assertThat(agentQuoteRequestCreationFailedError)
                .isInstanceOf(AgentQuoteRequestCreationFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AgentQuoteRequestCreationFailedError.builder().message("message") },
                new Object[] { "cartId", AgentQuoteRequestCreationFailedError.builder().cartId("cartId") } };
    }

    @Test
    public void message() {
        AgentQuoteRequestCreationFailedError value = AgentQuoteRequestCreationFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void cartId() {
        AgentQuoteRequestCreationFailedError value = AgentQuoteRequestCreationFailedError.of();
        value.setCartId("cartId");
        Assertions.assertThat(value.getCartId()).isEqualTo("cartId");
    }
}
