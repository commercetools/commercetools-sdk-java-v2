
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
 *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:ToolCustomization" rel="nofollow">tool customization</a> to remove by its tool name.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveToolCustomizationTarget removeToolCustomizationTarget = RemoveToolCustomizationTarget.builder()
 *             .tool(McpServerTool.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveToolCustomizationTargetImpl.class)
public interface RemoveToolCustomizationTarget {

    /**
     *  <p>Name of the tool whose customization is removed.</p>
     * @return tool
     */
    @NotNull
    @JsonProperty("tool")
    public McpServerTool getTool();

    /**
     *  <p>Name of the tool whose customization is removed.</p>
     * @param tool value to be set
     */

    public void setTool(final McpServerTool tool);

    /**
     * factory method
     * @return instance of RemoveToolCustomizationTarget
     */
    public static RemoveToolCustomizationTarget of() {
        return new RemoveToolCustomizationTargetImpl();
    }

    /**
     * factory method to create a shallow copy RemoveToolCustomizationTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveToolCustomizationTarget of(final RemoveToolCustomizationTarget template) {
        RemoveToolCustomizationTargetImpl instance = new RemoveToolCustomizationTargetImpl();
        instance.setTool(template.getTool());
        return instance;
    }

    public RemoveToolCustomizationTarget copyDeep();

    /**
     * factory method to create a deep copy of RemoveToolCustomizationTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveToolCustomizationTarget deepCopy(@Nullable final RemoveToolCustomizationTarget template) {
        if (template == null) {
            return null;
        }
        RemoveToolCustomizationTargetImpl instance = new RemoveToolCustomizationTargetImpl();
        instance.setTool(template.getTool());
        return instance;
    }

    /**
     * builder factory method for RemoveToolCustomizationTarget
     * @return builder
     */
    public static RemoveToolCustomizationTargetBuilder builder() {
        return RemoveToolCustomizationTargetBuilder.of();
    }

    /**
     * create builder for RemoveToolCustomizationTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveToolCustomizationTargetBuilder builder(final RemoveToolCustomizationTarget template) {
        return RemoveToolCustomizationTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveToolCustomizationTarget(Function<RemoveToolCustomizationTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RemoveToolCustomizationTarget> typeReference() {
        return new tools.jackson.core.type.TypeReference<RemoveToolCustomizationTarget>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveToolCustomizationTarget>";
            }
        };
    }
}
