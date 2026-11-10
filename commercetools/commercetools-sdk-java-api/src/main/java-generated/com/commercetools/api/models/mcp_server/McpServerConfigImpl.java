
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
 *  <p>Connection configuration of an MCP Server. The <code>type</code> discriminator determines the concrete configuration shape and the set of tools available for this MCP Server. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:CommerceMcpServerConfig" rel="nofollow">CommerceMcpServerConfig</a> is supported.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class McpServerConfigImpl implements McpServerConfig, ModelBase {

    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    McpServerConfigImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }

    /**
     * create empty instance
     */
    public McpServerConfigImpl() {
    }

    /**
     *  <p>MCP Server type. Determines the shape of the configuration and the set of tools available for this MCP Server.</p>
     */

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        McpServerConfigImpl that = (McpServerConfigImpl) o;

        return new EqualsBuilder().append(type, that.type).append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type).build();
    }

    @Override
    public McpServerConfig copyDeep() {
        return McpServerConfig.deepCopy(this);
    }
}
