
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreRemoveDistributionChannelActionImpl implements StoreRemoveDistributionChannelAction {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @JsonCreator
    StoreRemoveDistributionChannelActionImpl(
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        this.action = REMOVE_DISTRIBUTION_CHANNEL;
    }

    public StoreRemoveDistributionChannelActionImpl() {
        this.action = REMOVE_DISTRIBUTION_CHANNEL;
    }

    public String getAction() {
        return this.action;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(distributionChannel).toHashCode();
    }

}
