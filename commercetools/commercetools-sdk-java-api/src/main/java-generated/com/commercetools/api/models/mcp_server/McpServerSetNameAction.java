
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the localized name of the MCP Server.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetNameAction mcpServerSetNameAction = McpServerSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetNameActionImpl.class)
public interface McpServerSetNameAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>Value to set. If omitted, the existing name is removed.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Value to set. If omitted, the existing name is removed.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of McpServerSetNameAction
     */
    public static McpServerSetNameAction of() {
        return new McpServerSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetNameAction of(final McpServerSetNameAction template) {
        McpServerSetNameActionImpl instance = new McpServerSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public McpServerSetNameAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetNameAction deepCopy(@Nullable final McpServerSetNameAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetNameActionImpl instance = new McpServerSetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for McpServerSetNameAction
     * @return builder
     */
    public static McpServerSetNameActionBuilder builder() {
        return McpServerSetNameActionBuilder.of();
    }

    /**
     * create builder for McpServerSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetNameActionBuilder builder(final McpServerSetNameAction template) {
        return McpServerSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetNameAction(Function<McpServerSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetNameAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetNameAction>";
            }
        };
    }
}
