
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
 *  <p>Adds a single tool to the MCP Server's list of enabled tools. Has no effect if the tool is already present.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerAddToolActionImpl implements McpServerAddToolAction, ModelBase {

    private String action;

    private com.commercetools.api.models.mcp_server.McpServerTool tool;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerAddToolActionImpl(@JsonProperty("tool") final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
        this.action = ADD_TOOL;
    }

    /**
     * create empty instance
     */
    public McpServerAddToolActionImpl() {
        this.action = ADD_TOOL;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the tool to add, such as <code>read_products</code> or <code>create_orders</code>.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerTool getTool() {
        return this.tool;
    }

    public void setTool(final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerAddToolActionImpl that = (McpServerAddToolActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(tool, that.tool)
                .append(action, that.action)
                .append(tool, that.tool)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(tool).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("tool", tool)
                .build();
    }

    @Override
    public McpServerAddToolAction copyDeep() {
        return McpServerAddToolAction.deepCopy(this);
    }
}
