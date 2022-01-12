
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyCartSetLineItemSupplyChannelActionImpl.class)
public interface MyCartSetLineItemSupplyChannelAction extends MyCartUpdateAction {

    String SET_LINE_ITEM_SUPPLY_CHANNEL = "setLineItemSupplyChannel";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setLineItemId(final String lineItemId);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static MyCartSetLineItemSupplyChannelAction of() {
        return new MyCartSetLineItemSupplyChannelActionImpl();
    }

    public static MyCartSetLineItemSupplyChannelAction of(final MyCartSetLineItemSupplyChannelAction template) {
        MyCartSetLineItemSupplyChannelActionImpl instance = new MyCartSetLineItemSupplyChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder builder() {
        return MyCartSetLineItemSupplyChannelActionBuilder.of();
    }

    public static MyCartSetLineItemSupplyChannelActionBuilder builder(
            final MyCartSetLineItemSupplyChannelAction template) {
        return MyCartSetLineItemSupplyChannelActionBuilder.of(template);
    }

    default <T> T withMyCartSetLineItemSupplyChannelAction(Function<MyCartSetLineItemSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }
}
