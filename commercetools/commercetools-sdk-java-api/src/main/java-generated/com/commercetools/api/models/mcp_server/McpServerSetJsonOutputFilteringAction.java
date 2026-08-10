
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerJsonOutputFiltering" rel="nofollow">response field-filtering rules</a> applied to tool responses.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetJsonOutputFilteringAction mcpServerSetJsonOutputFilteringAction = McpServerSetJsonOutputFilteringAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setJsonOutputFiltering")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetJsonOutputFilteringActionImpl.class)
public interface McpServerSetJsonOutputFilteringAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetJsonOutputFilteringAction
     */
    String SET_JSON_OUTPUT_FILTERING = "setJsonOutputFiltering";

    /**
     *  <p>Value to set. The existing configuration is entirely replaced with this value. If absent, the existing filtering configuration is removed.</p>
     * @return jsonOutputFiltering
     */
    @Valid
    @JsonProperty("jsonOutputFiltering")
    public McpServerJsonOutputFiltering getJsonOutputFiltering();

    /**
     *  <p>Value to set. The existing configuration is entirely replaced with this value. If absent, the existing filtering configuration is removed.</p>
     * @param jsonOutputFiltering value to be set
     */

    public void setJsonOutputFiltering(final McpServerJsonOutputFiltering jsonOutputFiltering);

    /**
     * factory method
     * @return instance of McpServerSetJsonOutputFilteringAction
     */
    public static McpServerSetJsonOutputFilteringAction of() {
        return new McpServerSetJsonOutputFilteringActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetJsonOutputFilteringAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetJsonOutputFilteringAction of(final McpServerSetJsonOutputFilteringAction template) {
        McpServerSetJsonOutputFilteringActionImpl instance = new McpServerSetJsonOutputFilteringActionImpl();
        instance.setJsonOutputFiltering(template.getJsonOutputFiltering());
        return instance;
    }

    public McpServerSetJsonOutputFilteringAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetJsonOutputFilteringAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetJsonOutputFilteringAction deepCopy(
            @Nullable final McpServerSetJsonOutputFilteringAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetJsonOutputFilteringActionImpl instance = new McpServerSetJsonOutputFilteringActionImpl();
        instance.setJsonOutputFiltering(com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering
                .deepCopy(template.getJsonOutputFiltering()));
        return instance;
    }

    /**
     * builder factory method for McpServerSetJsonOutputFilteringAction
     * @return builder
     */
    public static McpServerSetJsonOutputFilteringActionBuilder builder() {
        return McpServerSetJsonOutputFilteringActionBuilder.of();
    }

    /**
     * create builder for McpServerSetJsonOutputFilteringAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetJsonOutputFilteringActionBuilder builder(
            final McpServerSetJsonOutputFilteringAction template) {
        return McpServerSetJsonOutputFilteringActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetJsonOutputFilteringAction(Function<McpServerSetJsonOutputFilteringAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetJsonOutputFilteringAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetJsonOutputFilteringAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetJsonOutputFilteringAction>";
            }
        };
    }
}
