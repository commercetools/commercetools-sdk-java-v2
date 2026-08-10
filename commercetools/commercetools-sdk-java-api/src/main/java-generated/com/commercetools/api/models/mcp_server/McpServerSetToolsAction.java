
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Replaces the entire list of tools enabled for the MCP Server.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setTools")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetToolsActionImpl.class)
public interface McpServerSetToolsAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetToolsAction
     */
    String SET_TOOLS = "setTools";

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @return tools
     */
    @NotNull
    @JsonProperty("tools")
    public List<McpServerTool> getTools();

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tools values to be set
     */

    @JsonIgnore
    public void setTools(final McpServerTool... tools);

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tools values to be set
     */

    public void setTools(final List<McpServerTool> tools);

    /**
     * factory method
     * @return instance of McpServerSetToolsAction
     */
    public static McpServerSetToolsAction of() {
        return new McpServerSetToolsActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetToolsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetToolsAction of(final McpServerSetToolsAction template) {
        McpServerSetToolsActionImpl instance = new McpServerSetToolsActionImpl();
        instance.setTools(template.getTools());
        return instance;
    }

    public McpServerSetToolsAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetToolsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetToolsAction deepCopy(@Nullable final McpServerSetToolsAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetToolsActionImpl instance = new McpServerSetToolsActionImpl();
        instance.setTools(Optional.ofNullable(template.getTools()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for McpServerSetToolsAction
     * @return builder
     */
    public static McpServerSetToolsActionBuilder builder() {
        return McpServerSetToolsActionBuilder.of();
    }

    /**
     * create builder for McpServerSetToolsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetToolsActionBuilder builder(final McpServerSetToolsAction template) {
        return McpServerSetToolsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetToolsAction(Function<McpServerSetToolsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetToolsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetToolsAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetToolsAction>";
            }
        };
    }
}
