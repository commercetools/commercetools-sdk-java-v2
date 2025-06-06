
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
 *  <p>This update action produces the StoreDistributionChannelsChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveDistributionChannelActionImpl implements StoreRemoveDistributionChannelAction, ModelBase {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreRemoveDistributionChannelActionImpl(
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        this.action = REMOVE_DISTRIBUTION_CHANNEL;
    }

    /**
     * create empty instance
     */
    public StoreRemoveDistributionChannelActionImpl() {
        this.action = REMOVE_DISTRIBUTION_CHANNEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>ProductDistribution</code> ChannelRoleEnum.</p>
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

        StoreRemoveDistributionChannelActionImpl that = (StoreRemoveDistributionChannelActionImpl) o;

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
    public StoreRemoveDistributionChannelAction copyDeep() {
        return StoreRemoveDistributionChannelAction.deepCopy(this);
    }
}
