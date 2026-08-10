
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CommerceMcpServerConfigDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CommerceMcpServerConfigDraft commerceMcpServerConfigDraft = CommerceMcpServerConfigDraft.builder()
 *             .majorVersion("{majorVersion}")
 *             .plusTools(toolsBuilder -> toolsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CommerceMcpServerConfigDraftBuilder implements Builder<CommerceMcpServerConfigDraft> {

    private String majorVersion;

    private java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> tools;

    @Nullable
    private java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> toolCustomizations;

    @Nullable
    private com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering jsonOutputFiltering;

    @Nullable
    private com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting toolOutputFormatting;

    /**
     *  <p>Major version of this MCP Server type. Supported versions are <code>v1</code> (deprecated) and <code>v4</code>.</p>
     * @param majorVersion value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder majorVersion(final String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }

    /**
     *  <p>List of tools to enable for this MCP Server. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>. To reduce the number of LLM turns and improve overall performance, it is advisable to expose only the tools that are necessary, or at least minimize the exposure of tools that are unlikely to be used.</p>
     * @param tools value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder tools(
            final com.commercetools.api.models.mcp_server.McpServerTool... tools) {
        this.tools = new ArrayList<>(Arrays.asList(tools));
        return this;
    }

    /**
     *  <p>List of tools to enable for this MCP Server. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>. To reduce the number of LLM turns and improve overall performance, it is advisable to expose only the tools that are necessary, or at least minimize the exposure of tools that are unlikely to be used.</p>
     * @param tools value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder tools(
            final java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> tools) {
        this.tools = tools;
        return this;
    }

    /**
     *  <p>List of tools to enable for this MCP Server. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>. To reduce the number of LLM turns and improve overall performance, it is advisable to expose only the tools that are necessary, or at least minimize the exposure of tools that are unlikely to be used.</p>
     * @param tools value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder plusTools(
            final com.commercetools.api.models.mcp_server.McpServerTool... tools) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        this.tools.addAll(Arrays.asList(tools));
        return this;
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param toolCustomizations value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder toolCustomizations(
            @Nullable final com.commercetools.api.models.mcp_server.ToolCustomization... toolCustomizations) {
        this.toolCustomizations = new ArrayList<>(Arrays.asList(toolCustomizations));
        return this;
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param toolCustomizations value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder toolCustomizations(
            @Nullable final java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> toolCustomizations) {
        this.toolCustomizations = toolCustomizations;
        return this;
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param toolCustomizations value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder plusToolCustomizations(
            @Nullable final com.commercetools.api.models.mcp_server.ToolCustomization... toolCustomizations) {
        if (this.toolCustomizations == null) {
            this.toolCustomizations = new ArrayList<>();
        }
        this.toolCustomizations.addAll(Arrays.asList(toolCustomizations));
        return this;
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder plusToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomizationBuilder> builder) {
        if (this.toolCustomizations == null) {
            this.toolCustomizations = new ArrayList<>();
        }
        this.toolCustomizations
                .add(builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder withToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomizationBuilder> builder) {
        this.toolCustomizations = new ArrayList<>();
        this.toolCustomizations
                .add(builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder addToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomization> builder) {
        return plusToolCustomizations(
            builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()));
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder setToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomization> builder) {
        return toolCustomizations(builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()));
    }

    /**
     *  <p>Response field-filtering rules applied to tool responses.</p>
     * @param builder function to build the jsonOutputFiltering value
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder jsonOutputFiltering(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder> builder) {
        this.jsonOutputFiltering = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Response field-filtering rules applied to tool responses.</p>
     * @param builder function to build the jsonOutputFiltering value
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder withJsonOutputFiltering(
            Function<com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder, com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering> builder) {
        this.jsonOutputFiltering = builder
                .apply(com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringBuilder.of());
        return this;
    }

    /**
     *  <p>Response field-filtering rules applied to tool responses.</p>
     * @param jsonOutputFiltering value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder jsonOutputFiltering(
            @Nullable final com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering jsonOutputFiltering) {
        this.jsonOutputFiltering = jsonOutputFiltering;
        return this;
    }

    /**
     *  <p>Output formatting applied to tool responses. When absent, responses are left untouched.</p>
     * @param toolOutputFormatting value to be set
     * @return Builder
     */

    public CommerceMcpServerConfigDraftBuilder toolOutputFormatting(
            @Nullable final com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting toolOutputFormatting) {
        this.toolOutputFormatting = toolOutputFormatting;
        return this;
    }

    /**
     *  <p>Major version of this MCP Server type. Supported versions are <code>v1</code> (deprecated) and <code>v4</code>.</p>
     * @return majorVersion
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     *  <p>List of tools to enable for this MCP Server. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>. To reduce the number of LLM turns and improve overall performance, it is advisable to expose only the tools that are necessary, or at least minimize the exposure of tools that are unlikely to be used.</p>
     * @return tools
     */

    public java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> getTools() {
        return this.tools;
    }

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @return toolCustomizations
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> getToolCustomizations() {
        return this.toolCustomizations;
    }

    /**
     *  <p>Response field-filtering rules applied to tool responses.</p>
     * @return jsonOutputFiltering
     */

    @Nullable
    public com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering getJsonOutputFiltering() {
        return this.jsonOutputFiltering;
    }

    /**
     *  <p>Output formatting applied to tool responses. When absent, responses are left untouched.</p>
     * @return toolOutputFormatting
     */

    @Nullable
    public com.commercetools.api.models.mcp_server.McpServerToolOutputFormatting getToolOutputFormatting() {
        return this.toolOutputFormatting;
    }

    /**
     * builds CommerceMcpServerConfigDraft with checking for non-null required values
     * @return CommerceMcpServerConfigDraft
     */
    public CommerceMcpServerConfigDraft build() {
        Objects.requireNonNull(majorVersion, CommerceMcpServerConfigDraft.class + ": majorVersion is missing");
        Objects.requireNonNull(tools, CommerceMcpServerConfigDraft.class + ": tools is missing");
        return new CommerceMcpServerConfigDraftImpl(majorVersion, tools, toolCustomizations, jsonOutputFiltering,
            toolOutputFormatting);
    }

    /**
     * builds CommerceMcpServerConfigDraft without checking for non-null required values
     * @return CommerceMcpServerConfigDraft
     */
    public CommerceMcpServerConfigDraft buildUnchecked() {
        return new CommerceMcpServerConfigDraftImpl(majorVersion, tools, toolCustomizations, jsonOutputFiltering,
            toolOutputFormatting);
    }

    /**
     * factory method for an instance of CommerceMcpServerConfigDraftBuilder
     * @return builder
     */
    public static CommerceMcpServerConfigDraftBuilder of() {
        return new CommerceMcpServerConfigDraftBuilder();
    }

    /**
     * create builder for CommerceMcpServerConfigDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CommerceMcpServerConfigDraftBuilder of(final CommerceMcpServerConfigDraft template) {
        CommerceMcpServerConfigDraftBuilder builder = new CommerceMcpServerConfigDraftBuilder();
        builder.majorVersion = template.getMajorVersion();
        builder.tools = template.getTools();
        builder.toolCustomizations = template.getToolCustomizations();
        builder.jsonOutputFiltering = template.getJsonOutputFiltering();
        builder.toolOutputFormatting = template.getToolOutputFormatting();
        return builder;
    }

}
