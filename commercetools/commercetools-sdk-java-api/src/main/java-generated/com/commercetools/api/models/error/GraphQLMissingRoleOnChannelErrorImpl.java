
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when one of the following states occur:</p>
 *  <ul>
 *   <li>Channel is added or set on a Store with missing Channel <code>roles</code>.</li>
 *   <li>Standalone Price references a Channel that does not contain the <code>ProductDistribution</code> role.</li>
 *  </ul>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Add Distribution Channel, Set Distribution Channel, Add Supply Channel, and Set Supply Channel update actions.</li>
 *   <li>Create StandalonePrice request.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMissingRoleOnChannelErrorImpl implements GraphQLMissingRoleOnChannelError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLMissingRoleOnChannelErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("missingRole") final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.values = values;
        this.channel = channel;
        this.missingRole = missingRole;
        this.code = MISSING_ROLE_ON_CHANNEL;
    }

    /**
     * create empty instance
     */
    public GraphQLMissingRoleOnChannelErrorImpl() {
        this.code = MISSING_ROLE_ON_CHANNEL;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     */

    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole() {
        return this.missingRole;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
    }

    public void setMissingRole(final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.missingRole = missingRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLMissingRoleOnChannelErrorImpl that = (GraphQLMissingRoleOnChannelErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(channel, that.channel)
                .append(missingRole, that.missingRole)
                .append(code, that.code)
                .append(values, that.values)
                .append(channel, that.channel)
                .append(missingRole, that.missingRole)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(channel).append(missingRole).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("channel", channel)
                .append("missingRole", missingRole)
                .build();
    }

    @Override
    public GraphQLMissingRoleOnChannelError copyDeep() {
        return GraphQLMissingRoleOnChannelError.deepCopy(this);
    }
}
