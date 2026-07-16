
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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerState" rel="nofollow">state</a> of the MCP Server. A <code>Disabled</code> MCP Server rejects all AI agent tool requests.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetStateActionImpl implements McpServerSetStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.mcp_server.McpServerState state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerSetStateActionImpl(
            @JsonProperty("state") final com.commercetools.api.models.mcp_server.McpServerState state) {
        this.state = state;
        this.action = SET_STATE;
    }

    /**
     * create empty instance
     */
    public McpServerSetStateActionImpl() {
        this.action = SET_STATE;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New state to set.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerState getState() {
        return this.state;
    }

    public void setState(final com.commercetools.api.models.mcp_server.McpServerState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerSetStateActionImpl that = (McpServerSetStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(state, that.state)
                .append(action, that.action)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(state).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("state", state)
                .build();
    }

    @Override
    public McpServerSetStateAction copyDeep() {
        return McpServerSetStateAction.deepCopy(this);
    }
}
