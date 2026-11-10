
package com.commercetools.api.models.mcp_server;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerAddToolCustomizationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerAddToolCustomizationAction mcpServerAddToolCustomizationAction = McpServerAddToolCustomizationAction.builder()
 *             .toolCustomization(toolCustomizationBuilder -> toolCustomizationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerAddToolCustomizationActionBuilder implements Builder<McpServerAddToolCustomizationAction> {

    private com.commercetools.api.models.mcp_server.ToolCustomization toolCustomization;

    /**
     *  <p>Tool customization to add.</p>
     * @param builder function to build the toolCustomization value
     * @return Builder
     */

    public McpServerAddToolCustomizationActionBuilder toolCustomization(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomizationBuilder> builder) {
        this.toolCustomization = builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tool customization to add.</p>
     * @param builder function to build the toolCustomization value
     * @return Builder
     */

    public McpServerAddToolCustomizationActionBuilder withToolCustomization(
            Function<com.commercetools.api.models.mcp_server.ToolCustomizationBuilder, com.commercetools.api.models.mcp_server.ToolCustomization> builder) {
        this.toolCustomization = builder.apply(com.commercetools.api.models.mcp_server.ToolCustomizationBuilder.of());
        return this;
    }

    /**
     *  <p>Tool customization to add.</p>
     * @param toolCustomization value to be set
     * @return Builder
     */

    public McpServerAddToolCustomizationActionBuilder toolCustomization(
            final com.commercetools.api.models.mcp_server.ToolCustomization toolCustomization) {
        this.toolCustomization = toolCustomization;
        return this;
    }

    /**
     *  <p>Tool customization to add.</p>
     * @return toolCustomization
     */

    public com.commercetools.api.models.mcp_server.ToolCustomization getToolCustomization() {
        return this.toolCustomization;
    }

    /**
     * builds McpServerAddToolCustomizationAction with checking for non-null required values
     * @return McpServerAddToolCustomizationAction
     */
    public McpServerAddToolCustomizationAction build() {
        Objects.requireNonNull(toolCustomization,
            McpServerAddToolCustomizationAction.class + ": toolCustomization is missing");
        return new McpServerAddToolCustomizationActionImpl(toolCustomization);
    }

    /**
     * builds McpServerAddToolCustomizationAction without checking for non-null required values
     * @return McpServerAddToolCustomizationAction
     */
    public McpServerAddToolCustomizationAction buildUnchecked() {
        return new McpServerAddToolCustomizationActionImpl(toolCustomization);
    }

    /**
     * factory method for an instance of McpServerAddToolCustomizationActionBuilder
     * @return builder
     */
    public static McpServerAddToolCustomizationActionBuilder of() {
        return new McpServerAddToolCustomizationActionBuilder();
    }

    /**
     * create builder for McpServerAddToolCustomizationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerAddToolCustomizationActionBuilder of(final McpServerAddToolCustomizationAction template) {
        McpServerAddToolCustomizationActionBuilder builder = new McpServerAddToolCustomizationActionBuilder();
        builder.toolCustomization = template.getToolCustomization();
        return builder;
    }

}
