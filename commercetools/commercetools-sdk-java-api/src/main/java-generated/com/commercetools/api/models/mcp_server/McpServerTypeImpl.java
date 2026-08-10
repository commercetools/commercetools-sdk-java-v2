
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
 *  <p>Describes an MCP Server type and one of its major versions, including the catalog of tools available for it. Use this catalog to discover which tools you can enable on a <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServer" rel="nofollow">McpServer</a> of this type.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerTypeImpl implements McpServerType, ModelBase {

    private String type;

    private String majorVersion;

    private java.util.List<com.commercetools.api.models.mcp_server.McpServerTypeTool> tools;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerTypeImpl(@JsonProperty("type") final String type, @JsonProperty("majorVersion") final String majorVersion,
            @JsonProperty("tools") final java.util.List<com.commercetools.api.models.mcp_server.McpServerTypeTool> tools) {
        this.type = type;
        this.majorVersion = majorVersion;
        this.tools = tools;
    }

    /**
     * create empty instance
     */
    public McpServerTypeImpl() {
    }

    /**
     *  <p>Identifier of the MCP Server type, such as <code>CommerceMCP</code>.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Major version of the MCP Server type, such as <code>v4</code>.</p>
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     *  <p>Tools available for this MCP Server type and major version.</p>
     */

    public java.util.List<com.commercetools.api.models.mcp_server.McpServerTypeTool> getTools() {
        return this.tools;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setMajorVersion(final String majorVersion) {
        this.majorVersion = majorVersion;
    }

    public void setTools(final com.commercetools.api.models.mcp_server.McpServerTypeTool... tools) {
        this.tools = new ArrayList<>(Arrays.asList(tools));
    }

    public void setTools(final java.util.List<com.commercetools.api.models.mcp_server.McpServerTypeTool> tools) {
        this.tools = tools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerTypeImpl that = (McpServerTypeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(majorVersion, that.majorVersion)
                .append(tools, that.tools)
                .append(type, that.type)
                .append(majorVersion, that.majorVersion)
                .append(tools, that.tools)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(majorVersion).append(tools).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("majorVersion", majorVersion)
                .append("tools", tools)
                .build();
    }

    @Override
    public McpServerType copyDeep() {
        return McpServerType.deepCopy(this);
    }
}
