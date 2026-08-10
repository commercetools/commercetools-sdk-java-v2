
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerSetAuthenticationModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerSetAuthenticationModeActionBuilder builder) {
        McpServerSetAuthenticationModeAction mcpServerSetAuthenticationModeAction = builder.buildUnchecked();
        Assertions.assertThat(mcpServerSetAuthenticationModeAction)
                .isInstanceOf(McpServerSetAuthenticationModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "authenticationMode",
                McpServerSetAuthenticationModeAction.builder()
                        .authenticationMode(com.commercetools.api.models.mcp_server.McpServerAuthenticationMode
                                .findEnum("ClientCredentials")) } };
    }

    @Test
    public void authenticationMode() {
        McpServerSetAuthenticationModeAction value = McpServerSetAuthenticationModeAction.of();
        value.setAuthenticationMode(
            com.commercetools.api.models.mcp_server.McpServerAuthenticationMode.findEnum("ClientCredentials"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(
                    com.commercetools.api.models.mcp_server.McpServerAuthenticationMode.findEnum("ClientCredentials"));
    }
}
