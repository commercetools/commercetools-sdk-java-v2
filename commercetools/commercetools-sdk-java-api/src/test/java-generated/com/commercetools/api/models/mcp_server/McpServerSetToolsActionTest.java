
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerSetToolsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerSetToolsActionBuilder builder) {
        McpServerSetToolsAction mcpServerSetToolsAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerSetToolsAction).isInstanceOf(McpServerSetToolsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tools",
                McpServerSetToolsAction.builder()
                        .tools(Collections.singletonList(
                            com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"))) } };
    }

    @Test
    public void tools() {
        McpServerSetToolsAction value = McpServerSetToolsAction.of();
        value.setTools(
            Collections.singletonList(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")));
        Assertions.assertThat(value.getTools())
                .isEqualTo(
                    Collections.singletonList(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")));
    }
}
