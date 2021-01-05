package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.cart.CartSetLineItemDistributionChannelActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartSetLineItemDistributionChannelActionImpl.class)
public interface CartSetLineItemDistributionChannelAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setLineItemId(final String lineItemId);
    
    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static CartSetLineItemDistributionChannelAction of(){
        return new CartSetLineItemDistributionChannelActionImpl();
    }
    

    public static CartSetLineItemDistributionChannelAction of(final CartSetLineItemDistributionChannelAction template) {
        CartSetLineItemDistributionChannelActionImpl instance = new CartSetLineItemDistributionChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static CartSetLineItemDistributionChannelActionBuilder builder(){
        return CartSetLineItemDistributionChannelActionBuilder.of();
    }
    
    public static CartSetLineItemDistributionChannelActionBuilder builder(final CartSetLineItemDistributionChannelAction template){
        return CartSetLineItemDistributionChannelActionBuilder.of(template);
    }
    

    default <T> T withCartSetLineItemDistributionChannelAction(Function<CartSetLineItemDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }
}
