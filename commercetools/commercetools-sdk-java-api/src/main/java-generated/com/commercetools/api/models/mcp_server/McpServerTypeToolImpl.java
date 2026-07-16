
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
 *  <p>Describes a single tool available for an MCP Server type and major version.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerTypeToolImpl implements McpServerTypeTool, ModelBase {

    private String name;

    private String description;

    private String operationType;

    private java.util.List<String> groups;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerTypeToolImpl(@JsonProperty("name") final String name,
            @JsonProperty("description") final String description,
            @JsonProperty("operationType") final String operationType,
            @JsonProperty("groups") final java.util.List<String> groups) {
        this.name = name;
        this.description = description;
        this.operationType = operationType;
        this.groups = groups;
    }

    /**
     * create empty instance
     */
    public McpServerTypeToolImpl() {
    }

    /**
     *  <p>Identifier of the tool, such as <code>read_products</code> or <code>create_orders</code>. Matches a value of <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerTool" rel="nofollow">McpServerTool</a>.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Human-readable description of what the tool does. Omitted when no description is available.</p>
     */

    public String getDescription() {
        return this.description;
    }

    /**
     *  <p>Whether the tool reads (<code>read</code>) or modifies (<code>write</code>) data.</p>
     */

    public String getOperationType() {
        return this.operationType;
    }

    /**
     *  <p>Group identifiers the tool belongs to, such as <code>all</code> or <code>read_all</code>. Empty when the tool belongs to no group.</p>
     */

    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setOperationType(final String operationType) {
        this.operationType = operationType;
    }

    public void setGroups(final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
    }

    public void setGroups(final java.util.List<String> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerTypeToolImpl that = (McpServerTypeToolImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(operationType, that.operationType)
                .append(groups, that.groups)
                .append(name, that.name)
                .append(description, that.description)
                .append(operationType, that.operationType)
                .append(groups, that.groups)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(description)
                .append(operationType)
                .append(groups)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("description", description)
                .append("operationType", operationType)
                .append("groups", groups)
                .build();
    }

    @Override
    public McpServerTypeTool copyDeep() {
        return McpServerTypeTool.deepCopy(this);
    }
}
