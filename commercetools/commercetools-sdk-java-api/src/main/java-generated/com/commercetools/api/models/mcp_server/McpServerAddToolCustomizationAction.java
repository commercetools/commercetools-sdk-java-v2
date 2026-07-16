
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Adds a single <a href="https://docs.commercetools.com/apis/ctp:api:type:ToolCustomization" rel="nofollow">tool customization</a> to the MCP Server. Returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error if a customization for the same tool already exists.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerAddToolCustomizationAction mcpServerAddToolCustomizationAction = McpServerAddToolCustomizationAction.builder()
 *             .toolCustomization(toolCustomizationBuilder -> toolCustomizationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addToolCustomization")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerAddToolCustomizationActionImpl.class)
public interface McpServerAddToolCustomizationAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerAddToolCustomizationAction
     */
    String ADD_TOOL_CUSTOMIZATION = "addToolCustomization";

    /**
     *  <p>Tool customization to add.</p>
     * @return toolCustomization
     */
    @NotNull
    @Valid
    @JsonProperty("toolCustomization")
    public ToolCustomization getToolCustomization();

    /**
     *  <p>Tool customization to add.</p>
     * @param toolCustomization value to be set
     */

    public void setToolCustomization(final ToolCustomization toolCustomization);

    /**
     * factory method
     * @return instance of McpServerAddToolCustomizationAction
     */
    public static McpServerAddToolCustomizationAction of() {
        return new McpServerAddToolCustomizationActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerAddToolCustomizationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerAddToolCustomizationAction of(final McpServerAddToolCustomizationAction template) {
        McpServerAddToolCustomizationActionImpl instance = new McpServerAddToolCustomizationActionImpl();
        instance.setToolCustomization(template.getToolCustomization());
        return instance;
    }

    public McpServerAddToolCustomizationAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerAddToolCustomizationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerAddToolCustomizationAction deepCopy(
            @Nullable final McpServerAddToolCustomizationAction template) {
        if (template == null) {
            return null;
        }
        McpServerAddToolCustomizationActionImpl instance = new McpServerAddToolCustomizationActionImpl();
        instance.setToolCustomization(
            com.commercetools.api.models.mcp_server.ToolCustomization.deepCopy(template.getToolCustomization()));
        return instance;
    }

    /**
     * builder factory method for McpServerAddToolCustomizationAction
     * @return builder
     */
    public static McpServerAddToolCustomizationActionBuilder builder() {
        return McpServerAddToolCustomizationActionBuilder.of();
    }

    /**
     * create builder for McpServerAddToolCustomizationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerAddToolCustomizationActionBuilder builder(
            final McpServerAddToolCustomizationAction template) {
        return McpServerAddToolCustomizationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerAddToolCustomizationAction(Function<McpServerAddToolCustomizationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerAddToolCustomizationAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerAddToolCustomizationAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerAddToolCustomizationAction>";
            }
        };
    }
}
