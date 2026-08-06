
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Draft representation for creating a new MCP Server.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServerDraft mcpServerDraft = McpServerDraft.builder()
 *             .key("{key}")
 *             .mcpServer(mcpServerBuilder -> mcpServerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerDraftImpl.class)
public interface McpServerDraft extends io.vrap.rmf.base.client.Draft<McpServerDraft> {

    /**
     *  <p>User-defined unique identifier for the MCP Server. Must be unique within the Project.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the MCP Server.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the MCP Server.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Determines how AI agents authenticate when connecting to the MCP Server.</p>
     * @return authenticationMode
     */

    @JsonProperty("authenticationMode")
    public McpServerAuthenticationMode getAuthenticationMode();

    /**
     *  <p>State of the MCP Server.</p>
     * @return state
     */

    @JsonProperty("state")
    public McpServerState getState();

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @return mcpServer
     */
    @NotNull
    @Valid
    @JsonProperty("mcpServer")
    public McpServerConfigDraft getMcpServer();

    /**
     *  <p>User-defined unique identifier for the MCP Server. Must be unique within the Project.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the MCP Server.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the MCP Server.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Determines how AI agents authenticate when connecting to the MCP Server.</p>
     * @param authenticationMode value to be set
     */

    public void setAuthenticationMode(final McpServerAuthenticationMode authenticationMode);

    /**
     *  <p>State of the MCP Server.</p>
     * @param state value to be set
     */

    public void setState(final McpServerState state);

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @param mcpServer value to be set
     */

    public void setMcpServer(final McpServerConfigDraft mcpServer);

    /**
     * factory method
     * @return instance of McpServerDraft
     */
    public static McpServerDraft of() {
        return new McpServerDraftImpl();
    }

    /**
     * factory method to create a shallow copy McpServerDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServerDraft of(final McpServerDraft template) {
        McpServerDraftImpl instance = new McpServerDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        instance.setState(template.getState());
        instance.setMcpServer(template.getMcpServer());
        return instance;
    }

    public McpServerDraft copyDeep();

    /**
     * factory method to create a deep copy of McpServerDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServerDraft deepCopy(@Nullable final McpServerDraft template) {
        if (template == null) {
            return null;
        }
        McpServerDraftImpl instance = new McpServerDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setAuthenticationMode(template.getAuthenticationMode());
        instance.setState(template.getState());
        instance.setMcpServer(
            com.commercetools.api.models.mcp_server.McpServerConfigDraft.deepCopy(template.getMcpServer()));
        return instance;
    }

    /**
     * builder factory method for McpServerDraft
     * @return builder
     */
    public static McpServerDraftBuilder builder() {
        return McpServerDraftBuilder.of();
    }

    /**
     * create builder for McpServerDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerDraftBuilder builder(final McpServerDraft template) {
        return McpServerDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServerDraft(Function<McpServerDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServerDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServerDraft>() {
            @Override
            public String toString() {
                return "TypeReference<McpServerDraft>";
            }
        };
    }
}
