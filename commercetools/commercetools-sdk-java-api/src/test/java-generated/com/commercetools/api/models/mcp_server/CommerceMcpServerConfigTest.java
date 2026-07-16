
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CommerceMcpServerConfigTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CommerceMcpServerConfigBuilder builder) {
        CommerceMcpServerConfig commerceMcpServerConfig = builder.buildUnchecked();
        Assertions.assertThat(commerceMcpServerConfig).isInstanceOf(CommerceMcpServerConfig.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "majorVersion", CommerceMcpServerConfig.builder().majorVersion("majorVersion") },
                new Object[] { "url", CommerceMcpServerConfig.builder().url("url") },
                new Object[] { "tools",
                        CommerceMcpServerConfig.builder()
                                .tools(Collections.singletonList(
                                    com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"))) },
                new Object[] { "toolCustomizations",
                        CommerceMcpServerConfig.builder()
                                .toolCustomizations(Collections.singletonList(
                                    new com.commercetools.api.models.mcp_server.ToolCustomizationImpl())) },
                new Object[] { "jsonOutputFiltering",
                        CommerceMcpServerConfig.builder()
                                .jsonOutputFiltering(
                                    new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl()) },
                new Object[] { "toolOutputFormatting", CommerceMcpServerConfig.builder()
                        .toolOutputFormatting(com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting
                                .findEnum("JsonToTabular")) } };
    }

    @Test
    public void majorVersion() {
        CommerceMcpServerConfig value = CommerceMcpServerConfig.of();
        value.setMajorVersion("majorVersion");
        Assertions.assertThat(value.getMajorVersion()).isEqualTo("majorVersion");
    }

    @Test
    public void url() {
        CommerceMcpServerConfig value = CommerceMcpServerConfig.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }

    @Test
    public void tools() {
        CommerceMcpServerConfig value = CommerceMcpServerConfig.of();
        value.setTools(
            Collections.singletonList(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")));
        Assertions.assertThat(value.getTools())
                .isEqualTo(
                    Collections.singletonList(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")));
    }

    @Test
    public void toolCustomizations() {
        CommerceMcpServerConfig value = CommerceMcpServerConfig.of();
        value.setToolCustomizations(
            Collections.singletonList(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl()));
        Assertions.assertThat(value.getToolCustomizations())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl()));
    }

    @Test
    public void jsonOutputFiltering() {
        CommerceMcpServerConfig value = CommerceMcpServerConfig.of();
        value.setJsonOutputFiltering(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl());
        Assertions.assertThat(value.getJsonOutputFiltering())
                .isEqualTo(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl());
    }

    @Test
    public void toolOutputFormatting() {
        CommerceMcpServerConfig value = CommerceMcpServerConfig.of();
        value.setToolOutputFormatting(
            com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting.findEnum("JsonToTabular"));
        Assertions.assertThat(value.getToolOutputFormatting())
                .isEqualTo(
                    com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting.findEnum("JsonToTabular"));
    }
}
