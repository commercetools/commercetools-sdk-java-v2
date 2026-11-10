
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerRemoveToolCustomizationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerRemoveToolCustomizationActionBuilder builder) {
        McpServerRemoveToolCustomizationAction mcpServerRemoveToolCustomizationAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerRemoveToolCustomizationAction)
                .isInstanceOf(McpServerRemoveToolCustomizationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "toolCustomization", McpServerRemoveToolCustomizationAction.builder()
                .toolCustomization(new com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetImpl()) } };
    }

    @Test
    public void toolCustomization() {
        McpServerRemoveToolCustomizationAction value = McpServerRemoveToolCustomizationAction.of();
        value.setToolCustomization(new com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetImpl());
        Assertions.assertThat(value.getToolCustomization())
                .isEqualTo(new com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetImpl());
    }
}
