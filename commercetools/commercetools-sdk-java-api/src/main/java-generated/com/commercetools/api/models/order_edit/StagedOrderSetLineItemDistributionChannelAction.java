
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemDistributionChannelActionImpl.class)
public interface StagedOrderSetLineItemDistributionChannelAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_DISTRIBUTION_CHANNEL = "setLineItemDistributionChannel";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setLineItemId(final String lineItemId);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StagedOrderSetLineItemDistributionChannelAction of() {
        return new StagedOrderSetLineItemDistributionChannelActionImpl();
    }

    public static StagedOrderSetLineItemDistributionChannelAction of(
            final StagedOrderSetLineItemDistributionChannelAction template) {
        StagedOrderSetLineItemDistributionChannelActionImpl instance = new StagedOrderSetLineItemDistributionChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StagedOrderSetLineItemDistributionChannelActionBuilder builder() {
        return StagedOrderSetLineItemDistributionChannelActionBuilder.of();
    }

    public static StagedOrderSetLineItemDistributionChannelActionBuilder builder(
            final StagedOrderSetLineItemDistributionChannelAction template) {
        return StagedOrderSetLineItemDistributionChannelActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemDistributionChannelAction(
            Function<StagedOrderSetLineItemDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }
}
