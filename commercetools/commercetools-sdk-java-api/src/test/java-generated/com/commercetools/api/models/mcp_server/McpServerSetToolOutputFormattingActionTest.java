
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerSetToolOutputFormattingActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerSetToolOutputFormattingActionBuilder builder) {
        McpServerSetToolOutputFormattingAction mcpServerSetToolOutputFormattingAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerSetToolOutputFormattingAction)
                .isInstanceOf(McpServerSetToolOutputFormattingAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "toolOutputFormatting",
                McpServerSetToolOutputFormattingAction.builder()
                        .toolOutputFormatting(com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting
                                .findEnum("JsonToTabular")) } };
    }

    @Test
    public void toolOutputFormatting() {
        McpServerSetToolOutputFormattingAction value = McpServerSetToolOutputFormattingAction.of();
        value.setToolOutputFormatting(
            com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting.findEnum("JsonToTabular"));
        Assertions.assertThat(value.getToolOutputFormatting())
                .isEqualTo(
                    com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting.findEnum("JsonToTabular"));
    }
}
