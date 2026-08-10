
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerUpdateBuilder builder) {
        McpServerUpdate mcpServerUpdate = builder.buildUnchecked();
        Assertions.assertThat(mcpServerUpdate).isInstanceOf(McpServerUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", McpServerUpdate.builder().version(2L) },
                new Object[] { "actions",
                        McpServerUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.mcp_server.McpServerUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        McpServerUpdate value = McpServerUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        McpServerUpdate value = McpServerUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.mcp_server.McpServerUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.mcp_server.McpServerUpdateActionImpl()));
    }
}
