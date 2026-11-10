
package com.commercetools.api.models.agent;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AgentFileNotProcessedWarningTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AgentFileNotProcessedWarningBuilder builder) {
        AgentFileNotProcessedWarning agentFileNotProcessedWarning = builder.buildUnchecked();
        Assertions.assertThat(agentFileNotProcessedWarning).isInstanceOf(AgentFileNotProcessedWarning.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", AgentFileNotProcessedWarning.builder().message("message") },
                new Object[] { "fileName", AgentFileNotProcessedWarning.builder().fileName("fileName") } };
    }

    @Test
    public void message() {
        AgentFileNotProcessedWarning value = AgentFileNotProcessedWarning.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void fileName() {
        AgentFileNotProcessedWarning value = AgentFileNotProcessedWarning.of();
        value.setFileName("fileName");
        Assertions.assertThat(value.getFileName()).isEqualTo("fileName");
    }
}
