
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerToolOutputFormatting" rel="nofollow">output formatting</a> applied to tool responses.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetToolOutputFormattingAction mcpServerSetToolOutputFormattingAction = McpServerSetToolOutputFormattingAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setToolOutputFormatting")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetToolOutputFormattingActionImpl.class)
public interface McpServerSetToolOutputFormattingAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetToolOutputFormattingAction
     */
    String SET_TOOL_OUTPUT_FORMATTING = "setToolOutputFormatting";

    /**
     *  <p>Value to set. If absent, the existing formatting is removed.</p>
     * @return toolOutputFormatting
     */

    @JsonProperty("toolOutputFormatting")
    public McpServerToolOutputFormatting getToolOutputFormatting();

    /**
     *  <p>Value to set. If absent, the existing formatting is removed.</p>
     * @param toolOutputFormatting value to be set
     */

    public void setToolOutputFormatting(final McpServerToolOutputFormatting toolOutputFormatting);

    /**
     * factory method
     * @return instance of McpServerSetToolOutputFormattingAction
     */
    public static McpServerSetToolOutputFormattingAction of() {
        return new McpServerSetToolOutputFormattingActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetToolOutputFormattingAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetToolOutputFormattingAction of(final McpServerSetToolOutputFormattingAction template) {
        McpServerSetToolOutputFormattingActionImpl instance = new McpServerSetToolOutputFormattingActionImpl();
        instance.setToolOutputFormatting(template.getToolOutputFormatting());
        return instance;
    }

    public McpServerSetToolOutputFormattingAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetToolOutputFormattingAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetToolOutputFormattingAction deepCopy(
            @Nullable final McpServerSetToolOutputFormattingAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetToolOutputFormattingActionImpl instance = new McpServerSetToolOutputFormattingActionImpl();
        instance.setToolOutputFormatting(template.getToolOutputFormatting());
        return instance;
    }

    /**
     * builder factory method for McpServerSetToolOutputFormattingAction
     * @return builder
     */
    public static McpServerSetToolOutputFormattingActionBuilder builder() {
        return McpServerSetToolOutputFormattingActionBuilder.of();
    }

    /**
     * create builder for McpServerSetToolOutputFormattingAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetToolOutputFormattingActionBuilder builder(
            final McpServerSetToolOutputFormattingAction template) {
        return McpServerSetToolOutputFormattingActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetToolOutputFormattingAction(
            Function<McpServerSetToolOutputFormattingAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetToolOutputFormattingAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetToolOutputFormattingAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetToolOutputFormattingAction>";
            }
        };
    }
}
