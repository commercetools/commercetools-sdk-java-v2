
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ToolCustomizationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ToolCustomization toolCustomization = ToolCustomization.builder()
 *             .tool(McpServerTool.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ToolCustomizationBuilder implements Builder<ToolCustomization> {

    private com.commercetools.api.models.mcp_server.McpServerTool tool;

    @Nullable
    private String description;

    @Nullable
    private java.util.List<com.commercetools.api.models.mcp_server.ParameterOverride> parameters;

    /**
     *  <p>Name of the tool to customize, such as <code>read_products</code> or <code>create_orders</code>. Must be one of the tools enabled on the MCP Server.</p>
     * @param tool value to be set
     * @return Builder
     */

    public ToolCustomizationBuilder tool(final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
        return this;
    }

    /**
     *  <p>Replacement description for the tool, shown to the AI agent.</p>
     * @param description value to be set
     * @return Builder
     */

    public ToolCustomizationBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param parameters value to be set
     * @return Builder
     */

    public ToolCustomizationBuilder parameters(
            @Nullable final com.commercetools.api.models.mcp_server.ParameterOverride... parameters) {
        this.parameters = new ArrayList<>(Arrays.asList(parameters));
        return this;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param parameters value to be set
     * @return Builder
     */

    public ToolCustomizationBuilder parameters(
            @Nullable final java.util.List<com.commercetools.api.models.mcp_server.ParameterOverride> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param parameters value to be set
     * @return Builder
     */

    public ToolCustomizationBuilder plusParameters(
            @Nullable final com.commercetools.api.models.mcp_server.ParameterOverride... parameters) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.addAll(Arrays.asList(parameters));
        return this;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param builder function to build the parameters value
     * @return Builder
     */

    public ToolCustomizationBuilder plusParameters(
            Function<com.commercetools.api.models.mcp_server.ParameterOverrideBuilder, com.commercetools.api.models.mcp_server.ParameterOverrideBuilder> builder) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters
                .add(builder.apply(com.commercetools.api.models.mcp_server.ParameterOverrideBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param builder function to build the parameters value
     * @return Builder
     */

    public ToolCustomizationBuilder withParameters(
            Function<com.commercetools.api.models.mcp_server.ParameterOverrideBuilder, com.commercetools.api.models.mcp_server.ParameterOverrideBuilder> builder) {
        this.parameters = new ArrayList<>();
        this.parameters
                .add(builder.apply(com.commercetools.api.models.mcp_server.ParameterOverrideBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param builder function to build the parameters value
     * @return Builder
     */

    public ToolCustomizationBuilder addParameters(
            Function<com.commercetools.api.models.mcp_server.ParameterOverrideBuilder, com.commercetools.api.models.mcp_server.ParameterOverride> builder) {
        return plusParameters(builder.apply(com.commercetools.api.models.mcp_server.ParameterOverrideBuilder.of()));
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param builder function to build the parameters value
     * @return Builder
     */

    public ToolCustomizationBuilder setParameters(
            Function<com.commercetools.api.models.mcp_server.ParameterOverrideBuilder, com.commercetools.api.models.mcp_server.ParameterOverride> builder) {
        return parameters(builder.apply(com.commercetools.api.models.mcp_server.ParameterOverrideBuilder.of()));
    }

    /**
     *  <p>Name of the tool to customize, such as <code>read_products</code> or <code>create_orders</code>. Must be one of the tools enabled on the MCP Server.</p>
     * @return tool
     */

    public com.commercetools.api.models.mcp_server.McpServerTool getTool() {
        return this.tool;
    }

    /**
     *  <p>Replacement description for the tool, shown to the AI agent.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @return parameters
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.mcp_server.ParameterOverride> getParameters() {
        return this.parameters;
    }

    /**
     * builds ToolCustomization with checking for non-null required values
     * @return ToolCustomization
     */
    public ToolCustomization build() {
        Objects.requireNonNull(tool, ToolCustomization.class + ": tool is missing");
        return new ToolCustomizationImpl(tool, description, parameters);
    }

    /**
     * builds ToolCustomization without checking for non-null required values
     * @return ToolCustomization
     */
    public ToolCustomization buildUnchecked() {
        return new ToolCustomizationImpl(tool, description, parameters);
    }

    /**
     * factory method for an instance of ToolCustomizationBuilder
     * @return builder
     */
    public static ToolCustomizationBuilder of() {
        return new ToolCustomizationBuilder();
    }

    /**
     * create builder for ToolCustomization instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ToolCustomizationBuilder of(final ToolCustomization template) {
        ToolCustomizationBuilder builder = new ToolCustomizationBuilder();
        builder.tool = template.getTool();
        builder.description = template.getDescription();
        builder.parameters = template.getParameters();
        return builder;
    }

}
