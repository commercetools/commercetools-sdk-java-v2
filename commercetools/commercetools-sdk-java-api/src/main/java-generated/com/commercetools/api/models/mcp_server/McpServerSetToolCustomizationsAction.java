
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Replaces the entire list of <a href="https://docs.commercetools.com/apis/ctp:api:type:ToolCustomization" rel="nofollow">tool customizations</a> on the MCP Server.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetToolCustomizationsAction mcpServerSetToolCustomizationsAction = McpServerSetToolCustomizationsAction.builder()
 *             .plusToolCustomizations(toolCustomizationsBuilder -> toolCustomizationsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setToolCustomizations")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetToolCustomizationsActionImpl.class)
public interface McpServerSetToolCustomizationsAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetToolCustomizationsAction
     */
    String SET_TOOL_CUSTOMIZATIONS = "setToolCustomizations";

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @return toolCustomizations
     */
    @NotNull
    @Valid
    @JsonProperty("toolCustomizations")
    public List<ToolCustomization> getToolCustomizations();

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param toolCustomizations values to be set
     */

    @JsonIgnore
    public void setToolCustomizations(final ToolCustomization... toolCustomizations);

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     * @param toolCustomizations values to be set
     */

    public void setToolCustomizations(final List<ToolCustomization> toolCustomizations);

    /**
     * factory method
     * @return instance of McpServerSetToolCustomizationsAction
     */
    public static McpServerSetToolCustomizationsAction of() {
        return new McpServerSetToolCustomizationsActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetToolCustomizationsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetToolCustomizationsAction of(final McpServerSetToolCustomizationsAction template) {
        McpServerSetToolCustomizationsActionImpl instance = new McpServerSetToolCustomizationsActionImpl();
        instance.setToolCustomizations(template.getToolCustomizations());
        return instance;
    }

    public McpServerSetToolCustomizationsAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetToolCustomizationsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetToolCustomizationsAction deepCopy(
            @Nullable final McpServerSetToolCustomizationsAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetToolCustomizationsActionImpl instance = new McpServerSetToolCustomizationsActionImpl();
        instance.setToolCustomizations(Optional.ofNullable(template.getToolCustomizations())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.mcp_server.ToolCustomization::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for McpServerSetToolCustomizationsAction
     * @return builder
     */
    public static McpServerSetToolCustomizationsActionBuilder builder() {
        return McpServerSetToolCustomizationsActionBuilder.of();
    }

    /**
     * create builder for McpServerSetToolCustomizationsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetToolCustomizationsActionBuilder builder(
            final McpServerSetToolCustomizationsAction template) {
        return McpServerSetToolCustomizationsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetToolCustomizationsAction(Function<McpServerSetToolCustomizationsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetToolCustomizationsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetToolCustomizationsAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetToolCustomizationsAction>";
            }
        };
    }
}
