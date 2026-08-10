
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
 *  <p>Replaces the entire list of tools enabled for the MCP Server.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetToolsActionImpl implements McpServerSetToolsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> tools;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerSetToolsActionImpl(
            @JsonProperty("tools") final java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> tools) {
        this.tools = tools;
        this.action = SET_TOOLS;
    }

    /**
     * create empty instance
     */
    public McpServerSetToolsActionImpl() {
        this.action = SET_TOOLS;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New list of tools to set. Replaces the existing <code>tools</code> list entirely. Use <code>all</code> to enable all available tools, or specify individual tool names such as <code>read_products</code> or <code>create_orders</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> getTools() {
        return this.tools;
    }

    public void setTools(final com.commercetools.api.models.mcp_server.McpServerTool... tools) {
        this.tools = new ArrayList<>(Arrays.asList(tools));
    }

    public void setTools(final java.util.List<com.commercetools.api.models.mcp_server.McpServerTool> tools) {
        this.tools = tools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerSetToolsActionImpl that = (McpServerSetToolsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(tools, that.tools)
                .append(action, that.action)
                .append(tools, that.tools)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(tools).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("tools", tools)
                .build();
    }

    @Override
    public McpServerSetToolsAction copyDeep() {
        return McpServerSetToolsAction.deepCopy(this);
    }
}
