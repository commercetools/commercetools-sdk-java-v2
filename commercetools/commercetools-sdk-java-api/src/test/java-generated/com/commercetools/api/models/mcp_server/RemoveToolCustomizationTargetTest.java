
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveToolCustomizationTargetTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveToolCustomizationTargetBuilder builder) {
        RemoveToolCustomizationTarget removeToolCustomizationTarget = builder.buildUnchecked();
        Assertions.assertThat(removeToolCustomizationTarget).isInstanceOf(RemoveToolCustomizationTarget.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "tool", RemoveToolCustomizationTarget.builder()
                .tool(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")) } };
    }

    @Test
    public void tool() {
        RemoveToolCustomizationTarget value = RemoveToolCustomizationTarget.of();
        value.setTool(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"));
        Assertions.assertThat(value.getTool())
                .isEqualTo(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"));
    }
}
