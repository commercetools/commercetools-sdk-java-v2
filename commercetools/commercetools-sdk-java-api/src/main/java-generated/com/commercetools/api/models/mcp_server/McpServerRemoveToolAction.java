
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
 *  <p>Removes a single tool from the MCP Server's list of enabled tools. Returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error if the tool is not in the current list.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("removeTool")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerRemoveToolActionImpl.class)
public interface McpServerRemoveToolAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerRemoveToolAction
     */
    String REMOVE_TOOL = "removeTool";

    /**
     *  <p>Name of the tool to remove, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @return tool
     */
    @NotNull
    @JsonProperty("tool")
    public McpServerTool getTool();

    /**
     *  <p>Name of the tool to remove, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tool value to be set
     */

    public void setTool(final McpServerTool tool);

    /**
     * factory method
     * @return instance of McpServerRemoveToolAction
     */
    public static McpServerRemoveToolAction of() {
        return new McpServerRemoveToolActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerRemoveToolAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerRemoveToolAction of(final McpServerRemoveToolAction template) {
        McpServerRemoveToolActionImpl instance = new McpServerRemoveToolActionImpl();
        instance.setTool(template.getTool());
        return instance;
    }

    public McpServerRemoveToolAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerRemoveToolAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerRemoveToolAction deepCopy(@Nullable final McpServerRemoveToolAction template) {
        if (template == null) {
            return null;
        }
        McpServerRemoveToolActionImpl instance = new McpServerRemoveToolActionImpl();
        instance.setTool(template.getTool());
        return instance;
    }

    /**
     * builder factory method for McpServerRemoveToolAction
     * @return builder
     */
    public static McpServerRemoveToolActionBuilder builder() {
        return McpServerRemoveToolActionBuilder.of();
    }

    /**
     * create builder for McpServerRemoveToolAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerRemoveToolActionBuilder builder(final McpServerRemoveToolAction template) {
        return McpServerRemoveToolActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerRemoveToolAction(Function<McpServerRemoveToolAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerRemoveToolAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerRemoveToolAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerRemoveToolAction>";
            }
        };
    }
}
