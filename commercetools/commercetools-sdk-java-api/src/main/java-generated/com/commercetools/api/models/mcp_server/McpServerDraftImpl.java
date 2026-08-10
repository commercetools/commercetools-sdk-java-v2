
package com.commercetools.api.models.mcp_server;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Draft representation for creating a new MCP Server.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerDraftImpl implements McpServerDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode;

    private com.commercetools.api.models.mcp_server.McpServerState state;

    private com.commercetools.api.models.mcp_server.McpServerConfigDraft mcpServer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("authenticationMode") final com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode,
            @JsonProperty("state") final com.commercetools.api.models.mcp_server.McpServerState state,
            @JsonProperty("mcpServer") final com.commercetools.api.models.mcp_server.McpServerConfigDraft mcpServer) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.authenticationMode = authenticationMode;
        this.state = state;
        this.mcpServer = mcpServer;
    }

    /**
     * create empty instance
     */
    public McpServerDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the MCP Server. Must be unique within the Project.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the MCP Server.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the MCP Server.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Determines how AI agents authenticate when connecting to the MCP Server.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     *  <p>State of the MCP Server.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerState getState() {
        return this.state;
    }

    /**
     *  <p>Configuration of the MCP Server connection.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerConfigDraft getMcpServer() {
        return this.mcpServer;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setAuthenticationMode(
            final com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    public void setState(final com.commercetools.api.models.mcp_server.McpServerState state) {
        this.state = state;
    }

    public void setMcpServer(final com.commercetools.api.models.mcp_server.McpServerConfigDraft mcpServer) {
        this.mcpServer = mcpServer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerDraftImpl that = (McpServerDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(authenticationMode, that.authenticationMode)
                .append(state, that.state)
                .append(mcpServer, that.mcpServer)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(authenticationMode, that.authenticationMode)
                .append(state, that.state)
                .append(mcpServer, that.mcpServer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(description)
                .append(authenticationMode)
                .append(state)
                .append(mcpServer)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("description", description)
                .append("authenticationMode", authenticationMode)
                .append("state", state)
                .append("mcpServer", mcpServer)
                .build();
    }

    @Override
    public McpServerDraft copyDeep() {
        return McpServerDraft.deepCopy(this);
    }
}
