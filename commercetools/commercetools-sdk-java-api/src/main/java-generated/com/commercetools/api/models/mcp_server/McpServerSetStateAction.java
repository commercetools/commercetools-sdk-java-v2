
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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerState" rel="nofollow">state</a> of the MCP Server. A <code>Disabled</code> MCP Server rejects all AI agent tool requests.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetStateAction mcpServerSetStateAction = McpServerSetStateAction.builder()
 *             .state(McpServerState.ENABLED)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetStateActionImpl.class)
public interface McpServerSetStateAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetStateAction
     */
    String SET_STATE = "setState";

    /**
     *  <p>New state to set.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public McpServerState getState();

    /**
     *  <p>New state to set.</p>
     * @param state value to be set
     */

    public void setState(final McpServerState state);

    /**
     * factory method
     * @return instance of McpServerSetStateAction
     */
    public static McpServerSetStateAction of() {
        return new McpServerSetStateActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetStateAction of(final McpServerSetStateAction template) {
        McpServerSetStateActionImpl instance = new McpServerSetStateActionImpl();
        instance.setState(template.getState());
        return instance;
    }

    public McpServerSetStateAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetStateAction deepCopy(@Nullable final McpServerSetStateAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetStateActionImpl instance = new McpServerSetStateActionImpl();
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for McpServerSetStateAction
     * @return builder
     */
    public static McpServerSetStateActionBuilder builder() {
        return McpServerSetStateActionBuilder.of();
    }

    /**
     * create builder for McpServerSetStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetStateActionBuilder builder(final McpServerSetStateAction template) {
        return McpServerSetStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetStateAction(Function<McpServerSetStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetStateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetStateAction>";
            }
        };
    }
}
