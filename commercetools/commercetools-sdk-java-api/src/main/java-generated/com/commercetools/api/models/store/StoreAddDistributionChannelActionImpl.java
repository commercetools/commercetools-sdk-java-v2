
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;

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
 *  <p>This update action produces the StoreDistributionChannelsChanged Message. It has no effect if a given distribution channel is already present in a Store.</p>
 *  <p>Adding a Channel without the <code>ProductDistribution</code> ChannelRoleEnum returns a MissingRoleOnChannel error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddDistributionChannelActionImpl implements StoreAddDistributionChannelAction, ModelBase {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreAddDistributionChannelActionImpl(
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        this.action = ADD_DISTRIBUTION_CHANNEL;
    }

    /**
     * create empty instance
     */
    public StoreAddDistributionChannelActionImpl() {
        this.action = ADD_DISTRIBUTION_CHANNEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to append.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreAddDistributionChannelActionImpl that = (StoreAddDistributionChannelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(distributionChannel, that.distributionChannel)
                .append(action, that.action)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(distributionChannel).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("distributionChannel", distributionChannel)
                .build();
    }

    @Override
    public StoreAddDistributionChannelAction copyDeep() {
        return StoreAddDistributionChannelAction.deepCopy(this);
    }
}
