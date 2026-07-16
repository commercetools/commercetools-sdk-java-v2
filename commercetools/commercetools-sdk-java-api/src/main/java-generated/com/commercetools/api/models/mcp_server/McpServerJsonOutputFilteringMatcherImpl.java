
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
 *  <p>One match group for <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerJsonOutputFiltering" rel="nofollow">McpServerJsonOutputFiltering</a>. Selects fields three ways, each with a fixed case-sensitivity rule. All fields are optional.</p>
 *  <ul>
 *   <li><code>fieldPaths</code>: exact dotted path, for example <code>customer.password</code>. Matched case-sensitively.</li>
 *   <li><code>fieldNames</code>: exact field name at any depth, for example <code>password</code>. Matched case-sensitively.</li>
 *   <li><code>fieldNameContains</code>: substring of a field name at any depth, for example <code>secret</code> catching <code>clientSecret</code>. Matched case-insensitively to widen the net.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerJsonOutputFilteringMatcherImpl implements McpServerJsonOutputFilteringMatcher, ModelBase {

    private java.util.List<String> fieldPaths;

    private java.util.List<String> fieldNames;

    private java.util.List<String> fieldNameContains;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerJsonOutputFilteringMatcherImpl(@JsonProperty("fieldPaths") final java.util.List<String> fieldPaths,
            @JsonProperty("fieldNames") final java.util.List<String> fieldNames,
            @JsonProperty("fieldNameContains") final java.util.List<String> fieldNameContains) {
        this.fieldPaths = fieldPaths;
        this.fieldNames = fieldNames;
        this.fieldNameContains = fieldNameContains;
    }

    /**
     * create empty instance
     */
    public McpServerJsonOutputFilteringMatcherImpl() {
    }

    /**
     *  <p>Exact dotted paths to match, for example <code>customer.password</code>. Matched case-sensitively.</p>
     */

    public java.util.List<String> getFieldPaths() {
        return this.fieldPaths;
    }

    /**
     *  <p>Exact field names to match at any depth, for example <code>password</code>. Matched case-sensitively.</p>
     */

    public java.util.List<String> getFieldNames() {
        return this.fieldNames;
    }

    /**
     *  <p>Substrings to match against field names at any depth, for example <code>secret</code>. Matched case-insensitively.</p>
     */

    public java.util.List<String> getFieldNameContains() {
        return this.fieldNameContains;
    }

    public void setFieldPaths(final String... fieldPaths) {
        this.fieldPaths = new ArrayList<>(Arrays.asList(fieldPaths));
    }

    public void setFieldPaths(final java.util.List<String> fieldPaths) {
        this.fieldPaths = fieldPaths;
    }

    public void setFieldNames(final String... fieldNames) {
        this.fieldNames = new ArrayList<>(Arrays.asList(fieldNames));
    }

    public void setFieldNames(final java.util.List<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public void setFieldNameContains(final String... fieldNameContains) {
        this.fieldNameContains = new ArrayList<>(Arrays.asList(fieldNameContains));
    }

    public void setFieldNameContains(final java.util.List<String> fieldNameContains) {
        this.fieldNameContains = fieldNameContains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerJsonOutputFilteringMatcherImpl that = (McpServerJsonOutputFilteringMatcherImpl) o;

        return new EqualsBuilder().append(fieldPaths, that.fieldPaths)
                .append(fieldNames, that.fieldNames)
                .append(fieldNameContains, that.fieldNameContains)
                .append(fieldPaths, that.fieldPaths)
                .append(fieldNames, that.fieldNames)
                .append(fieldNameContains, that.fieldNameContains)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(fieldPaths).append(fieldNames).append(fieldNameContains).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("fieldPaths", fieldPaths)
                .append("fieldNames", fieldNames)
                .append("fieldNameContains", fieldNameContains)
                .build();
    }

    @Override
    public McpServerJsonOutputFilteringMatcher copyDeep() {
        return McpServerJsonOutputFilteringMatcher.deepCopy(this);
    }
}
