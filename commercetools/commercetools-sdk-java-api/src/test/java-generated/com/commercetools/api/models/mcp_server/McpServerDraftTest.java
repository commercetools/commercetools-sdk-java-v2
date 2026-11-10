
package com.commercetools.api.models.mcp_server;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerDraftBuilder builder) {
        McpServerDraft mcpServerDraft = builder.buildUnchecked();
        Assertions.assertThat(mcpServerDraft).isInstanceOf(McpServerDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", McpServerDraft.builder().key("key") },
                new Object[] { "name",
                        McpServerDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        McpServerDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "authenticationMode",
                        McpServerDraft.builder()
                                .authenticationMode(com.commercetools.api.models.mcp_server.McpServerAuthenticationMode
                                        .findEnum("ClientCredentials")) },
                new Object[] { "state",
                        McpServerDraft.builder()
                                .state(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled")) },
                new Object[] { "mcpServer", McpServerDraft.builder()
                        .mcpServer(new com.commercetools.api.models.mcp_server.McpServerConfigDraftImpl()) } };
    }

    @Test
    public void key() {
        McpServerDraft value = McpServerDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        McpServerDraft value = McpServerDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        McpServerDraft value = McpServerDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void authenticationMode() {
        McpServerDraft value = McpServerDraft.of();
        value.setAuthenticationMode(
            com.commercetools.api.models.mcp_server.McpServerAuthenticationMode.findEnum("ClientCredentials"));
        Assertions.assertThat(value.getAuthenticationMode())
                .isEqualTo(
                    com.commercetools.api.models.mcp_server.McpServerAuthenticationMode.findEnum("ClientCredentials"));
    }

    @Test
    public void state() {
        McpServerDraft value = McpServerDraft.of();
        value.setState(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled"));
    }

    @Test
    public void mcpServer() {
        McpServerDraft value = McpServerDraft.of();
        value.setMcpServer(new com.commercetools.api.models.mcp_server.McpServerConfigDraftImpl());
        Assertions.assertThat(value.getMcpServer())
                .isEqualTo(new com.commercetools.api.models.mcp_server.McpServerConfigDraftImpl());
    }
}
