
package com.commercetools.api.models.mcp_server;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class McpServerTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, McpServerBuilder builder) {
        McpServer mcpServer = builder.buildUnchecked();
        Assertions.assertThat(mcpServer).isInstanceOf(McpServer.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", McpServer.builder().id("id") },
                new Object[] { "version", McpServer.builder().version(2L) },
                new Object[] { "createdAt", McpServer.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        McpServer.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        McpServer.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        McpServer.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", McpServer.builder().key("key") },
                new Object[] { "name",
                        McpServer.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        McpServer.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "state",
                        McpServer.builder()
                                .state(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled")) },
                new Object[] { "mcpServer", McpServer.builder()
                        .mcpServer(new com.commercetools.api.models.mcp_server.McpServerConfigImpl()) } };
    }

    @Test
    public void id() {
        McpServer value = McpServer.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        McpServer value = McpServer.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        McpServer value = McpServer.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        McpServer value = McpServer.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        McpServer value = McpServer.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        McpServer value = McpServer.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        McpServer value = McpServer.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        McpServer value = McpServer.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        McpServer value = McpServer.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void state() {
        McpServer value = McpServer.of();
        value.setState(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.mcp_server.McpServerState.findEnum("Enabled"));
    }

    @Test
    public void mcpServer() {
        McpServer value = McpServer.of();
        value.setMcpServer(new com.commercetools.api.models.mcp_server.McpServerConfigImpl());
        Assertions.assertThat(value.getMcpServer())
                .isEqualTo(new com.commercetools.api.models.mcp_server.McpServerConfigImpl());
    }
}
