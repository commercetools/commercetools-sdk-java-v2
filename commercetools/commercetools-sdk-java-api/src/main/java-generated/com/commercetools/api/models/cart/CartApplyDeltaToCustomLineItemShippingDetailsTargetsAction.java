package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ItemShippingTarget;
import com.commercetools.api.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl;

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
@JsonDeserialize(as = CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class)
public interface CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("targetsDelta")
    public List<ItemShippingTarget> getTargetsDelta();

    public void setCustomLineItemId(final String customLineItemId);
    
    @JsonIgnore
    public void setTargetsDelta(final ItemShippingTarget ...targetsDelta);
    public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl of(){
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
    }
    

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl of(final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTargetsDelta(template.getTargetsDelta());
        return instance;
    }

    default <T> T withCartApplyDeltaToCustomLineItemShippingDetailsTargetsAction(Function<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction, T> helper) {
        return helper.apply(this);
    }
}
