
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Connection configuration for creating or updating a Commerce MCP Server.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("CommerceMCP")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CommerceMcpServerConfigDraftImpl.class)
public interface CommerceMcpServerConfigDraft
        extends McpServerConfigDraft, io.vrap.rmf.base.client.Draft<CommerceMcpServerConfigDraft> {

    /**
     * discriminator value for CommerceMcpServerConfigDraft
     */
    String COMMERCE_MCP = "CommerceMCP";

    /**
     *  <p>Major version of this MCP Server type. Supported versions are <code>v1</code> (deprecated) and <code>v4</code>.</p>
     * @return majorVersion
     */
    @NotNull
    @JsonProperty("majorVersion")
    public String getMajorVersion();

    /**
     *  <p>List of tools to enable for this MCP Server. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>. To reduce the number of LLM turns and improve overall performance, it is advisable to expose only the tools that are necessary, or at least minimize the exposure of tools that are unlikely to be used.</p>
     * @return tools
     */
    @NotNull
    @JsonProperty("tools")
    public List<McpServerTool> getTools();

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @return toolCustomizations
     */
    @Valid
    @JsonProperty("toolCustomizations")
    public List<ToolCustomization> getToolCustomizations();

    /**
     *  <p>Response field-filtering rules applied to tool responses.</p>
     * @return jsonOutputFiltering
     */
    @Valid
    @JsonProperty("jsonOutputFiltering")
    public McpServerJsonOutputFiltering getJsonOutputFiltering();

    /**
     *  <p>Output formatting applied to tool responses. When absent, responses are left untouched.</p>
     * @return toolOutputFormatting
     */

    @JsonProperty("toolOutputFormatting")
    public McpServerToolOutputFormatting getToolOutputFormatting();

    /**
     *  <p>Major version of this MCP Server type. Supported versions are <code>v1</code> (deprecated) and <code>v4</code>.</p>
     * @param majorVersion value to be set
     */

    public void setMajorVersion(final String majorVersion);

    /**
     *  <p>List of tools to enable for this MCP Server. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>. To reduce the number of LLM turns and improve overall performance, it is advisable to expose only the tools that are necessary, or at least minimize the exposure of tools that are unlikely to be used.</p>
     * @param tools values to be set
     */

    @JsonIgnore
    public void setTools(final McpServerTool... tools);

    /**
     *  <p>List of tools to enable for this MCP Server. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>. To reduce the number of LLM turns and improve overall performance, it is advisable to expose only the tools that are necessary, or at least minimize the exposure of tools that are unlikely to be used.</p>
     * @param tools values to be set
     */

    public void setTools(final List<McpServerTool> tools);

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param toolCustomizations values to be set
     */

    @JsonIgnore
    public void setToolCustomizations(final ToolCustomization... toolCustomizations);

    /**
     *  <p>Per-tool customizations applied at <code>tools/list</code> and <code>tools/call</code> time, such as overriding a tool's description or constraining its parameters.</p>
     * @param toolCustomizations values to be set
     */

    public void setToolCustomizations(final List<ToolCustomization> toolCustomizations);

    /**
     *  <p>Response field-filtering rules applied to tool responses.</p>
     * @param jsonOutputFiltering value to be set
     */

    public void setJsonOutputFiltering(final McpServerJsonOutputFiltering jsonOutputFiltering);

    /**
     *  <p>Output formatting applied to tool responses. When absent, responses are left untouched.</p>
     * @param toolOutputFormatting value to be set
     */

    public void setToolOutputFormatting(final McpServerToolOutputFormatting toolOutputFormatting);

    /**
     * factory method
     * @return instance of CommerceMcpServerConfigDraft
     */
    public static CommerceMcpServerConfigDraft of() {
        return new CommerceMcpServerConfigDraftImpl();
    }

    /**
     * factory method to create a shallow copy CommerceMcpServerConfigDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CommerceMcpServerConfigDraft of(final CommerceMcpServerConfigDraft template) {
        CommerceMcpServerConfigDraftImpl instance = new CommerceMcpServerConfigDraftImpl();
        instance.setMajorVersion(template.getMajorVersion());
        instance.setTools(template.getTools());
        instance.setToolCustomizations(template.getToolCustomizations());
        instance.setJsonOutputFiltering(template.getJsonOutputFiltering());
        instance.setToolOutputFormatting(template.getToolOutputFormatting());
        return instance;
    }

    public CommerceMcpServerConfigDraft copyDeep();

    /**
     * factory method to create a deep copy of CommerceMcpServerConfigDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CommerceMcpServerConfigDraft deepCopy(@Nullable final CommerceMcpServerConfigDraft template) {
        if (template == null) {
            return null;
        }
        CommerceMcpServerConfigDraftImpl instance = new CommerceMcpServerConfigDraftImpl();
        instance.setMajorVersion(template.getMajorVersion());
        instance.setTools(Optional.ofNullable(template.getTools()).map(ArrayList::new).orElse(null));
        instance.setToolCustomizations(Optional.ofNullable(template.getToolCustomizations())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.mcp_server.ToolCustomization::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setJsonOutputFiltering(com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering
                .deepCopy(template.getJsonOutputFiltering()));
        instance.setToolOutputFormatting(template.getToolOutputFormatting());
        return instance;
    }

    /**
     * builder factory method for CommerceMcpServerConfigDraft
     * @return builder
     */
    public static CommerceMcpServerConfigDraftBuilder builder() {
        return CommerceMcpServerConfigDraftBuilder.of();
    }

    /**
     * create builder for CommerceMcpServerConfigDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CommerceMcpServerConfigDraftBuilder builder(final CommerceMcpServerConfigDraft template) {
        return CommerceMcpServerConfigDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCommerceMcpServerConfigDraft(Function<CommerceMcpServerConfigDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CommerceMcpServerConfigDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<CommerceMcpServerConfigDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CommerceMcpServerConfigDraft>";
            }
        };
    }
}
