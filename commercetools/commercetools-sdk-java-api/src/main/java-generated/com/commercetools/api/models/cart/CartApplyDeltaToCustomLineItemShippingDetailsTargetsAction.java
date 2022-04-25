
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl.class)
public interface CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction extends CartUpdateAction {

    String APPLY_DELTA_TO_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_TARGETS = "applyDeltaToCustomLineItemShippingDetailsTargets";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("targetsDelta")
    public List<ItemShippingTarget> getTargetsDelta();

    public void setCustomLineItemId(final String customLineItemId);

    @JsonIgnore
    public void setTargetsDelta(final ItemShippingTarget... targetsDelta);

    public void setTargetsDelta(final List<ItemShippingTarget> targetsDelta);

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction of() {
        return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
    }

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction of(
            final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl instance = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTargetsDelta(template.getTargetsDelta());
        return instance;
    }

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder() {
        return CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder.of();
    }

    public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder(
            final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
        return CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder.of(template);
    }

    default <T> T withCartApplyDeltaToCustomLineItemShippingDetailsTargetsAction(
            Function<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction>";
            }
        };
    }
}
