
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
 *  <p>Response field-filtering rules applied to <code>tools/call</code> results on the MCP Server. Every field is optional; an empty object filters nothing.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerJsonOutputFilteringImpl implements McpServerJsonOutputFiltering, ModelBase {

    private com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher redact;

    private com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher drop;

    private java.util.List<String> fieldPathsToKeep;

    private String redactedWith;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerJsonOutputFilteringImpl(
            @JsonProperty("redact") final com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher redact,
            @JsonProperty("drop") final com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher drop,
            @JsonProperty("fieldPathsToKeep") final java.util.List<String> fieldPathsToKeep,
            @JsonProperty("redactedWith") final String redactedWith) {
        this.redact = redact;
        this.drop = drop;
        this.fieldPathsToKeep = fieldPathsToKeep;
        this.redactedWith = redactedWith;
    }

    /**
     * create empty instance
     */
    public McpServerJsonOutputFilteringImpl() {
    }

    /**
     *  <p>Fields whose values are replaced with a placeholder. The field itself is kept.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher getRedact() {
        return this.redact;
    }

    /**
     *  <p>Fields that are removed entirely from the response.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher getDrop() {
        return this.drop;
    }

    /**
     *  <p>Exact dotted paths kept even when they would otherwise match <code>redact</code> or <code>drop</code>.</p>
     */

    public java.util.List<String> getFieldPathsToKeep() {
        return this.fieldPathsToKeep;
    }

    /**
     *  <p>Placeholder written in place of redacted values. When unset, the MCP Server applies its own default (<code>[REDACTED]</code>).</p>
     */

    public String getRedactedWith() {
        return this.redactedWith;
    }

    public void setRedact(final com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher redact) {
        this.redact = redact;
    }

    public void setDrop(final com.commercetools.api.models.mcp_server.McpServerJsonOutputFilteringMatcher drop) {
        this.drop = drop;
    }

    public void setFieldPathsToKeep(final String... fieldPathsToKeep) {
        this.fieldPathsToKeep = new ArrayList<>(Arrays.asList(fieldPathsToKeep));
    }

    public void setFieldPathsToKeep(final java.util.List<String> fieldPathsToKeep) {
        this.fieldPathsToKeep = fieldPathsToKeep;
    }

    public void setRedactedWith(final String redactedWith) {
        this.redactedWith = redactedWith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerJsonOutputFilteringImpl that = (McpServerJsonOutputFilteringImpl) o;

        return new EqualsBuilder().append(redact, that.redact)
                .append(drop, that.drop)
                .append(fieldPathsToKeep, that.fieldPathsToKeep)
                .append(redactedWith, that.redactedWith)
                .append(redact, that.redact)
                .append(drop, that.drop)
                .append(fieldPathsToKeep, that.fieldPathsToKeep)
                .append(redactedWith, that.redactedWith)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(redact)
                .append(drop)
                .append(fieldPathsToKeep)
                .append(redactedWith)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("redact", redact)
                .append("drop", drop)
                .append("fieldPathsToKeep", fieldPathsToKeep)
                .append("redactedWith", redactedWith)
                .build();
    }

    @Override
    public McpServerJsonOutputFiltering copyDeep() {
        return McpServerJsonOutputFiltering.deepCopy(this);
    }
}
