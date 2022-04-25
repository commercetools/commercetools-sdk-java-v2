
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
@JsonDeserialize(as = MyCartSetLineItemDistributionChannelActionImpl.class)
public interface MyCartSetLineItemDistributionChannelAction extends MyCartUpdateAction {

    String SET_LINE_ITEM_DISTRIBUTION_CHANNEL = "setLineItemDistributionChannel";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setLineItemId(final String lineItemId);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static MyCartSetLineItemDistributionChannelAction of() {
        return new MyCartSetLineItemDistributionChannelActionImpl();
    }

    public static MyCartSetLineItemDistributionChannelAction of(
            final MyCartSetLineItemDistributionChannelAction template) {
        MyCartSetLineItemDistributionChannelActionImpl instance = new MyCartSetLineItemDistributionChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder builder() {
        return MyCartSetLineItemDistributionChannelActionBuilder.of();
    }

    public static MyCartSetLineItemDistributionChannelActionBuilder builder(
            final MyCartSetLineItemDistributionChannelAction template) {
        return MyCartSetLineItemDistributionChannelActionBuilder.of(template);
    }

    default <T> T withMyCartSetLineItemDistributionChannelAction(
            Function<MyCartSetLineItemDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemDistributionChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLineItemDistributionChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLineItemDistributionChannelAction>";
            }
        };
    }
}
