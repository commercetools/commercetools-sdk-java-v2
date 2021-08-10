
package com.commercetools.api.models.store;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreAddDistributionChannelActionBuilder implements Builder<StoreAddDistributionChannelAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public StoreAddDistributionChannelActionBuilder distributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public StoreAddDistributionChannelAction build() {
        Objects.requireNonNull(distributionChannel);
        return new StoreAddDistributionChannelActionImpl(distributionChannel);
    }

    /**
     * builds StoreAddDistributionChannelAction without checking for non null required values
     */
    public StoreAddDistributionChannelAction buildUnchecked() {
        return new StoreAddDistributionChannelActionImpl(distributionChannel);
    }

    public static StoreAddDistributionChannelActionBuilder of() {
        return new StoreAddDistributionChannelActionBuilder();
    }

    public static StoreAddDistributionChannelActionBuilder of(final StoreAddDistributionChannelAction template) {
        StoreAddDistributionChannelActionBuilder builder = new StoreAddDistributionChannelActionBuilder();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
