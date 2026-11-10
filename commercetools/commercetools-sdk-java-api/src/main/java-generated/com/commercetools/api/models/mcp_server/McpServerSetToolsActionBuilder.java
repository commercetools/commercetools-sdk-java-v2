
package com.commercetools.api.models.mcp_server;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * McpServerSetToolsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetToolsAction mcpServerSetToolsAction = McpServerSetToolsAction.builder()
 *             .plusTools(toolsBuilder -> toolsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetToolsActionBuilder implements Builder<McpServerSetToolsAction> {

    private java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> tools;

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tools value to be set
     * @return Builder
     */

    public McpServerSetToolsActionBuilder tools(final com.commercetools.api.models.mcp_server.McpServerTool... tools) {
        this.tools = new ArrayList<>(Arrays.asList(tools));
        return this;
    }

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tools value to be set
     * @return Builder
     */

    public McpServerSetToolsActionBuilder tools(
            final java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> tools) {
        this.tools = tools;
        return this;
    }

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tools value to be set
     * @return Builder
     */

    public McpServerSetToolsActionBuilder plusTools(
            final com.commercetools.api.models.mcp_server.McpServerTool... tools) {
        if (this.tools == null) {
            this.tools = new ArrayList<>();
        }
        this.tools.addAll(Arrays.asList(tools));
        return this;
    }

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @return tools
     */

    public java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> getTools() {
        return this.tools;
    }

    /**
     * builds McpServerSetToolsAction with checking for non-null required values
     * @return McpServerSetToolsAction
     */
    public McpServerSetToolsAction build() {
        Objects.requireNonNull(tools, McpServerSetToolsAction.class + ": tools is missing");
        return new McpServerSetToolsActionImpl(tools);
    }

    /**
     * builds McpServerSetToolsAction without checking for non-null required values
     * @return McpServerSetToolsAction
     */
    public McpServerSetToolsAction buildUnchecked() {
        return new McpServerSetToolsActionImpl(tools);
    }

    /**
     * factory method for an instance of McpServerSetToolsActionBuilder
     * @return builder
     */
    public static McpServerSetToolsActionBuilder of() {
        return new McpServerSetToolsActionBuilder();
    }

    /**
     * create builder for McpServerSetToolsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetToolsActionBuilder of(final McpServerSetToolsAction template) {
        McpServerSetToolsActionBuilder builder = new McpServerSetToolsActionBuilder();
        builder.tools = template.getTools();
        return builder;
    }

}
