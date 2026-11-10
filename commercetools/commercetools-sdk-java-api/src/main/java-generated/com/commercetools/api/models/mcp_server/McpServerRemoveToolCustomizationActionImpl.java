
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
 *  <p>Removes the <a href="https://docs.commercetools.com/apis/ctp:api:type:ToolCustomization" rel="nofollow">tool customization</a> matching the given tool name. Has no effect if no customization exists for that tool.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerRemoveToolCustomizationActionImpl implements McpServerRemoveToolCustomizationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget toolCustomization;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerRemoveToolCustomizationActionImpl(
            @JsonProperty("toolCustomization") final com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget toolCustomization) {
        this.toolCustomization = toolCustomization;
        this.action = REMOVE_TOOL_CUSTOMIZATION;
    }

    /**
     * create empty instance
     */
    public McpServerRemoveToolCustomizationActionImpl() {
        this.action = REMOVE_TOOL_CUSTOMIZATION;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Identifies the tool customization to remove by its tool name.</p>
     */

    public com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget getToolCustomization() {
        return this.toolCustomization;
    }

    public void setToolCustomization(
            final com.commercetools.api.models.mcp_server.RemoveToolCustomizationTarget toolCustomization) {
        this.toolCustomization = toolCustomization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerRemoveToolCustomizationActionImpl that = (McpServerRemoveToolCustomizationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(toolCustomization, that.toolCustomization)
                .append(action, that.action)
                .append(toolCustomization, that.toolCustomization)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(toolCustomization).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("toolCustomization", toolCustomization)
                .build();
    }

    @Override
    public McpServerRemoveToolCustomizationAction copyDeep() {
        return McpServerRemoveToolCustomizationAction.deepCopy(this);
    }
}
