
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
 *  <p>Customization applied to a single tool at <code>tools/list</code> and <code>tools/call</code> time. At least one of <code>description</code> or a non-empty <code>parameters</code> list must be present; a customization with neither has no effect and is rejected. Parameter names within <code>parameters</code> must be unique.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ToolCustomizationImpl implements ToolCustomization, ModelBase {

    private com.commercetools.api.models.mcp_server.McpServerTool tool;

    private String description;

    private java.util.List<com.commercetools.api.models.mcp_server.ParameterOverride> parameters;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ToolCustomizationImpl(@JsonProperty("tool") final com.commercetools.api.models.mcp_server.McpServerTool tool,
            @JsonProperty("description") final String description,
            @JsonProperty("parameters") final java.util.List<com.commercetools.api.models.mcp_server.ParameterOverride> parameters) {
        this.tool = tool;
        this.description = description;
        this.parameters = parameters;
    }

    /**
     * create empty instance
     */
    public ToolCustomizationImpl() {
    }

    /**
     *  <p>Name of the tool to customize, such as <code>read_products</code> or <code>create_orders</code>. Must be one of the tools enabled on the MCP Server.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerTool getTool() {
        return this.tool;
    }

    /**
     *  <p>Replacement description for the tool, shown to the AI agent.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Overrides applied to individual parameters of the tool's input schema.</p>
     */

    public java.util.List<com.commercetools.api.models.mcp_server.ParameterOverride> getParameters() {
        return this.parameters;
    }

    public void setTool(final com.commercetools.api.models.mcp_server.McpServerTool tool) {
        this.tool = tool;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setParameters(final com.commercetools.api.models.mcp_server.ParameterOverride... parameters) {
        this.parameters = new ArrayList<>(Arrays.asList(parameters));
    }

    public void setParameters(
            final java.util.List<com.commercetools.api.models.mcp_server.ParameterOverride> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ToolCustomizationImpl that = (ToolCustomizationImpl) o;

        return new EqualsBuilder().append(tool, that.tool)
                .append(description, that.description)
                .append(parameters, that.parameters)
                .append(tool, that.tool)
                .append(description, that.description)
                .append(parameters, that.parameters)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tool).append(description).append(parameters).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("tool", tool)
                .append("description", description)
                .append("parameters", parameters)
                .build();
    }

    @Override
    public ToolCustomization copyDeep() {
        return ToolCustomization.deepCopy(this);
    }
}
