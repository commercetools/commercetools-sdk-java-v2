
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
 *  <p>This action has no effect if a given distribution channel is already present in a Store.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddDistributionChannelActionImpl implements StoreAddDistributionChannelAction, ModelBase {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @JsonCreator
    StoreAddDistributionChannelActionImpl(
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        this.action = ADD_DISTRIBUTION_CHANNEL;
    }

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
     *  <p>Value to append. Any attempt to use Channel without the <code>ProductDistribution</code> ChannelRoleEnum will fail with a MissingRoleOnChannelError error.</p>
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(distributionChannel).toHashCode();
    }

}
