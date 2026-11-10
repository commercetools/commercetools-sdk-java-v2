
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
 *  <p>Adds a single tool to the MCP Server's list of enabled tools. Has no effect if the tool is already present.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("addTool")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerAddToolActionImpl.class)
public interface McpServerAddToolAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerAddToolAction
     */
    String ADD_TOOL = "addTool";

    /**
     *  <p>Name of the tool to add, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @return tool
     */
    @NotNull
    @JsonProperty("tool")
    public McpServerTool getTool();

    /**
     *  <p>Name of the tool to add, such as <code>read_products</code> or <code>create_orders</code>.</p>
     * @param tool value to be set
     */

    public void setTool(final McpServerTool tool);

    /**
     * factory method
     * @return instance of McpServerAddToolAction
     */
    public static McpServerAddToolAction of() {
        return new McpServerAddToolActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerAddToolAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerAddToolAction of(final McpServerAddToolAction template) {
        McpServerAddToolActionImpl instance = new McpServerAddToolActionImpl();
        instance.setTool(template.getTool());
        return instance;
    }

    public McpServerAddToolAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerAddToolAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerAddToolAction deepCopy(@Nullable final McpServerAddToolAction template) {
        if (template == null) {
            return null;
        }
        McpServerAddToolActionImpl instance = new McpServerAddToolActionImpl();
        instance.setTool(template.getTool());
        return instance;
    }

    /**
     * builder factory method for McpServerAddToolAction
     * @return builder
     */
    public static McpServerAddToolActionBuilder builder() {
        return McpServerAddToolActionBuilder.of();
    }

    /**
     * create builder for McpServerAddToolAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerAddToolActionBuilder builder(final McpServerAddToolAction template) {
        return McpServerAddToolActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerAddToolAction(Function<McpServerAddToolAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerAddToolAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerAddToolAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerAddToolAction>";
            }
        };
    }
}
