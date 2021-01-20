
package com.commercetools.api.models.store;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreRemoveDistributionChannelActionImpl;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreRemoveDistributionChannelActionImpl.class)
public interface StoreRemoveDistributionChannelAction extends StoreUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StoreRemoveDistributionChannelAction of() {
        return new StoreRemoveDistributionChannelActionImpl();
    }

    public static StoreRemoveDistributionChannelAction of(final StoreRemoveDistributionChannelAction template) {
        StoreRemoveDistributionChannelActionImpl instance = new StoreRemoveDistributionChannelActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StoreRemoveDistributionChannelActionBuilder builder() {
        return StoreRemoveDistributionChannelActionBuilder.of();
    }

    public static StoreRemoveDistributionChannelActionBuilder builder(
            final StoreRemoveDistributionChannelAction template) {
        return StoreRemoveDistributionChannelActionBuilder.of(template);
    }

    default <T> T withStoreRemoveDistributionChannelAction(Function<StoreRemoveDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }
}
