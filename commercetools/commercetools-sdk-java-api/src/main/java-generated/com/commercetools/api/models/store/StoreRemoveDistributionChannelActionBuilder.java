
package com.commercetools.api.models.store;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreRemoveDistributionChannelActionBuilder {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public StoreRemoveDistributionChannelActionBuilder distributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public StoreRemoveDistributionChannelAction build() {
        return new StoreRemoveDistributionChannelActionImpl(distributionChannel);
    }

    public static StoreRemoveDistributionChannelActionBuilder of() {
        return new StoreRemoveDistributionChannelActionBuilder();
    }

    public static StoreRemoveDistributionChannelActionBuilder of(final StoreRemoveDistributionChannelAction template) {
        StoreRemoveDistributionChannelActionBuilder builder = new StoreRemoveDistributionChannelActionBuilder();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
