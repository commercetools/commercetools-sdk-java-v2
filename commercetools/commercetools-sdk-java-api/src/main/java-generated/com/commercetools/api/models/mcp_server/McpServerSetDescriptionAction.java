
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
 *  <p>Sets the localized description of the MCP Server.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetDescriptionAction mcpServerSetDescriptionAction = McpServerSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetDescriptionActionImpl.class)
public interface McpServerSetDescriptionAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If omitted, the existing description is removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If omitted, the existing description is removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of McpServerSetDescriptionAction
     */
    public static McpServerSetDescriptionAction of() {
        return new McpServerSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetDescriptionAction of(final McpServerSetDescriptionAction template) {
        McpServerSetDescriptionActionImpl instance = new McpServerSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public McpServerSetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetDescriptionAction deepCopy(@Nullable final McpServerSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetDescriptionActionImpl instance = new McpServerSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for McpServerSetDescriptionAction
     * @return builder
     */
    public static McpServerSetDescriptionActionBuilder builder() {
        return McpServerSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for McpServerSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetDescriptionActionBuilder builder(final McpServerSetDescriptionAction template) {
        return McpServerSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetDescriptionAction(Function<McpServerSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetDescriptionAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetDescriptionAction>";
            }
        };
    }
}
