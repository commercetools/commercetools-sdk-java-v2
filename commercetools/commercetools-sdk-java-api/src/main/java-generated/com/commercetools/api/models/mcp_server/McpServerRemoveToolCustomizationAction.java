
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
 *  <p>Removes the <a href="https://docs.commercetools.com/apis/ctp:api:type:ToolCustomization" rel="nofollow">tool customization</a> matching the given tool name. Has no effect if no customization exists for that tool.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerRemoveToolCustomizationAction mcpServerRemoveToolCustomizationAction = McpServerRemoveToolCustomizationAction.builder()
 *             .toolCustomization(toolCustomizationBuilder -> toolCustomizationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeToolCustomization")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerRemoveToolCustomizationActionImpl.class)
public interface McpServerRemoveToolCustomizationAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerRemoveToolCustomizationAction
     */
    String REMOVE_TOOL_CUSTOMIZATION = "removeToolCustomization";

    /**
     *  <p>Identifies the tool customization to remove by its tool name.</p>
     * @return toolCustomization
     */
    @NotNull
    @Valid
    @JsonProperty("toolCustomization")
    public RemoveToolCustomizationTarget getToolCustomization();

    /**
     *  <p>Identifies the tool customization to remove by its tool name.</p>
     * @param toolCustomization value to be set
     */

    public void setToolCustomization(final RemoveToolCustomizationTarget toolCustomization);

    /**
     * factory method
     * @return instance of McpServerRemoveToolCustomizationAction
     */
    public static McpServerRemoveToolCustomizationAction of() {
        return new McpServerRemoveToolCustomizationActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerRemoveToolCustomizationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerRemoveToolCustomizationAction of(final McpServerRemoveToolCustomizationAction template) {
        McpServerRemoveToolCustomizationActionImpl instance = new McpServerRemoveToolCustomizationActionImpl();
        instance.setToolCustomization(template.getToolCustomization());
        return instance;
    }

    public McpServerRemoveToolCustomizationAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerRemoveToolCustomizationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerRemoveToolCustomizationAction deepCopy(
            @Nullable final McpServerRemoveToolCustomizationAction template) {
        if (template == null) {
            return null;
        }
        McpServerRemoveToolCustomizationActionImpl instance = new McpServerRemoveToolCustomizationActionImpl();
        instance.setToolCustomization(com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget
                .deepCopy(template.getToolCustomization()));
        return instance;
    }

    /**
     * builder factory method for McpServerRemoveToolCustomizationAction
     * @return builder
     */
    public static McpServerRemoveToolCustomizationActionBuilder builder() {
        return McpServerRemoveToolCustomizationActionBuilder.of();
    }

    /**
     * create builder for McpServerRemoveToolCustomizationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerRemoveToolCustomizationActionBuilder builder(
            final McpServerRemoveToolCustomizationAction template) {
        return McpServerRemoveToolCustomizationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerRemoveToolCustomizationAction(
            Function<McpServerRemoveToolCustomizationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerRemoveToolCustomizationAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerRemoveToolCustomizationAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerRemoveToolCustomizationAction>";
            }
        };
    }
}
