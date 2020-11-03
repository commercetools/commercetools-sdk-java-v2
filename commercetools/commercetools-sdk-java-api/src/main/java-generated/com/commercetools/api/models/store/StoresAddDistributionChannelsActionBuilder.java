package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresAddDistributionChannelsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresAddDistributionChannelsActionBuilder {

    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public StoresAddDistributionChannelsActionBuilder distributionChannel( final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    public StoresAddDistributionChannelsAction build() {
        return new StoresAddDistributionChannelsActionImpl(distributionChannel);
    }

    public static StoresAddDistributionChannelsActionBuilder of() {
        return new StoresAddDistributionChannelsActionBuilder();
    }

    public static StoresAddDistributionChannelsActionBuilder of(final StoresAddDistributionChannelsAction template) {
        StoresAddDistributionChannelsActionBuilder builder = new StoresAddDistributionChannelsActionBuilder();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
