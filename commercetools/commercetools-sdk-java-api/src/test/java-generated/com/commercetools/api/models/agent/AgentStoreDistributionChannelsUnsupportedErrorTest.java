
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentStoreDistributionChannelsUnsupportedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentStoreDistributionChannelsUnsupportedErrorBuilder builder) {
        AgentStoreDistributionChannelsUnsupportedError agentStoreDistributionChannelsUnsupportedError = builder
                .buildUnchecked();
        Assertions.assertThat(agentStoreDistributionChannelsUnsupportedError)
                .isInstanceOf(AgentStoreDistributionChannelsUnsupportedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message",
                AgentStoreDistributionChannelsUnsupportedError.builder().message("message") } };
    }

    @Test
    public void message() {
        AgentStoreDistributionChannelsUnsupportedError value = AgentStoreDistributionChannelsUnsupportedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
