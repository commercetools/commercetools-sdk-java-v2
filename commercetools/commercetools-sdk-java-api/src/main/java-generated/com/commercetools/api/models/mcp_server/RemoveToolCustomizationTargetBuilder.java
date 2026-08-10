
package com.commercetools.api.models.mcp_server;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveToolCustomizationTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveToolCustomizationTarget removeToolCustomizationTarget = RemoveToolCustomizationTarget.builder()
 *             .tool(McpServerTool.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveToolCustomizationTargetBuilder implements Builder<RemoveToolCustomizationTarget> {

    private com.commercetools.api.models.mcp_server.McpServerTool tool;

    /**
     *  <p>Name of the tool whose customization is removed.</p>
     * @param tool value to be set
     * @return Builder
     */

    public RemoveToolCustomizationTargetBuilder tool(final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
        return this;
    }

    /**
     *  <p>Name of the tool whose customization is removed.</p>
     * @return tool
     */

    public com.commercetools.api.models.mcp_server.McpServerTool getTool() {
        return this.tool;
    }

    /**
     * builds RemoveToolCustomizationTarget with checking for non-null required values
     * @return RemoveToolCustomizationTarget
     */
    public RemoveToolCustomizationTarget build() {
        Objects.requireNonNull(tool, RemoveToolCustomizationTarget.class + ": tool is missing");
        return new RemoveToolCustomizationTargetImpl(tool);
    }

    /**
     * builds RemoveToolCustomizationTarget without checking for non-null required values
     * @return RemoveToolCustomizationTarget
     */
    public RemoveToolCustomizationTarget buildUnchecked() {
        return new RemoveToolCustomizationTargetImpl(tool);
    }

    /**
     * factory method for an instance of RemoveToolCustomizationTargetBuilder
     * @return builder
     */
    public static RemoveToolCustomizationTargetBuilder of() {
        return new RemoveToolCustomizationTargetBuilder();
    }

    /**
     * create builder for RemoveToolCustomizationTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveToolCustomizationTargetBuilder of(final RemoveToolCustomizationTarget template) {
        RemoveToolCustomizationTargetBuilder builder = new RemoveToolCustomizationTargetBuilder();
        builder.tool = template.getTool();
        return builder;
    }

}
