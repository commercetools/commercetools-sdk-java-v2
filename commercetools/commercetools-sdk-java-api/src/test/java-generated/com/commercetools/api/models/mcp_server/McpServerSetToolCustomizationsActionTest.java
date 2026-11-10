
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerSetToolCustomizationsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerSetToolCustomizationsActionBuilder builder) {
        McpServerSetToolCustomizationsAction mcpServerSetToolCustomizationsAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerSetToolCustomizationsAction)
                .isInstanceOf(McpServerSetToolCustomizationsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "toolCustomizations", McpServerSetToolCustomizationsAction.builder()
                .toolCustomizations(
                    Collections.singletonList(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl())) } };
    }

    @Test
    public void toolCustomizations() {
        McpServerSetToolCustomizationsAction value = McpServerSetToolCustomizationsAction.of();
        value.setToolCustomizations(
            Collections.singletonList(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl()));
        Assertions.assertThat(value.getToolCustomizations())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl()));
    }
}
