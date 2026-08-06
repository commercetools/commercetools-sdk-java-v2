
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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerAuthenticationMode" rel="nofollow">authentication mode</a> of the MCP Server. This action has no effect if the MCP Server already uses the given authentication mode, and in that case the <code>version</code> of the MCP Server stays the same.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerSetAuthenticationModeAction mcpServerSetAuthenticationModeAction = McpServerSetAuthenticationModeAction.builder()
 *             .authenticationMode(McpServerAuthenticationMode.CLIENT_CREDENTIALS)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAuthenticationMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerSetAuthenticationModeActionImpl.class)
public interface McpServerSetAuthenticationModeAction extends McpServerUpdateAction {

    /**
     * discriminator value for McpServerSetAuthenticationModeAction
     */
    String SET_AUTHENTICATION_MODE = "setAuthenticationMode";

    /**
     *  <p>New authentication mode to set.</p>
     * @return authenticationMode
     */
    @NotNull
    @JsonProperty("authenticationMode")
    public McpServerAuthenticationMode getAuthenticationMode();

    /**
     *  <p>New authentication mode to set.</p>
     * @param authenticationMode value to be set
     */

    public void setAuthenticationMode(final McpServerAuthenticationMode authenticationMode);

    /**
     * factory method
     * @return instance of McpServerSetAuthenticationModeAction
     */
    public static McpServerSetAuthenticationModeAction of() {
        return new McpServerSetAuthenticationModeActionImpl();
    }

    /**
     * factory method to create a shallow copy McpServerSetAuthenticationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerSetAuthenticationModeAction of(final McpServerSetAuthenticationModeAction template) {
        McpServerSetAuthenticationModeActionImpl instance = new McpServerSetAuthenticationModeActionImpl();
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    public McpServerSetAuthenticationModeAction copyDeep();

    /**
     * factory method to create a deep copy of McpServerSetAuthenticationModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerSetAuthenticationModeAction deepCopy(
            @Nullable final McpServerSetAuthenticationModeAction template) {
        if (template == null) {
            return null;
        }
        McpServerSetAuthenticationModeActionImpl instance = new McpServerSetAuthenticationModeActionImpl();
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    /**
     * builder factory method for McpServerSetAuthenticationModeAction
     * @return builder
     */
    public static McpServerSetAuthenticationModeActionBuilder builder() {
        return McpServerSetAuthenticationModeActionBuilder.of();
    }

    /**
     * create builder for McpServerSetAuthenticationModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerSetAuthenticationModeActionBuilder builder(
            final McpServerSetAuthenticationModeAction template) {
        return McpServerSetAuthenticationModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerSetAuthenticationModeAction(Function<McpServerSetAuthenticationModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerSetAuthenticationModeAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerSetAuthenticationModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerSetAuthenticationModeAction>";
            }
        };
    }
}
