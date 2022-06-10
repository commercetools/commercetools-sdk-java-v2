
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

/**
 * StoreSetDistributionChannelsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetDistributionChannelsActionImpl implements StoreSetDistributionChannelsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    @JsonCreator
    StoreSetDistributionChannelsActionImpl(
            @JsonProperty("distributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        this.action = SET_DISTRIBUTION_CHANNELS;
    }

    public StoreSetDistributionChannelsActionImpl() {
        this.action = SET_DISTRIBUTION_CHANNELS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset. Any attempt to use Channel without the <code>ProductDistribution</code> ChannelRoleEnum will fail with a MissingRoleOnChannel error.</p>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels() {
        return this.distributionChannels;
    }

    public void setDistributionChannels(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
    }

    public void setDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetDistributionChannelsActionImpl that = (StoreSetDistributionChannelsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(distributionChannels, that.distributionChannels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(distributionChannels).toHashCode();
    }

}
