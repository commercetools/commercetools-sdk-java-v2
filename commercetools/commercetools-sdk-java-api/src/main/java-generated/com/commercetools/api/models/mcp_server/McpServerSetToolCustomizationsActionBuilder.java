
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetToolCustomizationsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetToolCustomizationsAction mcpServerSetToolCustomizationsAction = McpServerSetToolCustomizationsAction.builder()
 *             .plusToolCustomizations(toolCustomizationsBuilder -> toolCustomizationsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetToolCustomizationsActionBuilder implements Builder<McpServerSetToolCustomizationsAction> {

    private java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> toolCustomizations;

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param toolCustomizations value to be set
     * @return Builder
     */

    public McpServerSetToolCustomizationsActionBuilder toolCustomizations(
            final com.commercetools.api.models.mcp_server.ToolCustomization... toolCustomizations) {
        this.toolCustomizations = new ArrayList<>(Arrays.asList(toolCustomizations));
        return this;
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param toolCustomizations value to be set
     * @return Builder
     */

    public McpServerSetToolCustomizationsActionBuilder toolCustomizations(
            final java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> toolCustomizations) {
        this.toolCustomizations = toolCustomizations;
        return this;
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param toolCustomizations value to be set
     * @return Builder
     */

    public McpServerSetToolCustomizationsActionBuilder plusToolCustomizations(
            final com.commercetools.api.models.mcp_server.ToolCustomization... toolCustomizations) {
        if (this.toolCustomizations == null) {
            this.toolCustomizations = new ArrayList<>();
        }
        this.toolCustomizations.addAll(Arrays.asList(toolCustomizations));
        return this;
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public McpServerSetToolCustomizationsActionBuilder plusToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomizationBuilder> builder) {
        if (this.toolCustomizations == null) {
            this.toolCustomizations = new ArrayList<>();
        }
        this.toolCustomizations
                .add(builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public McpServerSetToolCustomizationsActionBuilder withToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomizationBuilder> builder) {
        this.toolCustomizations = new ArrayList<>();
        this.toolCustomizations
                .add(builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public McpServerSetToolCustomizationsActionBuilder addToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomization> builder) {
        return plusToolCustomizations(
            builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()));
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param builder function to build the toolCustomizations value
     * @return Builder
     */

    public McpServerSetToolCustomizationsActionBuilder setToolCustomizations(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomization> builder) {
        return toolCustomizations(builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of()));
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @return toolCustomizations
     */

    public java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> getToolCustomizations() {
        return this.toolCustomizations;
    }

    /**
     * builds McpServerSetToolCustomizationsAction with checking for non-null required values
     * @return McpServerSetToolCustomizationsAction
     */
    public McpServerSetToolCustomizationsAction build() {
        Objects.requireNonNull(toolCustomizations,
            McpServerSetToolCustomizationsAction.class + ": toolCustomizations is missing");
        return new McpServerSetToolCustomizationsActionImpl(toolCustomizations);
    }

    /**
     * builds McpServerSetToolCustomizationsAction without checking for non-null required values
     * @return McpServerSetToolCustomizationsAction
     */
    public McpServerSetToolCustomizationsAction buildUnchecked() {
        return new McpServerSetToolCustomizationsActionImpl(toolCustomizations);
    }

    /**
     * factory method for an instance of McpServerSetToolCustomizationsActionBuilder
     * @return builder
     */
    public static McpServerSetToolCustomizationsActionBuilder of() {
        return new McpServerSetToolCustomizationsActionBuilder();
    }

    /**
     * create builder for McpServerSetToolCustomizationsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetToolCustomizationsActionBuilder of(final McpServerSetToolCustomizationsAction template) {
        McpServerSetToolCustomizationsActionBuilder builder = new McpServerSetToolCustomizationsActionBuilder();
        builder.toolCustomizations = template.getToolCustomizations();
        return builder;
    }

}
