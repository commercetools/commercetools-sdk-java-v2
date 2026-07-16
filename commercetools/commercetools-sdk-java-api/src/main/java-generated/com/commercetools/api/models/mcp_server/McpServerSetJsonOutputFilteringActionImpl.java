
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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:McpServerJsonOutputFiltering" rel="nofollow">response field-filtering rules</a> applied to tool responses.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetJsonOutputFilteringActionImpl implements McpServerSetJsonOutputFilteringAction, ModelBase {

    private String action;

    private com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering jsonOutputFiltering;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerSetJsonOutputFilteringActionImpl(
            @JsonProperty("jsonOutputFiltering") final com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering jsonOutputFiltering) {
        this.jsonOutputFiltering = jsonOutputFiltering;
        this.action = SET_JSON_OUTPUT_FILTERING;
    }

    /**
     * create empty instance
     */
    public McpServerSetJsonOutputFilteringActionImpl() {
        this.action = SET_JSON_OUTPUT_FILTERING;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. The existing configuration is entirely replaced with this value. If absent, the existing filtering configuration is removed.</p>
     */

    public com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering getJsonOutputFiltering() {
        return this.jsonOutputFiltering;
    }

    public void setJsonOutputFiltering(
            final com.commercetools.api.models.mcp_server.McpServerJsonOutputFiltering jsonOutputFiltering) {
        this.jsonOutputFiltering = jsonOutputFiltering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerSetJsonOutputFilteringActionImpl that = (McpServerSetJsonOutputFilteringActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(jsonOutputFiltering, that.jsonOutputFiltering)
                .append(action, that.action)
                .append(jsonOutputFiltering, that.jsonOutputFiltering)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(jsonOutputFiltering).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("jsonOutputFiltering", jsonOutputFiltering)
                .build();
    }

    @Override
    public McpServerSetJsonOutputFilteringAction copyDeep() {
        return McpServerSetJsonOutputFilteringAction.deepCopy(this);
    }
}
