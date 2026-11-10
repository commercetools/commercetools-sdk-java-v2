
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerRemoveToolActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerRemoveToolActionBuilder builder) {
        McpServerRemoveToolAction mcpServerRemoveToolAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerRemoveToolAction).isInstanceOf(McpServerRemoveToolAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tool", McpServerRemoveToolAction.builder()
                .tool(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")) } };
    }

    @Test
    public void tool() {
        McpServerRemoveToolAction value = McpServerRemoveToolAction.of();
        value.setTool(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"));
        Assertions.assertThat(value.getTool())
                .isEqualTo(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"));
    }
}
