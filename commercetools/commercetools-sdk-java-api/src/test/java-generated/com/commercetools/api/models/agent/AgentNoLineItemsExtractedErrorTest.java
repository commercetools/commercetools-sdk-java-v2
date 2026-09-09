
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentNoLineItemsExtractedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentNoLineItemsExtractedErrorBuilder builder) {
        AgentNoLineItemsExtractedError agentNoLineItemsExtractedError = builder.buildUnchecked();
        Assertions.assertThat(agentNoLineItemsExtractedError).isInstanceOf(AgentNoLineItemsExtractedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", AgentNoLineItemsExtractedError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentNoLineItemsExtractedError value = AgentNoLineItemsExtractedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
