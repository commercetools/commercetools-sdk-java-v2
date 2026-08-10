
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
 *  <p>Customization applied to a single tool at <code>tools/list</code> and <code>tools/call</code> time. At least one of <code>description</code> or a non-empty <code>parameters</code> list must be present; a customization with neither has no effect and is rejected. Parameter names within <code>parameters</code> must be unique.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ToolCustomization toolCustomization = ToolCustomization.builder()
 *             .tool(McpServerTool.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ToolCustomizationImpl.class)
public interface ToolCustomization {

    /**
     *  <p>Name of the tool to customize, such as <code>read_products</code> or <code>create_orders</code>. Must be one of the tools enabled on the MCP Server.</p>
     * @return tool
     */
    @NotNull
    @JsonProperty("tool")
    public McpServerTool getTool();

    /**
     *  <p>Replacement description for the tool, shown to the AI agent.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @return parameters
     */
    @Valid
    @JsonProperty("parameters")
    public List<ParameterOverride> getParameters();

    /**
     *  <p>Name of the tool to customize, such as <code>read_products</code> or <code>create_orders</code>. Must be one of the tools enabled on the MCP Server.</p>
     * @param tool value to be set
     */

    public void setTool(final McpServerTool tool);

    /**
     *  <p>Replacement description for the tool, shown to the AI agent.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param parameters values to be set
     */

    @JsonIgnore
    public void setParameters(final ParameterOverride... parameters);

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     * @param parameters values to be set
     */

    public void setParameters(final List<ParameterOverride> parameters);

    /**
     * factory method
     * @return instance of ToolCustomization
     */
    public static ToolCustomization of() {
        return new ToolCustomizationImpl();
    }

    /**
     * factory method to create a shallow copy ToolCustomization
     * @param template instance to be copied
     * @return copy instance
     */
    public static ToolCustomization of(final ToolCustomization template) {
        ToolCustomizationImpl instance = new ToolCustomizationImpl();
        instance.setTool(template.getTool());
        instance.setDescription(template.getDescription());
        instance.setParameters(template.getParameters());
        return instance;
    }

    public ToolCustomization copyDeep();

    /**
     * factory method to create a deep copy of ToolCustomization
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ToolCustomization deepCopy(@Nullable final ToolCustomization template) {
        if (template == null) {
            return null;
        }
        ToolCustomizationImpl instance = new ToolCustomizationImpl();
        instance.setTool(template.getTool());
        instance.setDescription(template.getDescription());
        instance.setParameters(Optional.ofNullable(template.getParameters())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.mcp_server.ParameterOverride::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ToolCustomization
     * @return builder
     */
    public static ToolCustomizationBuilder builder() {
        return ToolCustomizationBuilder.of();
    }

    /**
     * create builder for ToolCustomization instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ToolCustomizationBuilder builder(final ToolCustomization template) {
        return ToolCustomizationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withToolCustomization(Function<ToolCustomization, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ToolCustomization> typeReference() {
        return new tools.jackson.core.type.TypeReference<ToolCustomization>() {
            @Override
            public String toString() {
                return "TypeReference<ToolCustomization>";
            }
        };
    }
}
