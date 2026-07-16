
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerRemoveToolCustomizationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerRemoveToolCustomizationAction mcpServerRemoveToolCustomizationAction = McpServerRemoveToolCustomizationAction.builder()
 *             .toolCustomization(toolCustomizationBuilder -> toolCustomizationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerRemoveToolCustomizationActionBuilder implements Builder<McpServerRemoveToolCustomizationAction> {

    private com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget toolCustomization;

    /**
     *  <p>Identifies the tool customization to remove by its tool name.</p>
     * @param builder function to build the toolCustomization value
     * @return Builder
     */

    public McpServerRemoveToolCustomizationActionBuilder toolCustomization(
            Function<com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetBuilder, com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetBuilder> builder) {
        this.toolCustomization = builder
                .apply(com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Identifies the tool customization to remove by its tool name.</p>
     * @param builder function to build the toolCustomization value
     * @return Builder
     */

    public McpServerRemoveToolCustomizationActionBuilder withToolCustomization(
            Function<com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetBuilder, com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget> builder) {
        this.toolCustomization = builder
                .apply(com.commercetools.api.models.mcp_server.RemoveToolCustomizationTargetBuilder.of());
        return this;
    }

    /**
     *  <p>Identifies the tool customization to remove by its tool name.</p>
     * @param toolCustomization value to be set
     * @return Builder
     */

    public McpServerRemoveToolCustomizationActionBuilder toolCustomization(
            final com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget toolCustomization) {
        this.toolCustomization = toolCustomization;
        return this;
    }

    /**
     *  <p>Identifies the tool customization to remove by its tool name.</p>
     * @return toolCustomization
     */

    public com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget getToolCustomization() {
        return this.toolCustomization;
    }

    /**
     * builds McpServerRemoveToolCustomizationAction with checking for non-null required values
     * @return McpServerRemoveToolCustomizationAction
     */
    public McpServerRemoveToolCustomizationAction build() {
        Objects.requireNonNull(toolCustomization,
            McpServerRemoveToolCustomizationAction.class + ": toolCustomization is missing");
        return new McpServerRemoveToolCustomizationActionImpl(toolCustomization);
    }

    /**
     * builds McpServerRemoveToolCustomizationAction without checking for non-null required values
     * @return McpServerRemoveToolCustomizationAction
     */
    public McpServerRemoveToolCustomizationAction buildUnchecked() {
        return new McpServerRemoveToolCustomizationActionImpl(toolCustomization);
    }

    /**
     * factory method for an instance of McpServerRemoveToolCustomizationActionBuilder
     * @return builder
     */
    public static McpServerRemoveToolCustomizationActionBuilder of() {
        return new McpServerRemoveToolCustomizationActionBuilder();
    }

    /**
     * create builder for McpServerRemoveToolCustomizationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerRemoveToolCustomizationActionBuilder of(
            final McpServerRemoveToolCustomizationAction template) {
        McpServerRemoveToolCustomizationActionBuilder builder = new McpServerRemoveToolCustomizationActionBuilder();
        builder.toolCustomization = template.getToolCustomization();
        return builder;
    }

}
