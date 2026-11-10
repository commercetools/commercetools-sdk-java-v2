
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerSetStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerSetStateActionBuilder builder) {
        McpServerSetStateAction mcpServerSetStateAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerSetStateAction).isInstanceOf(McpServerSetStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "state", McpServerSetStateAction.builder()
                .state(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled")) } };
    }

    @Test
    public void state() {
        McpServerSetStateAction value = McpServerSetStateAction.of();
        value.setState(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled"));
    }
}
