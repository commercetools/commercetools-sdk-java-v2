
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> is added or set on a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> with missing Channel <code>roles</code>.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Price</a> references a Channel that does not contain the <code>ProductDistribution</code> role.</li>
 *  </ul>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreAddDistributionChannelAction" rel="nofollow">Add Distribution Channel</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetDistributionChannelsAction" rel="nofollow">Set Distribution Channel</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreAddSupplyChannelAction" rel="nofollow">Add Supply Channel</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetSupplyChannelsAction" rel="nofollow">Set Supply Channel</a> update actions.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/standalone-prices:POST" rel="nofollow">Create StandalonePrice</a> request.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingRoleOnChannelErrorImpl implements MissingRoleOnChannelError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MissingRoleOnChannelErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("missingRole") final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.message = message;
        this.values = values;
        this.channel = channel;
        this.missingRole = missingRole;
        this.code = MISSING_ROLE_ON_CHANNEL;
    }

    /**
     * create empty instance
     */
    public MissingRoleOnChannelErrorImpl() {
        this.code = MISSING_ROLE_ON_CHANNEL;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Given channel with $idOrKeyOfChannel does not have the required role $role."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a given <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Prices</a>.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     */

    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole() {
        return this.missingRole;
    }

    public void setMessage(final String message) {
        this.message = message;
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

        MissingRoleOnChannelErrorImpl that = (MissingRoleOnChannelErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(channel, that.channel)
                .append(missingRole, that.missingRole)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(channel, that.channel)
                .append(missingRole, that.missingRole)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(channel)
                .append(missingRole)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("channel", channel)
                .append("missingRole", missingRole)
                .build();
    }

    @Override
    public MissingRoleOnChannelError copyDeep() {
        return MissingRoleOnChannelError.deepCopy(this);
    }
}
