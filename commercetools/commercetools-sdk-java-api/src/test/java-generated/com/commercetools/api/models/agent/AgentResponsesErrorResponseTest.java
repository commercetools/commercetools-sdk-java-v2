
package com.commercetools.api.models.agent;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentResponsesErrorResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentResponsesErrorResponseBuilder builder) {
        AgentResponsesErrorResponse agentResponsesErrorResponse = builder.buildUnchecked();
        Assertions.assertThat(agentResponsesErrorResponse).isInstanceOf(AgentResponsesErrorResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "errors",
                        AgentResponsesErrorResponse.builder()
                                .errors(Collections
                                        .singletonList(new com.commercetools.api.models.error.ErrorObjectImpl())) },
                new Object[] { "threadId", AgentResponsesErrorResponse.builder().threadId("threadId") } };
    }

    @Test
    public void errors() {
        AgentResponsesErrorResponse value = AgentResponsesErrorResponse.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
    }

    @Test
    public void threadId() {
        AgentResponsesErrorResponse value = AgentResponsesErrorResponse.of();
        value.setThreadId("threadId");
        Assertions.assertThat(value.getThreadId()).isEqualTo("threadId");
    }
}
