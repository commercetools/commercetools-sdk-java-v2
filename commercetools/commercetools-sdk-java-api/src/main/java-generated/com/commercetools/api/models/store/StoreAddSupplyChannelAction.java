
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreAddSupplyChannelActionImpl.class)
public interface StoreAddSupplyChannelAction extends StoreUpdateAction {

    String ADD_SUPPLY_CHANNEL = "addSupplyChannel";

    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static StoreAddSupplyChannelAction of() {
        return new StoreAddSupplyChannelActionImpl();
    }

    public static StoreAddSupplyChannelAction of(final StoreAddSupplyChannelAction template) {
        StoreAddSupplyChannelActionImpl instance = new StoreAddSupplyChannelActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static StoreAddSupplyChannelActionBuilder builder() {
        return StoreAddSupplyChannelActionBuilder.of();
    }

    public static StoreAddSupplyChannelActionBuilder builder(final StoreAddSupplyChannelAction template) {
        return StoreAddSupplyChannelActionBuilder.of(template);
    }

    default <T> T withStoreAddSupplyChannelAction(Function<StoreAddSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }
}
