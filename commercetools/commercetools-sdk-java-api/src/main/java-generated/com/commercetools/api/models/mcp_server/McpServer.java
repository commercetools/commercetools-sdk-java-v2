
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Represents an MCP Server configuration that exposes a set of tools to AI agents via the Model Context Protocol.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     McpServer mcpServer = McpServer.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .state(McpServerState.ENABLED)
 *             .mcpServer(mcpServerBuilder -> mcpServerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = McpServerImpl.class)
public interface McpServer extends BaseResource {

    /**
     *  <p>Unique identifier of the MCP Server.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the MCP Server.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the MCP Server was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the MCP Server was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the MCP Server.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the MCP Server.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the MCP Server within a Project.</p>
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
     *  <p>State of the MCP Server. A <code>Disabled</code> MCP Server rejects all AI agent tool requests.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public McpServerState getState();

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @return mcpServer
     */
    @NotNull
    @Valid
    @JsonProperty("mcpServer")
    public McpServerConfig getMcpServer();

    /**
     *  <p>Unique identifier of the MCP Server.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the MCP Server.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the MCP Server was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the MCP Server was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the MCP Server.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the MCP Server.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the MCP Server within a Project.</p>
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
     *  <p>State of the MCP Server. A <code>Disabled</code> MCP Server rejects all AI agent tool requests.</p>
     * @param state value to be set
     */

    public void setState(final McpServerState state);

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     * @param mcpServer value to be set
     */

    public void setMcpServer(final McpServerConfig mcpServer);

    /**
     * factory method
     * @return instance of McpServer
     */
    public static McpServer of() {
        return new McpServerImpl();
    }

    /**
     * factory method to create a shallow copy McpServer
     * @param template instance to be copied
     * @return copy instance
     */
    public static McpServer of(final McpServer template) {
        McpServerImpl instance = new McpServerImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setState(template.getState());
        instance.setMcpServer(template.getMcpServer());
        return instance;
    }

    public McpServer copyDeep();

    /**
     * factory method to create a deep copy of McpServer
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static McpServer deepCopy(@Nullable final McpServer template) {
        if (template == null) {
            return null;
        }
        McpServerImpl instance = new McpServerImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setState(template.getState());
        instance.setMcpServer(
            com.commercetools.api.models.mcp_server.McpServerConfig.deepCopy(template.getMcpServer()));
        return instance;
    }

    /**
     * builder factory method for McpServer
     * @return builder
     */
    public static McpServerBuilder builder() {
        return McpServerBuilder.of();
    }

    /**
     * create builder for McpServer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static McpServerBuilder builder(final McpServer template) {
        return McpServerBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMcpServer(Function<McpServer, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<McpServer> typeReference() {
        return new tools.jackson.core.type.TypeReference<McpServer>() {
            @Override
            public String toString() {
                return "TypeReference<McpServer>";
            }
        };
    }
}
