
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerSetJsonOutputFilteringActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerSetJsonOutputFilteringActionBuilder builder) {
        McpServerSetJsonOutputFilteringAction mcpServerSetJsonOutputFilteringAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerSetJsonOutputFilteringAction)
                .isInstanceOf(McpServerSetJsonOutputFilteringAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "jsonOutputFiltering",
                McpServerSetJsonOutputFilteringAction.builder()
                        .jsonOutputFiltering(
                            new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl()) } };
    }

    @Test
    public void jsonOutputFiltering() {
        McpServerSetJsonOutputFilteringAction value = McpServerSetJsonOutputFilteringAction.of();
        value.setJsonOutputFiltering(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl());
        Assertions.assertThat(value.getJsonOutputFiltering())
                .isEqualTo(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl());
    }
}
