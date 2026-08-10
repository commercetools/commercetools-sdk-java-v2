
package com.commercetools.api.models.mcp_server;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerRemoveToolActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerRemoveToolAction mcpServerRemoveToolAction = McpServerRemoveToolAction.builder()
 *             .tool(McpServerTool.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerRemoveToolActionBuilder implements Builder<McpServerRemoveToolAction> {

    private com.commercetools.api.models.mcp_server.McpServerTool tool;

    /**
     *  <p>Name of the tool to remove, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tool value to be set
     * @return Builder
     */

    public McpServerRemoveToolActionBuilder tool(final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
        return this;
    }

    /**
     *  <p>Name of the tool to remove, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @return tool
     */

    public com.commercetools.api.models.mcp_server.McpServerTool getTool() {
        return this.tool;
    }

    /**
     * builds McpServerRemoveToolAction with checking for non-null required values
     * @return McpServerRemoveToolAction
     */
    public McpServerRemoveToolAction build() {
        Objects.requireNonNull(tool, McpServerRemoveToolAction.class + ": tool is missing");
        return new McpServerRemoveToolActionImpl(tool);
    }

    /**
     * builds McpServerRemoveToolAction without checking for non-null required values
     * @return McpServerRemoveToolAction
     */
    public McpServerRemoveToolAction buildUnchecked() {
        return new McpServerRemoveToolActionImpl(tool);
    }

    /**
     * factory method for an instance of McpServerRemoveToolActionBuilder
     * @return builder
     */
    public static McpServerRemoveToolActionBuilder of() {
        return new McpServerRemoveToolActionBuilder();
    }

    /**
     * create builder for McpServerRemoveToolAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerRemoveToolActionBuilder of(final McpServerRemoveToolAction template) {
        McpServerRemoveToolActionBuilder builder = new McpServerRemoveToolActionBuilder();
        builder.tool = template.getTool();
        return builder;
    }

}
