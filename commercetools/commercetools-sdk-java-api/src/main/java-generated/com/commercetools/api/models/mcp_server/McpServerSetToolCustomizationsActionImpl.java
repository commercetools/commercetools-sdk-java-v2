
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
 *  <p>Replaces the entire list of <a href="https://docs.commercetools.com/apis/ctp:api:type:ToolCustomization" rel="nofollow">tool customizations</a> on the MCP Server.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetToolCustomizationsActionImpl implements McpServerSetToolCustomizationsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> toolCustomizations;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerSetToolCustomizationsActionImpl(
            @JsonProperty("toolCustomizations") final java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> toolCustomizations) {
        this.toolCustomizations = toolCustomizations;
        this.action = SET_TOOL_CUSTOMIZATIONS;
    }

    /**
     * create empty instance
     */
    public McpServerSetToolCustomizationsActionImpl() {
        this.action = SET_TOOL_CUSTOMIZATIONS;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New list of tool customizations. Replaces the existing list entirely.</p>
     */

    public java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> getToolCustomizations() {
        return this.toolCustomizations;
    }

    public void setToolCustomizations(
            final com.commercetools.api.models.mcp_server.ToolCustomization... toolCustomizations) {
        this.toolCustomizations = new ArrayList<>(Arrays.asList(toolCustomizations));
    }

    public void setToolCustomizations(
            final java.util.List<com.commercetools.api.models.mcp_server.ToolCustomization> toolCustomizations) {
        this.toolCustomizations = toolCustomizations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerSetToolCustomizationsActionImpl that = (McpServerSetToolCustomizationsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(toolCustomizations, that.toolCustomizations)
                .append(action, that.action)
                .append(toolCustomizations, that.toolCustomizations)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(toolCustomizations).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("toolCustomizations", toolCustomizations)
                .build();
    }

    @Override
    public McpServerSetToolCustomizationsAction copyDeep() {
        return McpServerSetToolCustomizationsAction.deepCopy(this);
    }
}
