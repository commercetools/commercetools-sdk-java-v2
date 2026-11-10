
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerAddToolCustomizationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerAddToolCustomizationActionBuilder builder) {
        McpServerAddToolCustomizationAction mcpServerAddToolCustomizationAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerAddToolCustomizationAction)
                .isInstanceOf(McpServerAddToolCustomizationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "toolCustomization", McpServerAddToolCustomizationAction.builder()
                .toolCustomization(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl()) } };
    }

    @Test
    public void toolCustomization() {
        McpServerAddToolCustomizationAction value = McpServerAddToolCustomizationAction.of();
        value.setToolCustomization(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl());
        Assertions.assertThat(value.getToolCustomization())
                .isEqualTo(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl());
    }
}
