
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentResponsesMultipartRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentResponsesMultipartRequestBuilder builder) {
        AgentResponsesMultipartRequest agentResponsesMultipartRequest = builder.buildUnchecked();
        Assertions.assertThat(agentResponsesMultipartRequest).isInstanceOf(AgentResponsesMultipartRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payload", AgentResponsesMultipartRequest.builder()
                .payload(new com.commercetools.api.models.agent.AgentResponsesPayloadImpl()) } };
    }

    @Test
    public void payload() {
        AgentResponsesMultipartRequest value = AgentResponsesMultipartRequest.of();
        value.setPayload(new com.commercetools.api.models.agent.AgentResponsesPayloadImpl());
        Assertions.assertThat(value.getPayload())
                .isEqualTo(new com.commercetools.api.models.agent.AgentResponsesPayloadImpl());
    }
}
