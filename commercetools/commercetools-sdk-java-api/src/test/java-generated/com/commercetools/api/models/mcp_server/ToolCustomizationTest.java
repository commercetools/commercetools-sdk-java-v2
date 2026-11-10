
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ToolCustomizationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ToolCustomizationBuilder builder) {
        ToolCustomization toolCustomization = builder.buildUnchecked();
        Assertions.assertThat(toolCustomization).isInstanceOf(ToolCustomization.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "tool",
                        ToolCustomization.builder()
                                .tool(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")) },
                new Object[] { "description", ToolCustomization.builder().description("description") },
                new Object[] { "parameters",
                        ToolCustomization.builder()
                                .parameters(Collections.singletonList(
                                    new com.commercetools.api.models.mcp_server.ParameterOverrideImpl())) } };
    }

    @Test
    public void tool() {
        ToolCustomization value = ToolCustomization.of();
        value.setTool(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"));
        Assertions.assertThat(value.getTool())
                .isEqualTo(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"));
    }

    @Test
    public void description() {
        ToolCustomization value = ToolCustomization.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void parameters() {
        ToolCustomization value = ToolCustomization.of();
        value.setParameters(
            Collections.singletonList(new com.commercetools.api.models.mcp_server.ParameterOverrideImpl()));
        Assertions.assertThat(value.getParameters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.mcp_server.ParameterOverrideImpl()));
    }
}
