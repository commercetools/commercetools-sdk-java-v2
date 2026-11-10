
package com.commercetools.api.models.mcp_server;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CommerceMcpServerConfigDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CommerceMcpServerConfigDraftBuilder builder) {
        CommerceMcpServerConfigDraft commerceMcpServerConfigDraft = builder.buildUnchecked();
        Assertions.assertThat(commerceMcpServerConfigDraft).isInstanceOf(CommerceMcpServerConfigDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "majorVersion", CommerceMcpServerConfigDraft.builder().majorVersion("majorVersion") },
                new Object[] { "tools",
                        CommerceMcpServerConfigDraft.builder()
                                .tools(Collections.singletonList(
                                    com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all"))) },
                new Object[] { "toolCustomizations",
                        CommerceMcpServerConfigDraft.builder()
                                .toolCustomizations(Collections.singletonList(
                                    new com.commercetools.api.models.mcp_server.ToolCustomizationImpl())) },
                new Object[] { "jsonOutputFiltering",
                        CommerceMcpServerConfigDraft.builder()
                                .jsonOutputFiltering(
                                    new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl()) },
                new Object[] { "toolOutputFormatting", CommerceMcpServerConfigDraft.builder()
                        .toolOutputFormatting(com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting
                                .findEnum("JsonToTabular")) } };
    }

    @Test
    public void majorVersion() {
        CommerceMcpServerConfigDraft value = CommerceMcpServerConfigDraft.of();
        value.setMajorVersion("majorVersion");
        Assertions.assertThat(value.getMajorVersion()).isEqualTo("majorVersion");
    }

    @Test
    public void tools() {
        CommerceMcpServerConfigDraft value = CommerceMcpServerConfigDraft.of();
        value.setTools(
            Collections.singletonList(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")));
        Assertions.assertThat(value.getTools())
                .isEqualTo(
                    Collections.singletonList(com.commercetools.api.models.mcp_server.McpServerTool.findEnum("all")));
    }

    @Test
    public void toolCustomizations() {
        CommerceMcpServerConfigDraft value = CommerceMcpServerConfigDraft.of();
        value.setToolCustomizations(
            Collections.singletonList(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl()));
        Assertions.assertThat(value.getToolCustomizations())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.mcp_server.ToolCustomizationImpl()));
    }

    @Test
    public void jsonOutputFiltering() {
        CommerceMcpServerConfigDraft value = CommerceMcpServerConfigDraft.of();
        value.setJsonOutputFiltering(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl());
        Assertions.assertThat(value.getJsonOutputFiltering())
                .isEqualTo(new com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringImpl());
    }

    @Test
    public void toolOutputFormatting() {
        CommerceMcpServerConfigDraft value = CommerceMcpServerConfigDraft.of();
        value.setToolOutputFormatting(
            com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting.findEnum("JsonToTabular"));
        Assertions.assertThat(value.getToolOutputFormatting())
                .isEqualTo(
                    com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting.findEnum("JsonToTabular"));
    }
}
