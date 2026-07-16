
package com.commercetools.api.models.mcp_server;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerAddToolActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerAddToolAction mcpServerAddToolAction = McpServerAddToolAction.builder()
 *             .tool(McpServerTool.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerAddToolActionBuilder implements Builder<McpServerAddToolAction> {

    private com.commercetools.api.models.mcp_server.McpServerTool tool;

    /**
     *  <p>Name of the tool to add, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tool value to be set
     * @return Builder
     */

    public McpServerAddToolActionBuilder tool(final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
        return this;
    }

    /**
     *  <p>Name of the tool to add, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @return tool
     */

    public com.commercetools.api.models.mcp_server.McpServerTool getTool() {
        return this.tool;
    }

    /**
     * builds McpServerAddToolAction with checking for non-null required values
     * @return McpServerAddToolAction
     */
    public McpServerAddToolAction build() {
        Objects.requireNonNull(tool, McpServerAddToolAction.class + ": tool is missing");
        return new McpServerAddToolActionImpl(tool);
    }

    /**
     * builds McpServerAddToolAction without checking for non-null required values
     * @return McpServerAddToolAction
     */
    public McpServerAddToolAction buildUnchecked() {
        return new McpServerAddToolActionImpl(tool);
    }

    /**
     * factory method for an instance of McpServerAddToolActionBuilder
     * @return builder
     */
    public static McpServerAddToolActionBuilder of() {
        return new McpServerAddToolActionBuilder();
    }

    /**
     * create builder for McpServerAddToolAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerAddToolActionBuilder of(final McpServerAddToolAction template) {
        McpServerAddToolActionBuilder builder = new McpServerAddToolActionBuilder();
        builder.tool = template.getTool();
        return builder;
    }

}
