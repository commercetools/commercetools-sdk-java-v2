
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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerAuthenticationMode" rel="nofollow">authentication mode</a> of the MCP Server. This action has no effect if the MCP Server already uses the given authentication mode, and in that case the <code>version</code> of the MCP Server stays the same.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetAuthenticationModeActionImpl implements McpServerSetAuthenticationModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerSetAuthenticationModeActionImpl(
            @JsonProperty("authenticationMode") final com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        this.action = SET_AUTHENTICATION_MODE;
    }

    /**
     * create empty instance
     */
    public McpServerSetAuthenticationModeActionImpl() {
        this.action = SET_AUTHENTICATION_MODE;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New authentication mode to set.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerAuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    public void setAuthenticationMode(
            final com.commercetools.api.models.mcp_server.McpServerAuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerSetAuthenticationModeActionImpl that = (McpServerSetAuthenticationModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(authenticationMode, that.authenticationMode)
                .append(action, that.action)
                .append(authenticationMode, that.authenticationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(authenticationMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("authenticationMode", authenticationMode)
                .build();
    }

    @Override
    public McpServerSetAuthenticationModeAction copyDeep() {
        return McpServerSetAuthenticationModeAction.deepCopy(this);
    }
}
