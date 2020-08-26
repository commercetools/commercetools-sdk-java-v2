package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresRemoveDistributionChannelsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoresRemoveDistributionChannelsActionBuilder {

    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public StoresRemoveDistributionChannelsActionBuilder distributionChannel( final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    public StoresRemoveDistributionChannelsAction build() {
        return new StoresRemoveDistributionChannelsActionImpl(distributionChannel);
    }

    public static StoresRemoveDistributionChannelsActionBuilder of() {
        return new StoresRemoveDistributionChannelsActionBuilder();
    }

    public static StoresRemoveDistributionChannelsActionBuilder of(final StoresRemoveDistributionChannelsAction template) {
        StoresRemoveDistributionChannelsActionBuilder builder = new StoresRemoveDistributionChannelsActionBuilder();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
