
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
 *  <p>Sets the localized description of the MCP Server.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerSetDescriptionActionImpl implements McpServerSetDescriptionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString description;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerSetDescriptionActionImpl(
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        this.action = SET_DESCRIPTION;
    }

    /**
     * create empty instance
     */
    public McpServerSetDescriptionActionImpl() {
        this.action = SET_DESCRIPTION;
    }

    /**
     *  <p>Identifies the update action to perform, such as <code>addTool</code>, <code>removeTool</code>, or <code>setTools</code>.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If omitted, the existing description is removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerSetDescriptionActionImpl that = (McpServerSetDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(description, that.description)
                .append(action, that.action)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(description).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("description", description)
                .build();
    }

    @Override
    public McpServerSetDescriptionAction copyDeep() {
        return McpServerSetDescriptionAction.deepCopy(this);
    }
}
