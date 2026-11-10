
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
 *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:ToolCustomization" rel="nofollow">tool customization</a> to remove by its tool name.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveToolCustomizationTargetImpl implements RemoveToolCustomizationTarget, ModelBase {

    private com.commercetools.api.models.mcp_server.McpServerTool tool;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveToolCustomizationTargetImpl(
            @JsonProperty("tool") final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
    }

    /**
     * create empty instance
     */
    public RemoveToolCustomizationTargetImpl() {
    }

    /**
     *  <p>Name of the tool whose customization is removed.</p>
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

        RemoveToolCustomizationTargetImpl that = (RemoveToolCustomizationTargetImpl) o;

        return new EqualsBuilder().append(tool, that.tool).append(tool, that.tool).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tool).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("tool", tool).build();
    }

    @Override
    public RemoveToolCustomizationTarget copyDeep() {
        return RemoveToolCustomizationTarget.deepCopy(this);
    }
}
